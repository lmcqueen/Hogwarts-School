package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.GameControl;
import byui.cit260.hogwartsschool.model.InventoryItem;

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
        System.out.println("\n*** viewMap stub function called ***\n");
    }

    private void viewCurrentPoints() {
        System.out.println("\n*** viewCurrentPoints stub function called ***\n"); }

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
        System.out.println("Description" + "\t" + "Item Type" + "\t" + "Quantity");
        
        for (InventoryItem inventoryItem : inventory){
            System.out.print(inventoryItem.getName() + "\t");
            System.out.print(inventoryItem.getDescription() + "\t");
            System.out.print(inventoryItem.getItemType()+ "\t");
            System.out.print(inventoryItem.getQuantity()+ "\t");
            
        }
        
    }

}
