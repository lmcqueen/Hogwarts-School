/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.model.Location;
import byui.cit260.hogwartsschool.model.Map;
import hogwartsschool.HogwartsSchool;
import java.io.PrintWriter;

/**
 *
 * @author lmcqueen
 */
public class MapPrintView extends View {

    private static PrintWriter mapPrintFile = null;
    static PrintWriter inventoryPrintFile;

    public MapPrintView() {
        super("Please enter where you would like to save your map print: \n");
    }

    @Override
    public void display() {
        this.console.println(this.getPromptMessage());
        String filePath = this.getInput();

        if (this.doAction(filePath)) {
            this.console.println("You have successfully printed the map to " + filePath);
        } else {
            this.console.println("Unable to print map");
        }

    }

    @Override
    public boolean doAction(Object obj) {

        String filePath = (String) obj;

        try {
            MapPrintView.mapPrintFile = new PrintWriter(filePath);

            Map map = HogwartsSchool.getCurrentGame().getMap();
            if (map == null) {
                ErrorView.display(this.getClass().getName(), "Map did not exist");
                return false;
            }

            Location[][] locations = map.getLocations();
            if (locations == null) {
                ErrorView.display(this.getClass().getName(), "Locations had a null value");
                return false;
            }
            int rowCount = map.getRowCount();
            int columnCount = map.getColumnCount();

            Location currentLocation = HogwartsSchool.getPlayer().getLocation();
            Location location;
            MapPrintView.mapPrintFile.println("\n\n  1    2    3    4    5");
            for (int i = 0; i < rowCount; i++) {
                MapPrintView.mapPrintFile.print(i + 1);
                MapPrintView.mapPrintFile.println("========================");
                for (int j = 0; j < columnCount; j++) {
                    MapPrintView.mapPrintFile.print("|");
                    location = locations[i][j];
                    if (location.equals(currentLocation)) {
                        MapPrintView.mapPrintFile.print("HERE");
                    } else if (location.getScene().isVisited()) {
                        MapPrintView.mapPrintFile.print(location.getScene().getMapSymbol());
                    } else {
                        MapPrintView.mapPrintFile.print(" ?? ");
                    }
                }
                MapPrintView.mapPrintFile.println("|");
            }
            MapPrintView.mapPrintFile.println("========================");
        } catch (Throwable te) {
            ErrorView.display(this.getClass().getName(), te.getMessage());
        } finally {

            if (MapPrintView.mapPrintFile != null) {
                MapPrintView.mapPrintFile.close();
                return true;
            } else {
                ErrorView.display(this.getClass().getName(), "Could not close file");
                return false;
            }

        }

    }

}
