/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

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
}
