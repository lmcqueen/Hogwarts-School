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

    void displayAddWater() {
        //DISPLAY description of the add water function
        this.addWaterDescription();
        
        //GET cauldron depth and diameter
        double diameter = this.getInput("diameter"); 
        double depth = this.getInput("depth"); 
        
        //check that input did not return an error
        if (diameter == -1 || depth == -1){
            System.out.println("*** There was an input error. ***");
        }
        else{
            //Perform calculation
            //DISPLAY result
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
        boolean valid = false;
        Scanner keyboard = new Scanner(System.in);
        double value = -1;
        String input;
        
        //WHILE a valid value has not been entered
        while(!valid){
            // DISPLAY a message prompting the user to enter a value
            System.out.println("Please enter your cauldron's "+ valueType + " in inches");
            
            //GET the value entered from keyboard 
            input = keyboard.nextLine();
            
            //Trim front and trailing blanks off of the value 
            input = input.trim();
            
            //IF input is a number THEN Convert the string to a double
            if (input.matches("[0-9]+")){
                value = Double.parseDouble(input);
            }
            //ELSE IF the user did not input a value greater or equal to one THEN DISPLAY an invalid message and CONTINUE
            else{
                System.out.println("*** Invalid " + valueType + ". Enter a number greater or equal to one. ***");
                continue;
            }
            
            //IF the user did not enter a number THEN DISPLAY an invalid input message
            if(value < 1){
                System.out.println("*** Invalid " + valueType + ". Enter a number greater than one. ***");
                continue;
            }
            
            break;
        }
        
        return value;
    }

    private void doAction(double diameter, double depth) {
        //Perform calculation by calling control function
        double calculate = SceneControl.gallonsCauldronHolds(diameter, depth);
        
        //DISPLAY result
        System.out.println("Your cauldron will hold " + calculate + " gallons of water");
    }
    
}
