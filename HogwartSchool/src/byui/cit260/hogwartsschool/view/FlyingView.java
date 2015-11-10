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
        char selection = ' ';
        do {
            System.out.println("Welcome to flying menu veiw");
            System.out.println("enter a String");
            Scanner input= new Scanner(System.in);
        
        System.out.print("Please enter distance: ");
        int distance = input.nextInt();
        
        System.out.print("Please enter time: ");
        int time = input.nextInt();
            
            this.doAction(distance, time);
        } while (selection != 'E');      
    }
    public String getInput(String ValueType) {
        
        boolean valid = false;
        Scanner keyboard = new Scanner(System.in);
        double value = -1; 
        String input;
        String selection = null;
        // While a value is enter
        while (!valid){
            
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if (selection.length()<1){
                System.out.println("\n*** Invalid selection ***Try again");
            }
            break;
        }
        return selection;
    }
        

    private void doAction(double distance, double time) {
           SceneControl mySC;
        mySC = new SceneControl();
        //Perform calculation by calling control function
        double averageAcceleration = SceneControl.averageAcceleration(distance, time);
        
                    //IF input is a number THEN Convert the string to a double
            if (distance > 1 || time > 1){
            //DISPLAY result
        System.out.println("Good job, please move on");
        
            double value = Double.parseDouble("distance");
                 value = Double.parseDouble("time");

            }

        
    }

    private static class SceneControl {

        private static double averageAcceleration(double distance, double time) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public SceneControl() {
        }
    }
    
}
 
