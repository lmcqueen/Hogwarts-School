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
        this.console.println(getPromptMessage());
        boolean done = false;
        String diameter;
        String depth;
        double diameterNum;
        double depthNum;

        do {
            //GET cauldron depth and diameter
            this.console.println("\nDiameter: ");
            diameter = this.getInput();

            try {
                diameterNum = Double.parseDouble(diameter);
            } catch(NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(), "You must enter a valid number. Please try again. ");
                continue;
            }

            this.console.println("\nDepth: ");
            depth = this.getInput();
            try {
                depthNum = Double.parseDouble(depth);
            } catch(NumberFormatException nf){
                ErrorView.display(this.getClass().getName(), "You must enter a valid number. Please try again. ");
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
            this.console.println("Your cauldron will hold " + calculate + " gallons of water");
        } catch (SceneControlException me){
            ErrorView.display(this.getClass().getName(), me.getMessage());
            return false;
        }   
            
        return true;
       
    }
    
}
