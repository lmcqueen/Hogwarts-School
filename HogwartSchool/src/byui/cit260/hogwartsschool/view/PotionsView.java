/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.SceneControl;

/**
 *
 * @author lmcqueen
 */
public class PotionsView extends View {

    public PotionsView() {
        super("\n------------------------------------------------"
                         + "\n| To figure out how much water needs to be       |"
                         + "\n| added to your cauldron, use the cauldron       |"
                         + "\n| calculator to figure how much water your       |"
                         + "\n| cauldron will hold. Once you calculate the     |"
                         + "\n| amount of water needed, the water will         |"
                         + "\n| automatically be added to your cauldron.       |"
                         + "\n------------------------------------------------"
        );
    }
   
    @Override
    public void display() {
        //DISPLAY prompt
        System.out.println(getPromptMessage());
        boolean done = false;
        String diameter;
        String depth;
        double diameterNum;
        double depthNum;

        do {
            //GET cauldron depth and diameter
            System.out.println("\nDiameter: ");
            diameter = this.getInput();

            if (this.doAction(diameter)) {
                diameterNum = Double.parseDouble(diameter);
            } else {
                continue;
            }

            System.out.println("\nDepth: ");
            depth = this.getInput();
            if (this.doAction(depth)) {
                depthNum = Double.parseDouble(depth);
            } else {
                continue;
            }

            this.Calculate(diameterNum, depthNum);
            done = true;

        } while (!done);
    }
  
    @Override 
    public boolean doAction(Object obj) {
        String input = (String)obj;
        double value; 
        //Check input
        //IF input is a number THEN Convert the string to a double
            if (input.matches("[0-9]+")){
                value = Double.parseDouble(input);
            }
            //ELSE IF the user did not input a value greater or equal to one THEN DISPLAY an invalid message and CONTINUE
            else{
                System.out.println("*** Enter a number greater or equal to one. ***");
                return false;
            }
            
            //IF the user did not enter a number THEN DISPLAY an invalid input message
            if(value < 1){
                System.out.println("*** Enter a number greater than one. ***");
                return false;
            }
            
        return true;
       
    }
    
    private void Calculate (double diameter, double depth){
         double calculate = SceneControl.gallonsCauldronHolds(diameter, depth);
        
        //DISPLAY result
        System.out.println("Your cauldron will hold " + calculate + " gallons of water");
    }
    
}
