/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.SceneControl;
import byui.cit260.hogwartsschool.exceptions.SceneControlException;

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

            try {
                diameterNum = Double.parseDouble(diameter);
            } catch(NumberFormatException nf) {
                System.out.println("You must enter a valid number. Please try again. ");
                continue;
            }

            System.out.println("\nDepth: ");
            depth = this.getInput();
            try {
                depthNum = Double.parseDouble(depth);
            } catch(NumberFormatException nf){
                System.out.println("You must enter a valid number. Please try again. ");
                continue;
            }

            Double[] calculate = {diameterNum, depthNum};
            
            if(this.doAction(calculate)){
                done = true;
            }

        } while (!done);
    }
  
    @Override 
    public boolean doAction(Object obj) {
        
        Double[] calculation = (Double[]) obj;
        
        try{
            double calculate = SceneControl.gallonsCauldronHolds(calculation[0], calculation[1]);
        
            //DISPLAY result
            System.out.println("Your cauldron will hold " + calculate + " gallons of water");
        } catch (SceneControlException me){
            System.out.println(me.getMessage());
            return false;
        }   
            
        return true;
       
    }
    
}
