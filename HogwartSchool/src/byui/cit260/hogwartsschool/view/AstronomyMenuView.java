/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import java.util.Scanner;

/**
 *
 * @author lmcqueen
 */
public class AstronomyMenuView {
    
   /**
    * steps:
    * Display message describing class
    * Display Menu
    * Get menu option
    * Perform Action
    
    
    
    public AstronomyMenuView() {
        super("\n------------------------------------------------"
        + "\n|               Astronomy Class Menu                      |"
        + "\n------------------------------------------------"
        + "\nI - Instructions" 
        + "\nC - Calculate"
        + "\nF - Finish"
        + "\n-----------------------------------------");
    }
    

    private void displayLecture() {
        System.out.println("Stub function to retrieve lecture and display astronomy lecture stored in classroom model");
    }

    public boolean doAction(Object obj) {
        
        switch(selection){
            case 'I':
                this.displayInstructions();
                break;
            case 'C':
                this.calculate();
                break;
            case 'F':
                return;
            default:
                System.out.println("\n*** Invalid selection. Try again. ***");
                break;  
        }
    }

    private void displayInstructions() {
        
        System.out.println("In order to correctly calculate the absolute magnitude "
                + "between earth and ");
    }

    private void calculate() {
        System.out.println("this will calculate the magnitude.");
    }
    */
}
