package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.GameControl;
import hogwartsschool.HogwartsSchool;
import java.util.Scanner;

/**
 *
 * @author lmcqueen and Johnson
 */
public class MainMenuView {

    private final String MENU = "\n------------------------------------------------"
            + "\n|               Main Menu                      |"
            + "\n------------------------------------------------"
            + "\nN - Start New Game" 
            + "\nG - Get Saved Game"
            + "\nH - Get Help"
            + "\nS - Save Game" 
            + "\nE - Exit"
            + "\n-----------------------------------------";
    
    public void displayMenu() {
        
        char selection = ' ';
        do{
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        }while(selection != 'E');
        
        System.out.println("\nThanks for playing!");
                
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
            case 'N': 
                this.startNewGame();
                break;
            case 'G':
                this.getSavedGame();
                break;
            case 'H':
                this.getHelp();
                break;
            case 'S': 
                this.saveGame();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection. Try again. ***");
                break;  
        } 
   }

    private void startNewGame() {
        
        GameControl.createNewGame(HogwartsSchool.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        
    }

    private void getSavedGame() {
        System.out.println("\n*** getSavedGame stub function called ***\n");
    }

     private void getHelp() {
         
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
        
    }
     
    private void saveGame() {
        System.out.println("\n*** saveGame stub function called ***\n");
    }

   
    
    
}
