/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.SceneControl;

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
        System.out.println(getPromptMessage());
        boolean done = false;
        String distance;
        String absoluteMagnitude;
        double distanceNum;
        double absoluteMagnitudeNum;

        do {
            //GET cauldron depth and diameter
            System.out.println("\nDistance: ");
            distance = this.getInput();

            if (this.doAction(distance)) {
                distanceNum = Double.parseDouble(distance);
            } else {
                continue;
            }

            System.out.println("\nAbsolute Magnitude: ");
            absoluteMagnitude = this.getInput();
            if (this.doAction(absoluteMagnitude)) {
                absoluteMagnitudeNum = Double.parseDouble(absoluteMagnitude);
            } else {
                continue;
            }

            this.Calculate(absoluteMagnitudeNum, distanceNum);
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
    
    private void Calculate (double absoluteMagnitude, double distance){
         double calculate = SceneControl.appartentMagnitude(absoluteMagnitude, distance);
        
        //DISPLAY result
        System.out.println("Your apparent magnitude is " +  calculate);
    }
}
