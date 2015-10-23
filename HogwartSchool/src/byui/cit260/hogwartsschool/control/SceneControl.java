/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

/**
 *
 * @author lmcqueen and Johnson
 */
public class SceneControl {

   //Group assignmnet
   public double appartentMagnitude (double magnitude, double distance){
   
       if (magnitude > 50 || magnitude < -50) {
		return -999999;
        }
       
	if (distance < 1) {
		return -999999;
        }
        
        double apparentMagnitude;
	apparentMagnitude = magnitude/(distance * distance);
	
        return apparentMagnitude;

   }
   
   //Leah McQueen Individual Assignemnt
   public double gallonsCauldronHolds (double diameter, double depth) {
       
        if (diameter < 1 || depth < 1) {
            return -1;
        }
       
        double gallons; 
	gallons = (Math.pow((diameter/2),2) * Math.PI * depth)/231;
        
        return gallons;
    
   }
   
   // Individual assignment of Johnson.

    public double averageAcceleration (double distance, long time) {
    
     
        if (distance < 0 || time < 1) {
		return -1;
        }        
                
       
	double averageAcceleration;
        averageAcceleration = (distance / time) / time;        

	return averageAcceleration;

    }
   
   
}
  