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
public class AstronomyMenuView {
    
   /**
    * steps:
    * Display message describing class
    * Display Menu
    * Get menu option
    * Perform Action
    */
    
    public static String MENU = "\n------------------------------------------------"
        + "\n|               Astronomy Class Menu                      |"
        + "\n------------------------------------------------"
        + "\nI - Instructions" 
        + "\nC - Calculate"
        + "\nF - Finish"
        + "\n-----------------------------------------";
    
    public void displayMenu(){
        
        char selection = ' ';
        
        do{
            this.displayLecture();
            System.out.println(MENU);
            
            String input = this.getInput();
            selection =  input.charAt(0);
            
            this.doAction(selection);
            
        }while(selection != 'F');
        
        
    }

    private void displayLecture() {
        System.out.println("Stub function to retrieve lecture and display astronomy lecture stored in classroom model");
    }

    private String getInput() {
        /**
         * Message telling use to input selection
         * Ask user for input
         * check if more than one character (ask for valid input if larger than one)
         * get rid of spaces and put to all caps
         * 
         */
        boolean valid = false;
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        
        while(!valid){
            System.out.println("Please enter a menu option below: ");
            
            input = keyboard.nextLine();
            input = input.trim();
            input = input.toUpperCase();
            
            if(input.length() > 1)
            {
                System.out.println("\n *** Invalid Selection. Enter only a single character. ***\n");
                continue;
            }
            
            break;
        }
        
        return input;
    }

    private void doAction(char selection) {
        
        switch(selection){
            case 'I':
                this.displayInstructions();
                break;
            case 'C':
                this.calculate();
                break;
            case 'F':
                return;
            default:
                System.out.println("\n*** Invalid selection. Try again. ***");
                break;  
        }
    }

    private void displayInstructions() {
        
        System.out.println("In order to correctly calculate the absolute magnitude "
                + "between earth and ");
    }

    private void calculate() {
        System.out.println("this will calculate the magnitude.");
    }
}
