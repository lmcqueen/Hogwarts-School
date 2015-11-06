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

        Scanner in = new Scanner(System.in);

        char selection = ' ';
        
            System.out.println("Welcome to flying view!");
            // To prompt and get two inputs from the user.
            System.out.println("input distance");
            String input = this.getInput();
            int dist = in.nextInt();
            System.out.println("input time");
            String input2 = this.getInput();
            int time = in.nextInt();
            
    }
        // Do action by converting two strings into parse Double.


    private void doAction(char distance, char time) {
        String input = null;
        Double dist = Double.parseDouble(input);
        Double time1 = Double.parseDouble(input);
        
        // Call to calculate average aceleration from the scene control.
    SceneControl mySceneControl = new SceneControl();

    double averageAcceleration = mySceneControl.averageAcceleration (dist, time);
    if (averageAcceleration  >= 1){
            System.out.println("Good job, move on");
    }

    else{
     }
}
    private String getInput() {
    String input = null;
    return input;
}
}
  

    
            //to tell the program where the function is, lets create an instance of the class we are refering to.
/*private SceneControl mySceneControl = new SceneControl();

    public void FView(){
        Scanner in = new Scanner(System.in);
        System.out.println("input distance");
        int dist = in.nextInt();
        System.out.println("input time");
        int time = in.nextInt();
                
    mySceneControl.averageAcceleration(dist, time);
    
    displayBanner();

         double averageAcceleration = this.getDistance();
        AverageAcceleration = SceneControl.createAverageAcceleration(distance);
        double averageAcceleration = this.getTime();
        AverageAcceleration = SceneControl.createAverageAcceleration(time);


        this.displayWelcomeMessage(player);

        
        FlyingMenuView flyingMenu = new FlyingMenuView();{
        flyingMenu.displayMenu();}
   
     
        
    }*/

    
