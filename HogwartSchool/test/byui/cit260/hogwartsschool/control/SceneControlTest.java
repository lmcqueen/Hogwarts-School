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
 * @author Johnson
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
        
    }
    
}
