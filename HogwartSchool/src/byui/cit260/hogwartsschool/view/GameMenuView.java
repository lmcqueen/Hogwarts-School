package byui.cit260.hogwartsschool.view;

import java.util.Scanner;

/**
 *
 * @author lmcqueen
 */
class GameMenuView {
    
    private final String MENU = "\n------------------------------------------------"
            + "\n|               Game Menu                      |"
            + "\n------------------------------------------------"
            + "\nV - View map" 
            + "\nP - View current points" 
            + "\nM - Move to a new location" 
            + "\nE - Explore the area"
            + "\nT - Take Notes"
            + "\nN - View notes"
            + "\nX - Take Exam" 
            + "\nH - Help"
            + "\nR - Return to last screen"
            + "\n-----------------------------------------";
            


    void displayMenu() {
       
        char selection = ' ';
        do{
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        }while(selection != 'R');
              
    }
    
     private String getInput() {
        
        boolean valid = false;
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        
        while(!valid){
            System.out.println("Please enter a menu option below:");
            
            input = keyboard.nextLine();
            input = input.trim();
            input = input.toUpperCase();
            
            if(input.length() > 1){
                System.out.println("\n *** Invalid Selection. Enter only a single character. ***\n");
                System.out.println(MENU);
                continue;
            }
            
            break;
        }
       
        return input;
    }

    private void doAction(char choice) {
        
        switch (choice) {
            case 'V': 
                this.viewMap();
                break;
            case 'P':
                this.viewCurrentPoints();
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
                return;
            default:
                System.out.println("\n*** Invalid selection. Try again. ***");
                break;  
        } 
   }

    private void viewMap() {
        System.out.println("\n*** viewMap stub function called ***\n");
    }

    private void viewCurrentPoints() {
        System.out.println("\n*** viewCurrentPoints stub function called ***\n"); }

    private void moveLocation() {
        MoveLocationView moveLocation = new MoveLocationView();
        moveLocation.moveLocation();
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
        helpMenu.displayMenu();
    }

}
