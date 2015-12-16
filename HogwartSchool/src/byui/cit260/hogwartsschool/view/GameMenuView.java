package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.GameControl;
import byui.cit260.hogwartsschool.control.HouseControl;
import byui.cit260.hogwartsschool.control.InventoryControl;
import byui.cit260.hogwartsschool.control.MerchandiseControl;
import byui.cit260.hogwartsschool.exceptions.GameControlException;
import byui.cit260.hogwartsschool.exceptions.HouseControlException;
import byui.cit260.hogwartsschool.exceptions.InventoryControlException;
import byui.cit260.hogwartsschool.exceptions.MerchandiseControlException;
import byui.cit260.hogwartsschool.model.Course;
import byui.cit260.hogwartsschool.model.House;
import byui.cit260.hogwartsschool.model.InventoryItem;
import byui.cit260.hogwartsschool.model.Merchandise;
import byui.cit260.hogwartsschool.model.Scene;
import hogwartsschool.HogwartsSchool;

/**
 *
 * @author lmcqueen
 */
class GameMenuView extends View {

    public GameMenuView() {
        super("\n------------------------------------------------"
                + "\n|               Game Menu                      |"
                + "\n------------------------------------------------"
                + "\nV - View map"
                + "\nP - View current points"
                + "\nM - Move to a new location"
                + "\nE - Explore the area"
                + "\nN - View Notes"
                + "\nT - Take Notes"
                + "\nX - Take Exam"
                + "\nI - View Inventory"
                + "\nS - View Store"
                + "\nF - Print Map to File"
                + "\nB - Print Inventory to File"
                + "\nH - Help"
                + "\nQ - Quit"
                + "\n------------------------------------------------");
    }

    @Override
    public void display() {

        String value = "";
        boolean done = false;

        do {
            if (HogwartsSchool.getCurrentGame().isFinished() == false) {
                this.console.println(getPromptMessage());
                value = this.getInput();
                done = this.doAction(value);
            } else {
                done = true;
            }
        } while (!done);
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;
        value = value.toUpperCase();
        if (value.length() > 1) {
            ErrorView.display(this.getClass().getName(), "\n *** Invalid Selection. Enter only a single character. ***\n");
            return false;
        }

        char selection = value.charAt(0);

        switch (selection) {
            case 'V':
                this.viewMap();
                break;
            case 'F':
                this.printMapToFile();
                break;
            case 'B':
                this.printInventory();
                break;
            case 'P':
                this.viewCurrentPoints();
                break;
            case 'I':
                this.viewInventory();
                break;
            case 'M':
                this.moveLocation();
                break;
            case 'E':
                this.exploreArea();
                break;
            case 'N':
                this.viewNotes();
                break;
            case 'T':
                this.takeNotes();
                break;
            case 'X':
                this.takeExam();
                break;
            case 'H':
                this.getHelp();
                break;
            case 'S':
                this.viewStore();
                break;
            case 'Q':
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection. Try again. ***");
                break;
        }

        return false;
    }

    private void viewMap() {
        MapView map = new MapView();
        map.printMap();
    }

    private void viewCurrentPoints() {
        House[] houses;
        try {
            houses = HouseControl.getSortedHouses();

            this.console.println("\n------------------------------------------------"
                    + "\n|               View House Points               |"
                    + "\n------------------------------------------------");
            this.console.println("House\t\tPoints");

            for (House house : houses) {
                this.console.println(house.getName() + "\t" + house.getPoints());
            }
        } catch (HouseControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

    private void moveLocation() {
        MapView moveLocation = new MapView();
        moveLocation.display();
    }

    private void exploreArea() {
        Scene curScene = HogwartsSchool.getPlayer().getLocation().getScene();
        this.console.println(curScene.getDescription());

        if (curScene.getSceneType().equals("classroom")) {
            this.console.println(curScene.getCourse().getLecture());
            this.createNewClass(curScene);
        } else if (curScene.getSceneType().equals("hallway")) {
            String getInput = this.getInput();
            boolean done = false;
            getInput = getInput.toUpperCase();

            while (!done) {
                if (getInput.equals("Y")) {
                    this.console.println(curScene.getCharacter().getDescription());
                    done = true;
                } else if (getInput.endsWith("N")) {
                    break;
                } else {
                    ErrorView.display(this.getClass().getName(), "You didn't enter Y or N");
                }
            }
        } else if (curScene.getSceneType().equals("activity")) {
            if (curScene.getMapSymbol().equals(" QU ")) {
                QuidditchView quidditch = new QuidditchView();
                quidditch.display();
            } else if (curScene.getMapSymbol().equals(" BA ")) {

            } else {
                ErrorView.display(this.getClass().getName(), "Could not find activity");
            }
        } else if (curScene.getSceneType().equals("greatHall")) {

        }

    }

    private void createNewClass(Scene curScene) {

        int course = curScene.getCourse().ordinal();

        if (course == Course.Ancient.ordinal()) {
            AncientRunesView ancientView = new AncientRunesView();
            ancientView.display();
        } else if (course == Course.Defense.ordinal()) {
            DarkArtsView darkArts = new DarkArtsView();
            darkArts.display();
        } else if (course == Course.Divination.ordinal()) {
            DivinationView divination = new DivinationView();
            divination.display();
        } else if (course == Course.Care.ordinal()) {
            MagicalCreaturesView creatures = new MagicalCreaturesView();
            creatures.display();
        } else if (course == Course.Potions.ordinal()) {
            PotionsMenuView potions = new PotionsMenuView();
            potions.display();
        } else if (course == Course.Astronomy.ordinal()) {

        } else if (course == Course.Charms.ordinal()) {

        } else if (course == Course.Flying.ordinal()) {

        } else if (course == Course.Transfiguration.ordinal()) {

        } else {
            ErrorView.display(this.getClass().getName(), "This was not a valid classroom.");
        }
    }

    private void viewNotes() {
        NotesView noteView = new NotesView();
        noteView.display();
    }

    private void takeNotes() {
        AddNotesView takeNotesView = new AddNotesView();
        takeNotesView.display();
    }

    private void takeExam() {

        FinishGameView finish = new FinishGameView();
        finish.display();

    }

    private void viewStore() {
        // convert the enum to an array
        this.console.println("----------------------------------------------------------------------");
        try {
            this.console.println("You currently have " + InventoryControl.getGalleons() + " galleon(s).");
        } catch (InventoryControlException ex) {
            ErrorView.display(this.getClass().getName(), "This was not a valid classroom.");
        }
        this.console.println("----------------------------------------------------------------------");

        Merchandise[] merchandiseList;
        try {
            merchandiseList = MerchandiseControl.getSortedMerchandise();

            for (Merchandise nextMerchandiseItem : merchandiseList) {
                this.console.println(nextMerchandiseItem.getDescription() + nextMerchandiseItem.getPrice());
            }

            this.console.println("\nList of Merchandise Items");
            this.console.printf("%20s\t%20s\t%20s\t\n", "Name", "Price", "Description");
            this.console.println("---------------------------------------------------------------------------------------------------");
            for (Merchandise merch : merchandiseList) {
                this.console.printf("%20s\t%20s\t%20s\t\n", merch.name(), merch.getPrice(), merch.getDescription());
            }
            MerchandiseView store = new MerchandiseView();
            store.display();
        } catch (MerchandiseControlException ex) {
            ErrorView.display(this.getClass().getName(), "This was not a valid classroom.");
        }

    }

    private void getHelp() {

        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void viewInventory() {
        InventoryItem[] inventory;
        try {
            inventory = GameControl.getSortedInventoryList();

            this.console.println("\nList of Inventory Items");
            this.console.printf("%20s\t%20s\t%20s\t\n", "Name", "Quantity", "Description");
            this.console.println("---------------------------------------------------------------------------------------------------");
            for (InventoryItem inventoryItem : inventory) {
                this.console.printf("%20s\t%20s\t%20s\t\n", inventoryItem.getName(),
                        inventoryItem.getQuantity(), inventoryItem.getDescription());

            }
        } catch (GameControlException ex) {
            ErrorView.display(this.getClass().getName(), "This was not a valid classroom.");
        }
    }

    private void printMapToFile() {
        MapPrintView mapPrint = new MapPrintView();
        mapPrint.display();

    }

    private void printInventory() {
        InventoryPrintView inventoryPrint = new InventoryPrintView();
        inventoryPrint.display();
    }

}
