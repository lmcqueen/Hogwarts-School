/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.HouseControl;
import byui.cit260.hogwartsschool.control.InventoryControl;
import byui.cit260.hogwartsschool.exceptions.HouseControlException;
import byui.cit260.hogwartsschool.exceptions.InventoryControlException;
import java.util.ArrayList;

/**
 *
 * @author lmcqueen
 */
public class PotionsMenuView extends View {

    ArrayList<String> selections = new ArrayList<>();

    public PotionsMenuView() {
        super("\n------------------------------------------------"
                + "\n|               Potions Class Menu             |"
                + "\n------------------------------------------------"
                + "\nI - Instructions"
                + "\nS - Add spiders"
                + "\nN - Add newts"
                + "\nW - Add water"
                + "\nM - Mix"
                + "\nQ - Quit"
                + "\n-----------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;
        value = value.toUpperCase();
        if (value.length() > 1) {
            ErrorView.display(this.getClass().getName(), "\n *** Invalid Selection. Enter only a single character. ***\n");
            return false;
        }

        char selection = value.charAt(0);
        //SWITCH selection
        switch (selection) {
            //“I”: Display Instructions
            case 'I':
                this.displayInstructions();
                break;
            //“S”: Add spiders to potion
            case 'S':
                this.addSpider();
                break;
            //“N”: Add newts to potion
            case 'N':
                this.addNewts();
                break;
            //“W”: Add water to potion
            case 'W':
                this.addWater();
                break;
            //"M": Mix potion
            case 'M':
                this.mix();
                break;
            //“F”: return 
            case 'Q':
                return true;
            //OTHERWISE: DISPLAY “Invalid selection” 
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection. Try again. ***");
                break;
        }

        return false;
    }

    private void displayInstructions() {
        this.console.println("\n--------------------------------------------------"
                + "To create the potion first add the spiders, newts, "
                + "\nfollowed by spiders again. Add water after that. "
                + "\nPut in any size for your cauldron's diameter and"
                + "\ndepth. When you finish adding these ingredients,"
                + "\nmix them all together."
                + "\n--------------------------------------------------");
    }

    private void addSpider() {
        this.console.println("You added spiders to your potion.");
        selections.add("spiders");
    }

    private void addNewts() {
        this.console.println("You added newts to your potion.");
        selections.add("newts");
    }

    private void addWater() {
        PotionsView potionsView = new PotionsView();
        potionsView.display();
        selections.add("water");
    }

    private void mix() {
        if (selections.size() == 4) {
            if (selections.get(0).equals("spiders") && selections.get(1).equals("newts") && selections.get(2).equals("spiders") && selections.get(3).equals("water")) {
                this.console.println("Congratulations! You correctly made the potion to cure boils."
                        + "\nYou have earned 10 galleons and 12 points for your house.");
                try {
                    InventoryControl.addGalleons(10);

                    HouseControl.addPoints(12);

                } catch (InventoryControlException | HouseControlException ex) {
                    ErrorView.display(this.getClass().getName(), ex.getMessage());
                }
            } else {
                this.console.println("You tested your potion and it created boils instead of cured them. Try again.");
            }
        } 
        else {
            this.console.println("You tested your potion and it exploded. Maybe it will work next time. Try again.");
        }

        selections = new ArrayList<>();
    }
}
