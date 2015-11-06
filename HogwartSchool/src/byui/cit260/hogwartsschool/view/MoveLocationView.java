/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.MapControl;
import hogwartsschool.HogwartsSchool;
import java.util.Scanner;

/**
 *
 * @author lmcqueen
 */
public class MoveLocationView {
    
    private final String LOCATIONS = "\n\nPotions\n" +
                                        "Charms\n" +
                                        "Ancient Runes\n" +
                                        "Defense Against the Dark Arts\n" + 
                                        "Astronomy\n" +
                                        "Transfiguration\n" +   
                                        "Divination\n" +    
                                        "Herbology\n" + 
                                        "Flying\n" +    
                                        "Care of Magical Creatures\n" + 
                                        "Great Hall\n" +
                                        "Quidditch Field\n" +
                                        "Bathroom\n\n";
    
    public void moveLocation() {
        
        this.displayInstruction();
        
        String input = this.getInput();
        
        this.doAction(input);
        
    }
    
      public void displayInstruction() {
       
        System.out.println("You are currently located at " + HogwartsSchool.getPlayer().getCurrentLocationName());
       
        System.out.println("Where would you like to go?");
        System.out.println("Options: \n " + LOCATIONS);
    }
      
    private String getInput() {
        
        boolean valid = false;
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        
        while(!valid){
            System.out.println("Please enter the location you would like to go to below:");
            
            input = keyboard.nextLine();
            input = input.trim();
            input = input.toLowerCase();
            
            if(input.length() < 6){
                System.out.println("\n *** Invalid Input. Make sure you write out"
                        + " the entire location name like shown above. ***\n");
                continue;
            }
            
            break;
        }
       
        return input;
    }
    
    public void doAction(String location) {

        switch (location) {
            case "potions":
                MapControl.setPlayerLocation(location);
                System.out.println("You are now in the potions classroom\n");
                PotionsMenuView potionsMenuView = new PotionsMenuView();
                potionsMenuView.displayMenu();
                break;
            case "charms":
                MapControl.setPlayerLocation(location);
                System.out.println("You are now in the charms classroom\n");
                //insert scene menu here
                break;
            case "ancient runes":
                MapControl.setPlayerLocation(location);
                System.out.println("You are now in the ancient runes classroom\n");
                //insert scene menu here
                break;
            case "defense against the dark arts":
                MapControl.setPlayerLocation(location);
                System.out.println("You are now in the defense against the dark arts classroom\n");
                //insert scene menu here
                break;
            case "astronomy":
                MapControl.setPlayerLocation(location);
                System.out.println("You are now in the astronomy classroom\n");
                //insert scene menu here
                break;
            case "transfiguration":
                MapControl.setPlayerLocation(location);
                System.out.println("You are now in the transfiguration classroom\n");
                //insert scene menu here
                break;
            case "divination":
                MapControl.setPlayerLocation(location);
                System.out.println("You are now in the divination classroom\n");
                //insert scene menu here
                break;
            case "herbology":
                MapControl.setPlayerLocation(location);
                System.out.println("You are now in the herbology classroom\n");
                //insert scene menu here
                break;
            case "flying":
                MapControl.setPlayerLocation(location);
                System.out.println("You are now in the flying classroom\n");
                FlyingMenuView flying = new FlyingMenuView();
                flying.displayMenu();
                break;
            case "care of magical creatures":
                MapControl.setPlayerLocation(location);
                System.out.println("You are now in the magical creatures classroom\n");
                //insert scene menu here
                break;
            case "great hall":
                MapControl.setPlayerLocation(location);
                System.out.println("You are now in the great hall\n");
                //insert scene menu here
                break;
            case "quidditch field":
                MapControl.setPlayerLocation(location);
                System.out.println("You are now on the quidditch field\n");
                //insert scene menu here
                break;
            case "Bathroom":
                MapControl.setPlayerLocation(location);
                System.out.println("You are now in the bathroom\n");
                //insert scene menu here
                break;
            default:
                System.out.println(" *** You have entered an invalid location. Your location has not changed ***");
                break;
        }
    }
}
