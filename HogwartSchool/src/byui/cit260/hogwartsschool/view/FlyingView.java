/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

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
    public String getInput() {
        
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        
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
        //create instance
        FlyingMenuView myMenu = new FlyingMenuView();
           
        //Perform calculation by calling control function
        double averageAcceleration = mySceneControl.averageAcceleration(distance, time);
        
                    //IF input is a number THEN Convert the string to a double
            if (distance > 1 || time > 1){
            
                distance = Double.parseDouble(String value);
                 time = Double.parseDouble(String value);

            }

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
 
