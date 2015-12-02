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
 * @author User
 */
public class AstronomyView extends View {
    
    public AstronomyView() {
        super("\n------------------------------------------------"
                         + "\n| To figure out the apparent magnitude of a star |"
                         + "\n| use the given distance and absolute magnitude  |"
                         + "\n| between earth and __________ that is given in  |"
                         + "\n| the lecture.                                   |"
                         + "\n------------------------------------------------"
        );
    }
   
    @Override
    public void display() {
        //DISPLAY prompt
        this.console.println(getPromptMessage());
        boolean done = false;
        String distance;
        String absoluteMagnitude;
        double distanceNum;
        double absoluteMagnitudeNum;

        do {
            //GET cauldron depth and diameter
            this.console.println("\nDistance: ");
            distance = this.getInput();

            try{
                distanceNum = Double.parseDouble(distance);
            }  catch(NumberFormatException nf){
                ErrorView.display(this.getClass().getName(), "You must enter a valid number. Please try again.");
                continue;
            }

            this.console.println("\nAbsolute Magnitude: ");
            absoluteMagnitude = this.getInput();
            try {
                absoluteMagnitudeNum = Double.parseDouble(absoluteMagnitude);
            } catch(NumberFormatException nf){
                ErrorView.display(this.getClass().getName(), "You must enter a valid number. Please try again. ");
                continue;
            }

            Double[] calculate = {absoluteMagnitudeNum, distanceNum};
           
            if(this.doAction(calculate)){
                done = true;
            }

        } while (!done);
    }
  
    @Override 
    public boolean doAction(Object obj) {
        
        Double[] calculation = (Double[]) obj;
        
        try{ 
            double calculate = SceneControl.appartentMagnitude(calculation[0], calculation[1]);
            this.console.println("Your apparent magnitude is " +  calculate);
        }
        catch(SceneControlException me){
            ErrorView.display(this.getClass().getName(), me.getMessage());
            return false;
        }   
        
        return true;
    }
    
    
}
