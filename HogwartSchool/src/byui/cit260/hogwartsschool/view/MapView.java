/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.MapControl;
import byui.cit260.hogwartsschool.exceptions.MapControlException;
import byui.cit260.hogwartsschool.model.Location;
import byui.cit260.hogwartsschool.model.Map;
import hogwartsschool.HogwartsSchool;

/**
 *
 * @author lmcqueen
 */
public class MapView extends View{
    
    public MapView() {
        super("\n Map menu: U - Move up one space"
                + "\n D - Move down one space"
                + "\n R - Move Right one space"
                + "\n L - Move Left one space"
                + "\n E - Exit to game menu");
    }
   
    @Override
    public void display() {

        String value = "";
        boolean done = false;

        do {
            this.printMap();
            this.console.println(getPromptMessage());
            value = this.getInput();
            done = this.doAction(value);

        } while (!done);

    }
    
   @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase();
        if(value.length() > 1){
            ErrorView.display(this.getClass().getName(), "\n *** Invalid Selection. Enter only a single character. ***\n");
            return false;
        }
        
        char selection = value.charAt(0);
        
        switch (selection) {
            case 'U': 
                this.moveUp();
                break;
            case 'D':
                this.moveDown();
                break;
            case 'L':
                this.moveLeft();
                break;
            case 'R':
                this.moveRight();
                break;
            case 'E':
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection. Try again. ***");
                break;  
        } 
        
        return false;
 }    
    
   
    public void printMap () {
        
        Map map = HogwartsSchool.getCurrentGame().getMap();
        Location currentLocation = HogwartsSchool.getPlayer().getLocation();
        if(map == null){
            ErrorView.display(this.getClass().getName(), "Map did not exist");
        }
        
        Location[][] locations = map.getLocations();
        int rowCount = map.getRowCount();
        int columnCount = map.getColumnCount();
        
        this.console.println("View Map");
        this.console.println("Legend: \nHalways = **** \nLocation that has not been visited = ??  \nVisited Locations = First 2 characters of "
                + "location name  \nGreat Hall = XX");
        Location location;
        this.console.println("\n\n  1    2    3    4    5");
        for(int i = 0; i < rowCount; i++){
            this.console.print(i + 1);
            this.console.println("========================");
            for(int j = 0; j < columnCount; j++){
                this.console.print("|");
                location = locations[i][j];
                if(location.equals(currentLocation)){
                    this.console.print("HERE");
                }
                else if(location.getScene().isVisited()){
                    this.console.print(location.getScene().getMapSymbol());
                }
                else{
                    this.console.print(" ?? ");
                }
            }
            this.console.println("|");
        }
        this.console.println("========================");
    }

    private void moveDown() {
        
        Location currentLocation = HogwartsSchool.getCurrentGame().getPlayer().getLocation();
        
        try {
            MapControl.movePlayer(currentLocation.getRow() + 1, currentLocation.getColumn());
            this.console.println("Your character has moved to a " + HogwartsSchool.getPlayer().getLocation().getScene().getSceneType());
        } catch (MapControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

    private void moveLeft() {
         
        Location currentLocation = HogwartsSchool.getCurrentGame().getPlayer().getLocation();
        
        try {
            MapControl.movePlayer(currentLocation.getRow(), currentLocation.getColumn() - 1);
            this.console.println("Your character has moved to a " + HogwartsSchool.getPlayer().getLocation().getScene().getSceneType());
        } catch (MapControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

    private void moveRight() {
         
        Location currentLocation = HogwartsSchool.getCurrentGame().getPlayer().getLocation();
        
        try {
            MapControl.movePlayer(currentLocation.getRow(), currentLocation.getColumn() + 1);
            this.console.println("Your character has moved to a " + HogwartsSchool.getPlayer().getLocation().getScene().getSceneType());
        } catch (MapControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

    private void moveUp() {
         
        Location currentLocation = HogwartsSchool.getCurrentGame().getPlayer().getLocation();
        
        try {
            MapControl.movePlayer(currentLocation.getRow() - 1, currentLocation.getColumn());
            this.console.println("Your character has moved to a " + HogwartsSchool.getPlayer().getLocation().getScene().getSceneType());
        } catch (MapControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

    
    
    
  
}
