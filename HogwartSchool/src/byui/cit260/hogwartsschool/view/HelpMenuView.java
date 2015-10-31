/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import java.util.Scanner;

/**
 *
 * @author lmcqueen
 */
public class HelpMenuView {
    
    private final String MENU = "\n------------------------------------------------"
        + "\n|               Help Menu                      |"
        + "\n------------------------------------------------"
        + "\nG - What is the goal of the game?" 
        + "\nM - How to move"
        + "\nP - How do I get points?"
        + "\nH - What house am I in?" 
        + "\nN - What are notes?"
        + "\nR - Return to previous selection"
        + "\n-----------------------------------------";
    
    public void displayMenu() {
        
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
            case 'G': 
                this.displayGoalHelp();
                break;
            case 'M':
                this.displayMoveHelp();
                break;
            case 'P':
                this.getPointsHelp();
                break;
            case 'H': 
                this.getHouseHelp();
                break;
            case 'N':
                this.getNotesHelp();
                break;
            case 'R':
                return;
            default:
                System.out.println("\n*** Invalid selection. Try again. ***");
                break;  
        } 
   }

    private void displayGoalHelp() {
        System.out.println("*** getGoalHelp stub function called. ***");
    }

    private void displayMoveHelp() {
        System.out.println("*** getMoveHelp stub function called. ***");
    }

    private void getPointsHelp() {
        System.out.println("*** getPointsHelp stub function called. ***");}

    private void getHouseHelp() {
        System.out.println("*** getHouseHelp stub function called. ***");
    }

    private void getNotesHelp() {
        System.out.println("*** getNotesHelp stub function called. ***");
    }

    
}
