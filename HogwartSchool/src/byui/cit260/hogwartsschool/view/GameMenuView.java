package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.GameControl;
import byui.cit260.hogwartsschool.model.Course;
import byui.cit260.hogwartsschool.model.House;
import byui.cit260.hogwartsschool.model.InventoryItem;
import byui.cit260.hogwartsschool.model.Location;
import byui.cit260.hogwartsschool.model.Map;
import hogwartsschool.HogwartsSchool;

/**
 *
 * @author lmcqueen
 */
class GameMenuView extends View{
    
    public GameMenuView(){
        super("\n------------------------------------------------"
            + "\n|               Game Menu                      |"
            + "\n------------------------------------------------"
            + "\nV - View map" 
            + "\nP - View current points" 
            + "\nI - View Inventory"   
            + "\nC - View All Courses"    
            + "\nM - Move to a new location" 
            + "\nE - Explore the area"
            + "\nT - Take Notes"
            + "\nN - View notes"
            + "\nX - Take Exam" 
            + "\nH - Help"
            + "\nR - Return to last screen"
            + "\n-----------------------------------------");
    }

    @Override 
    public boolean doAction(Object obj) {
        
       String value = (String) obj;
        value = value.toUpperCase();
        if(value.length() > 1){
            System.out.println("\n *** Invalid Selection. Enter only a single character. ***\n");
            return false;
        }
        
        char selection = value.charAt(0);
        
        switch (selection) {
            case 'V': 
                this.viewMap();
                break;
            case 'P':
                this.viewCurrentPoints();
                break;
            case 'I':
                this.viewInventory();
                break;
            case 'C':
                this.viewCourses();
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
            case 'R':
                return true;
            default:
                System.out.println("\n*** Invalid selection. Try again. ***");
                break;  
        } 
        
        return false;
   }

    private void viewMap() {
        Map map = HogwartsSchool.currentGame.getMap();
        
        Location[][] locations = map.getLocations();
        int rowCount = map.getRowCount();
        int columnCount = map.getColumnCount();
        
        System.out.println("View Map");
        System.out.println("Legend: Halways = ****  First 2 characters of "
                + "location name = visited Great Hall = XX");
        Location location;
        for(int i = 0; i < rowCount; i++){
            System.out.print(i + 1);
            System.out.println("========================");
            for(int j = 0; j < columnCount; j++){
                System.out.print("|");
                location = locations[i][j];
                System.out.print(location.getScene().getMapSymbol());
            }
            System.out.println("|");
        }
        System.out.println("========================");
    }

    private void viewCurrentPoints() {
        House[] houses = GameControl.getSortedHouses();
        
        System.out.println("View House Points");
        System.out.println("House\t\tPoints");
        
        for(House house : houses){
            System.out.println(house.getName() + "\t" + house.getPoints());
        }
        
    }

    private void moveLocation() {
        MoveLocationView moveLocation = new MoveLocationView();
        moveLocation.display();
    }

    private void exploreArea() {
        System.out.println("\n*** exploreArea stub function called ***\n");
    }

    private void viewNotes() {
        System.out.println("\n*** viewNotes stub function called ***\n");
    }

    private void takeNotes() {
        System.out.println("\n*** takeNotes stub function called ***\n");
    }

    private void takeExam() {
        System.out.println("\n*** takeExam stub function called ***\n");
    }

    private void getHelp() {
        
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void viewInventory() {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        System.out.printf("%20s\t%20s\t%20s\t%20s\t\n", "Name","Item Type","Quantity","Description");
        System.out.println("---------------------------------------------------------------------------------------------------");
        for (InventoryItem inventoryItem : inventory){
            System.out.printf("%20s\t%20s\t%20s\t%20s\t\n",inventoryItem.getName(),inventoryItem.getItemType(),
             inventoryItem.getQuantity(),inventoryItem.getDescription());
            
        }
        
    }

    private void viewCourses() {
        Course[] courses = GameControl.getSortedCourses();
        
        System.out.println("View All Courses:");
        
        for(Course course : courses){
            System.out.println(course.getDescription());
        }
    }

}
