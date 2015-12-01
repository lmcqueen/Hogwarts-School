/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import byui.cit260.hogwartsschool.exceptions.SceneControlException;

/**
 *
 * @author lmcqueen and Johnson
 */
public class SceneControl {

   //Group assignmnet
   public static double appartentMagnitude (double magnitude, double distance) throws SceneControlException {
   
       if (magnitude > 50 || magnitude < -50) {
            throw new SceneControlException("Cannot have a magnitude greater than 50 or less than -50");
        }
       
	if (distance < 1) {
            throw new SceneControlException("Cannot have a distance under 1");
        }
        
        double apparentMagnitude;
	apparentMagnitude = magnitude/(distance * distance);
	
        return apparentMagnitude;

   }
   
   //Leah McQueen Individual Assignemnt
   public static double gallonsCauldronHolds (double diameter, double depth) throws SceneControlException {
       
        if (diameter < 1 || depth < 1) {
            throw new SceneControlException("Cannot have a distance or depth under 1");
        }
       
        double gallons; 
	gallons = (Math.pow((diameter/2),2) * Math.PI * depth)/231;
        gallons = Math.round(gallons * 1000.0)/1000.0;
        
        return gallons;
    
   }
   
   // Individual assignment of Johnson.

    public static double averageAcceleration (double distance, double time) {
    
     
        if (distance < 0 || time < 1) {
            return -1;
        }
        else{        
                
       
	double averageAcceleration;
        averageAcceleration = (distance / time) / time;        

	return averageAcceleration;

    }
    }
   
   
}
  