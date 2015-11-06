/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johnson and lmcqueen
 */
public class SceneControlTest {
    
    public SceneControlTest() {
    }

    /**
     * Test of appartentMagnitude method, of class SceneControl.
     */
    @Test
    public void testAppartentMagnitude() {
        System.out.println("appartentMagnitude");
        
        // Test case one.
        System.out.println("Test case #1"); 
        
        double magnitude = 12;
        double distance = 200;
        
        SceneControl instance = new SceneControl();
        
        double expResult = 0.0003;
        double result = instance.appartentMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.0001);
        
        // Test case two.
        System.out.println("Test case #2"); 
        
        magnitude = 13;
        distance = -50;
        
        expResult = -999999;
        result = instance.appartentMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.0001);
        
         // Test case three.
        System.out.println("Test case #3"); 
        
        magnitude = 56;
        distance = 20;
        
        expResult = -999999;
        result = instance.appartentMagnitude(magnitude, distance);
        assertEquals(expResult, result, -999999);
        
        // Test case four.
        System.out.println("Test case #4"); 
        
        magnitude = 56;
        distance = 20;
        
        expResult = -999999;
        result = instance.appartentMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.0001);
    
        // Test case five.
        System.out.println("Test case #5"); 
        
        magnitude = 14;
        distance = 0;
        
        expResult = -999999;
        result = instance.appartentMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.0001);
        
        // Test case six.
        System.out.println("Test case #6"); 
        
        magnitude = -50;
        distance = 12;
        
        expResult = -0.3472;
        result = instance.appartentMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.0001);
        
        // Test case seven.
        System.out.println("Test case #7"); 
        
        magnitude = 50;
        distance = 20;
        
        expResult = 0.125;
        result = instance.appartentMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.0001);
        
         // Test case eight.
        System.out.println("Test case #8"); 
        
        magnitude = 13;
        distance = 1;
        
        expResult = 13;
        result = instance.appartentMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.0001);
        
    }
    
    /**
     * Test of gallonsCauldronHolds method, of class SceneControl.
     */
    
    @Test
    public void gallonsCauldronHolds() {
    
        System.out.println("gallonsCauldronHolds");
        
        //Test #1
         System.out.println("Test case #1"); 
        
        double diameter = 50;
        double depth = 25;
        
        SceneControl instance = new SceneControl();
        
        double expResult = 212.500;
        double result = instance.gallonsCauldronHolds(diameter, depth);
        
        assertEquals(expResult, result, 0.0001);
        
        //Test #2
         System.out.println("Test case #2");
        
        diameter = 15;
        depth = -12;
         
        expResult = -1;
        result = instance.gallonsCauldronHolds(diameter, depth);
        
        assertEquals(expResult, result, 0.0001);
        
        //Test #3
         System.out.println("Test case #3");
        
        diameter = -5;
        depth = 20;
         
        expResult = -1;
        result = instance.gallonsCauldronHolds(diameter, depth);
        
        assertEquals(expResult, result, 0.0001);
        
        //Test #4
         System.out.println("Test case #4");
        
        diameter = 0;
        depth = 30;
         
        expResult = -1;
        result = instance.gallonsCauldronHolds(diameter, depth);
        
        assertEquals(expResult, result, 0.0001);
        
        //Test #5
         System.out.println("Test case #5");
        
        diameter = 14;
        depth = 0;
         
        expResult = -1;
        result = instance.gallonsCauldronHolds(diameter, depth);
        
        assertEquals(expResult, result, 0.0001);
        
        //Test #6
        System.out.println("Test case #6");
        
        diameter = 1;
        depth = 12;
         
        expResult = .041;
        result = instance.gallonsCauldronHolds(diameter, depth);
        
        assertEquals(expResult, result, 0.0001);
         
        //Test #7
        System.out.println("Test case #7");
        
        diameter = 20;
        depth = 1;
         
        expResult = 1.36;
        result = instance.gallonsCauldronHolds(diameter, depth);
        
        assertEquals(expResult, result, 0.0001);
       
    }
    
     /**
     * Test of averageAcceleration method, of class SceneControl.
     */
    @Test
    public void testAverageacceleration() {
        System.out.println("Average Acceleration");
        
        // Test case one.
        System.out.println("Test case #1"); 
        
        double distance = 200;
        long time = 16;
        
        SceneControl instance = new SceneControl();
        
        double expResult = 0.78125;
        double result = instance.averageAcceleration(distance, time);
        assertEquals(expResult, result, -1);
        
        // Test case two.
        System.out.println("Test case #2"); 
        
         distance = 80;
        time = 200;
        
        
         expResult = .002;
        result = instance.averageAcceleration(distance, time);
        assertEquals(expResult, result, -1);
        
        // Test case three.
        System.out.println("Test case #3"); 
        
         distance = 0;
        time = 15;
        
        
         expResult = 0;
        result = instance.averageAcceleration(distance, time);
        assertEquals(expResult, result, -1);
        
        // Test case four.
        System.out.println("Test case #4"); 
        
         distance = 12;
        time = 1;
        
        
         expResult = 12;
        result = instance.averageAcceleration(distance, time);
        assertEquals(expResult, result, -1);
        
        // Test case five.
        System.out.println("Test case #5"); 
        
         distance = 1;
        time = 1;
        
        
         expResult = 1;
        result = instance.averageAcceleration(distance, time);
        assertEquals(expResult, result, -1);
        
        // Test case six.
        System.out.println("Test case #6"); 
        
         distance = 3;
        time = 8;
        
        
         expResult = .046875;
        result = instance.averageAcceleration(distance, time);
        assertEquals(expResult, result, -1);
        
        // Test case seven.
        System.out.println("Test case #7"); 
        
         distance = 200;
        time = 1;
        
        
         expResult = 200;
        result = instance.averageAcceleration(distance, time);
        assertEquals(expResult, result, -1);
        
        
        
    }    
    
}
