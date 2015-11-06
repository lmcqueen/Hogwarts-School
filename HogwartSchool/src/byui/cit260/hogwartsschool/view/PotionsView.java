/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.SceneControl;
import java.util.Scanner;

/**
 *
 * @author lmcqueen
 */
public class PotionsView {

     /** 
       * Description of the add water function
       * Ask for cauldron depth
       * Get input from user
       * Ask for cauldron diameter
       * Get input from user
       * Display Result
       */
    void displayAddWater() {
        
        this.addWaterDescription();
        
        double diameter = this.getInput("diameter"); 
        double depth = this.getInput("depth"); 
        
        if (diameter == -1 || depth == -1){
            System.out.println("*** There was an input error. ***");
        }
        else{
            this.doAction(diameter, depth);
        }
      
    }

    private void addWaterDescription() {
        System.out.println("\n------------------------------------------------"
                         + "\n| To figure out how much water needs to be       |"
                         + "\n| added to your cauldron, use the cauldron       |"
                         + "\n| calculator to figure how much water your       |"
                         + "\n| cauldron will hold. Once you calculate the     |"
                         + "\n| amount of water needed, the water will         |"
                         + "\n| automatically be added to your cauldron.       |"
                         + "\n------------------------------------------------"
        );
    }

    private double getInput(String valueType) {
        /**
         * Prompt user for input
         * Get rid of spaces 
         * convert string to double (make sure no letters)
         * make sure input not negative and greater than 1
         */
        boolean valid = false;
        Scanner keyboard = new Scanner(System.in);
        double value = -1;
        
        while(!valid){
            System.out.println("Please enter your cauldron's "+ valueType + " in inches");
            String input = keyboard.nextLine();
            input = input.trim();
            
            if (input.matches("[0-9]+")){
                value = Double.parseDouble(input);
            }
            else{
                System.out.println("*** Invalid diameter. Enter only numbers. ***");
                continue;
            }
            
            if(value < 1){
                System.out.println("*** Invalid diameter. Enter only a positive numbers. ***");
                continue;
            }
            
            break;
        }
        
        return value;
    }

    private void doAction(double diameter, double depth) {
        
        double calculate = SceneControl.gallonsCauldronHolds(diameter, depth);
        System.out.println("Your cauldron will hold " + calculate + " gallons of water");
        
    }
    
}
