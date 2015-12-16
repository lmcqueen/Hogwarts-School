/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.HouseControl;
import byui.cit260.hogwartsschool.exceptions.HouseControlException;
import hogwartsschool.HogwartsSchool;

/**
 *
 * @author lmcqueen
 */
public class QuidditchView extends View {

    public QuidditchView() {
        super("\n------------------------------------------------"
                + "\n|               Quidditch Pitch Menu            |"
                + "\n------------------------------------------------"
                + "\nV - View Quidditch Game"
                + "\nL - Leave"
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
            case 'V':
                this.viewGame();
                break;
            case 'L':
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection. Try again. ***");
                break;
        }
        return false;
    }

    private void viewGame() {
        this.console.println("You watched the quidditch match. " + HogwartsSchool.getCurrentGame().getPlayer().getHouse().getName() + " won! Your house got 10 points.");
        try {
            HouseControl.addPoints(10);
        } catch (HouseControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

}
