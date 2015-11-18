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
                + "\n\nPotions\n"
                + "Charms\n"
                + "Ancient Runes\n"
                + "Defense Against the Dark Arts\n"
                + "Astronomy\n"
                + "Transfiguration\n"
                + "Divination\n"
                + "Herbology\n"
                + "Flying\n"
                + "Care of Magical Creatures\n"
                + "Great Hall\n"
                + "Quidditch Field\n"
                + "Bathroom\n\n"
                + "Enter \"e\" to return to game menu \n\n");
    }
    
    @Override 
    public boolean doAction(Object obj) {
        
        String location = (String) obj;
        location = location.toLowerCase();
        
        switch (location) {
            case "potions":
                MapControl.setPlayerLocation(location);
                System.out.println("You are now in the potions classroom\n");
                PotionsMenuView potionsMenuView = new PotionsMenuView();
                potionsMenuView.display();
                break;
            case "charms":
                MapControl.setPlayerLocation(location);
                System.out.println("You are now in the charms classroom\n");
                //insert scene menu here
                CharmMenuView charmMenuView = new CharmMenuView();
                charmMenuView.display();
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
                flying.display();
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
            case "bathroom":
                MapControl.setPlayerLocation(location);
                System.out.println("You are now in the bathroom\n");
                //insert scene menu here
                break;
            case "e":
                return true;
            default:
                System.out.println(" *** You have entered an invalid location. Your location has not changed ***");
                break;
        }
        return false;
    }
}
