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
public class PotionsMenuView {
    /**
    * steps:
    * Display message describing class
    * Display Menu
    * Get menu option
    * Perform Action
    */
    
     public static String MENU = "\n------------------------------------------------"
        + "\n|               Potions Class Menu             |"
        + "\n------------------------------------------------"
        + "\nI - Instructions" 
        + "\nS - Add spiders" 
        + "\nN - Add newts" 
        + "\nW - Add water" 
        + "\nM - Mix" 
        + "\nF - Finish"
        + "\n-----------------------------------------";
    
    public void displayMenu(){
        
        char selection = ' ';
        
        do{
            this.displayLecture();
            System.out.println(MENU);
            
            String input = this.getInput();
            
            if(input.length() < 1){
                System.out.println( "*** Invalid input. Please enter a value. ");
                continue;
            }
                
            selection =  input.charAt(0);
            
            this.doAction(selection);
            
        }while(selection != 'F');
       
        
    }

    private void displayLecture() {
        System.out.println("Stub function to retrieve lecture and display potions lecture stored in classroom model");
    }

    private String getInput() {
        /**
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
            case 'S':
                this.addSpider();
                break;
            case 'N':
                this.addNewts();
                break;
              case 'W':
                this.addWater();
                break;    
            case 'M':
                 this.mix();
                 break;
            case 'F':
                return;
            default:
                System.out.println("\n*** Invalid selection. Try again. ***");
                break;  
        }
    }
    
     private void displayInstructions() {
        System.out.println("Stub function for diplaying instructions.");
     }

    private void addSpider() {
        System.out.println("Stub function for addSpider.");
    }

    private void addNewts() {
        System.out.println("Stub function for addNewts.");
     }
    
    private void addWater() {
        PotionsView potionsView = new PotionsView();
        potionsView.displayAddWater();
    }

    private void mix() {
       System.out.println("Stub function for mixing the potion.");
    }
}
