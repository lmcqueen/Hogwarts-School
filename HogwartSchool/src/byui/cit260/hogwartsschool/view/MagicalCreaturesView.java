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


/**
 *
 * @author lmcqueen
 */
public class MagicalCreaturesView extends View {

    public MagicalCreaturesView() {
        super("\n------------------------------------------------"
                + "\n|     Care of Magical Creatures Menu            |"
                + "\n------------------------------------------------"
                + "\nI - Instructions"
                + "\nO - Observe"
                + "\nD - Identify"
                + "\nQ - Quit"
                + "\n------------------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;
        value = value.toUpperCase();
        if (value.length() > 1) {
            this.console.println("\n *** Invalid Selection. Enter only a single character. ***\n");
            return false;
        }

        char choice = value.charAt(0);

        switch (choice) {
            case 'I':
                this.displayInstructions();
                break;
            case 'O':
                this.observe();
                break;
            case 'D':
                this.identify();
                break;
            case 'Q':
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection. Try again. ***");
                break;
        }
        return false;
    }

    private void displayInstructions() {
        this.console.println("\n--------------------------------------------------"
                + "To complete this assignment, watch the animal and "
                + "\n enter which animal from the lecture you think it is."
                + "\n--------------------------------------------------");
    }

    private void observe() {
        this.console.println("This curious creature seems to like shiny things."
                + "\nIt keeps trying to steal your watch. It's like a living"
                + "\nmetal detector.");
    }

    private void identify() {
        this.console.println("Enter the type of animal you think you observed:");
        String input = this.getInput();
        input = input.toLowerCase();
        if (input.equals("niffler")) {
            this.console.println("Congratulations! You identified the Niffler."
                    + "\nYou have earned 1 galleon (the niffler stole the rest) and 5 points for your house.");
            try {
                InventoryControl.addGalleons(1);

                HouseControl.addPoints(5);
            } catch (InventoryControlException | HouseControlException ex) {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
            }
        } else {
            this.console.println("That was not the correct creature. Try again.");
        }
    }

}
