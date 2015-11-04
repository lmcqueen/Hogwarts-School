/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import java.util.Scanner;

/**
 *
 * @author Johnson
 */
public class FlyingMenuView {
    
     private final String MENU = "\n------------------------------------------------"
        + "\n|               Fly Menu                      |"
        + "\n------------------------------------------------"
        + "\nI - Instructions" 
        + "\nC - Calculate"
        + "\nY - Fly"
        + "\nF - Finish"
        + "\n-----------------------------------------";
    
    public void displayMenu() {
        
        char selection = ' ';
        do{
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        }while(selection != 'F');
                
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
            case 'I': 
                this.displayInstructions();
                break;
            case 'C':
                this.displayCalculate();
                break;
            case 'Y':
                this.displayFly();
                break;
            case 'F':
                return;
            default:
                System.out.println("\n*** Invalid selection. Try again. ***");
                break;  
        } 
   }

    private void displayInstructions() {
        System.out.println("*** getInstructions stub function called. ***");
    }

    private void displayCalculate() {
        System.out.println("*** getCalculate stub function called. ***");
    }

    private void displayFly() {
        System.out.println("*** getFly stub function called. ***");}


    
    
}
