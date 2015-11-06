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
            //DISPLAY message describing class
            this.displayLecture();
            
            //DISPLAY Menu options
            System.out.println(MENU);
            
            //GET user input menu option
            String input = this.getInput();                
            selection =  input.charAt(0);
            
            //Perform selected Action
            this.doAction(selection);
            
        }while(selection != 'F');
    }

    private void displayLecture() {
        System.out.println("Stub function to retrieve lecture and display potions lecture stored in classroom model");
    }

    private String getInput() {
        boolean valid = false;
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        
        //WHILE a valid value has not been entered
        while(!valid){
            //DISPLAY a message prompting the user to enter a value
            System.out.println("Please enter a menu option below: ");
            
            // GET the value entered from keyboard 
            input = keyboard.nextLine();
            
            //Trim front and trailing blanks off of the value
            input = input.trim();
            input = input.toUpperCase();
            
            //IF invalid value THEN DISPLAY invalid value message  
            if(input.length() > 1)
            {
                System.out.println("\n *** Invalid Selection. Enter only a single character. ***\n");
                continue;
            }
            else if(input.length() < 1){
                System.out.println("\n *** Invalid. Enter a selection. ***\n");
                continue;
            }
            
            break;
        }
        
        return input;
    }

    private void doAction(char selection) {
        //SWITCH selection
        switch(selection){
            //“I”: Display Instructions
            case 'I':
                this.displayInstructions();
                break;
            //“S”: Add spiders to potion
            case 'S':
                this.addSpider();
                break;
            //“N”: Add newts to potion
            case 'N':
                this.addNewts();
                break;
            //“W”: Add water to potion
              case 'W':
                this.addWater();
                break;  
            //"M": Mix potion
            case 'M':
                 this.mix();
                 break;
            //“F”: return 
            case 'F':
                return;
            //OTHERWISE: DISPLAY “Invalid selection” 
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
