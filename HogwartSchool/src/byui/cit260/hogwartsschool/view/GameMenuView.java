package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.GameControl;
import byui.cit260.hogwartsschool.model.Course;
import byui.cit260.hogwartsschool.model.House;
import byui.cit260.hogwartsschool.model.InventoryItem;
import byui.cit260.hogwartsschool.model.Merchandise;
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
            + "\nF - Print Map to File"
            + "\nB - Print Inventory to File"
            + "\nP - View current points" 
            + "\nI - View Inventory"   
            + "\nC - View All Courses"    
            + "\nM - Move to a new location" 
            + "\nE - Explore the area"
            + "\nT - Take Notes"
            + "\nN - View notes"
            + "\nX - Take Exam" 
            + "\nH - Help"
            + "\nS - View Store"
            + "\nR - Return to last screen"
                +"\nA - Temporary option to test save game: show current player's name"
                
            + "\n-----------------------------------------");
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
            case 'S':
                this.viewStore();
                break;
            case 'A':
                this.getTemp();
                break;
            case 'R':
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
        House[] houses = GameControl.getSortedHouses();
        
        this.console.println("View House Points");
        this.console.println("House\t\tPoints");
        
        for(House house : houses){
            this.console.println(house.getName() + "\t" + house.getPoints());
        }
        
    }

    private void moveLocation() {
        MapView moveLocation = new MapView();
        moveLocation.display();
    }

    private void exploreArea() {
        this.console.println("\n*** exploreArea stub function called ***\n");
    }

    private void viewNotes() {
        this.console.println("\n*** viewNotes stub function called ***\n");
    }

    private void takeNotes() {
        this.console.println("\n*** takeNotes stub function called ***\n");
    }

    private void takeExam() {
        this.console.println("\n*** takeExam stub function called ***\n");
    }
    
     private void viewStore() {
        // convert the enum to an array
      Merchandise[] merchandiseList = Merchandise.values();
      
      for (Merchandise nextMerchandiseItem : merchandiseList) {
          this.console.println(nextMerchandiseItem.getDescription()+ nextMerchandiseItem.getPrice());
      }
      
        // Go through every item in the list
            // display the item discriptions and price
         
    }

    private void getHelp() {
        
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void viewInventory() {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        this.console.println("\nList of Inventory Items");
        this.console.printf("%20s\t%20s\t%20s\t%20s\t\n", "Name","Item Type","Quantity","Description");
        this.console.println("---------------------------------------------------------------------------------------------------");
        for (InventoryItem inventoryItem : inventory){
            this.console.printf("%20s\t%20s\t%20s\t%20s\t\n",inventoryItem.getName(),inventoryItem.getItemType(),
             inventoryItem.getQuantity(),inventoryItem.getDescription());
            
        }
        
    }

    private void viewCourses() {
        Course[] courses = GameControl.getSortedCourses();
        
        this.console.println("View All Courses:");
        
        for(Course course : courses){
            this.console.println(course.getDescription());
        }
    }
    
    private void getTemp(){
        this.console.println(HogwartsSchool.getCurrentGame().getPlayer().getName());
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
