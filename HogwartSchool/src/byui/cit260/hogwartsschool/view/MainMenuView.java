/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import java.util.Scanner;

/**
 *
 * @author lmcqueen and Johnson
 */
public class MainMenuView {

    private final String MENU = "\n"
            + "\n-----------------------------------------"
            + "\n Main Menu                              |"
            + "\n-----------------------------------------"
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
    }

    private String getInput() {
        
        boolean valid = false;
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        
        while(!valid){
            System.out.println("Please enter a menu option below:\n");
            
            input = keyboard.nextLine();
            input = input.trim();
            
            if(input.length() > 1){
                System.out.println("Please enter only a single character");
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
                System.out.println("\n*** Invalid selection *** Try again");
                break;
             
        }
        
   }

    private void startNewGame() {
    }

    private void getSavedGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
