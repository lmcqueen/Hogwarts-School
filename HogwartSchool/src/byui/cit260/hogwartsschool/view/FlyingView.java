/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.SceneControl;
import java.util.Scanner;

/**
 *
 * @author Johnson
 */
public class FlyingView {

    public void displayMenu() {
        //DISPLAY description of the add water function
        System.out.println("Wellcome to flying menu veiw");
        System.out.println("MENU");
        
        Scanner input= new Scanner(System.in);
        
        System.out.print("Please enter distance: ");
        int distance = input.nextInt();
        
        System.out.print("Please enter time: ");
        int time = input.nextInt();
    
        //GET cauldron depth and diameter
       // double distance = this.getInput(); 
       // double time = this.getInput(); 
        
        
        if ( distance == -1 ||  time == -1){
            System.out.println(" Invalid input, try again.");
        }
        else{
            //Perform calculation
            //DISPLAY result
            this.doAction(distance, time);
        }
      
    }

   
    void getInput() {
        boolean valid = false;
        Scanner keyboard = new Scanner(System.in);
        double value = -1;
        
        //WHILE a valid value has not been entered
        while(!valid){
            // DISPLAY a message prompting the user to enter a value
            System.out.println("Please enter distance" );
            
            //GET the value entered from keyboard 
            int distance = keyboard.nextInt();
            System.out.println("Please enter time");
            int time = keyboard.nextInt();
       
                    
            //IF input is a number THEN Convert the string to a double
            if (distance > 1 || time > 1){
            
                 String = Double.parseDouble();
                 Doubl = Double.parseDouble();

            }
            //ELSE IF the user did not input a value greater or equal to one THEN DISPLAY an invalid message and CONTINUE
            else{
                System.out.println(". Enter a number greater or equal to one.");
                continue;
            }
            
            //IF the user did not enter a number THEN DISPLAY an invalid input message
            if(value < 1){
                System.out.println(". Enter a number greater than one. ***");
                continue;
            }
            
            break;
        }
        
        return value;
    }

    private void doAction(double distance, double time) {
        //Perform calculation by calling control function
        double averageAcceleration = mySceneControl.averageAcceleration(distance, time);
        
        //DISPLAY result
        System.out.println("Good job, please move on");
    }

    private static class mySceneControl {

        private static double averageAcceleration(double distance, double time) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public mySceneControl() {
        }
    }
    
}
