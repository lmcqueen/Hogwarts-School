/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;
import java.lang.Math;

/**
 *
 * @author User
 */
public class SceneControl {

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
   
   public double gallonsCauldronHolds (double diameter, double depth) {
       
        if (diameter < 1 || depth < 1) {
            return -1;
        }
       
        double gallons; 
	gallons = (Math.pow((diameter/2),2) * Math.PI * depth)/231;
        
        return gallons;
    
   }
}
