/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.MapControl;
import hogwartsschool.HogwartsSchool;

/**
 *
 * @author lmcqueen
 */
public class MoveLocationView extends View{
    
    public MoveLocationView() {
        super("You are currently located at " + HogwartsSchool.getPlayer().getCurrentLocationName()
                + " Where would you like to go?"
                + " Options: \n "
                + "\n\nP - Potions\n"
                + "C - Charms\n"
                + "A - Ancient Runes\n"
                + "D - Defense Against the Dark Arts\n"
                + "S - Astronomy\n"
                + "T - Transfiguration\n"
                + "I - Divination\n"
                + "H - Herbology\n"
                + "F - Flying\n"
                + "M - Care of Magical Creatures\n"
                + "G - Great Hall\n"
                + "Q - Quidditch Field\n"
                + "B - Bathroom\n"
                + "R - Return \n\n");
    }
    
    @Override 
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase();
        if(value.length() > 1){
            System.out.println("\n *** Invalid Selection. Enter only a single character. ***\n");
            return false;
        }
        
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'P':
                MapControl.setPlayerLocation("Potions");
                System.out.println("You are now in the potions classroom\n");
                PotionsMenuView potionsMenuView = new PotionsMenuView();
                potionsMenuView.display();
                break;
            case 'C':
                MapControl.setPlayerLocation("Charms");
                System.out.println("You are now in the charms classroom\n");
                //insert scene menu here
                CharmMenuView charmMenuView = new CharmMenuView();
                charmMenuView.display();
                break;
            case 'A':
                MapControl.setPlayerLocation("Ancient Ruins");
                System.out.println("You are now in the ancient runes classroom\n");
                //insert scene menu here
                break;
            case 'D':
                MapControl.setPlayerLocation("Defense Against the Dark Arts");
                System.out.println("You are now in the defense against the dark arts classroom\n");
                //insert scene menu here
                break;
            case 'S':
                MapControl.setPlayerLocation("Astronomy");
                System.out.println("You are now in the astronomy classroom\n");
                AstronomyMenuView astronomyMenuView = new AstronomyMenuView();
                astronomyMenuView.display();
                break;
            case 'T':
                MapControl.setPlayerLocation("Transfiguration");
                System.out.println("You are now in the transfiguration classroom\n");
                //insert scene menu here
                break;
            case 'I':
                MapControl.setPlayerLocation("Divination");
                System.out.println("You are now in the divination classroom\n");
                //insert scene menu here
                break;
            case 'H':
                MapControl.setPlayerLocation("Herbology");
                System.out.println("You are now in the herbology classroom\n");
                //insert scene menu here
                break;
            case 'F':
                MapControl.setPlayerLocation("Flying");
                System.out.println("You are now in the flying classroom\n");
                FlyingMenuView flying = new FlyingMenuView();
                flying.display();
                break;
            case 'M':
                MapControl.setPlayerLocation("Care of Magical Creatures");
                System.out.println("You are now in the magical creatures classroom\n");
                //insert scene menu here
                break;
            case 'G':
                MapControl.setPlayerLocation("Great Hall");
                System.out.println("You are now in the great hall\n");
                //insert scene menu here
                break;
            case 'Q':
                MapControl.setPlayerLocation("Quidditch Field");
                System.out.println("You are now on the quidditch field\n");
                //insert scene menu here
                break;
            case 'B':
                MapControl.setPlayerLocation("Bathroom");
                System.out.println("You are now in the bathroom\n");
                //insert scene menu here
                break;
            case 'R':
                return true;
            default:
                System.out.println(" *** You have entered an invalid location. Your location has not changed ***");
                break;
        }
        return false;
    }
}
