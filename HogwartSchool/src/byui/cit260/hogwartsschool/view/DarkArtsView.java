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
public class DarkArtsView extends View{

    private ArrayList<String> selections = new ArrayList<>();
    
    public DarkArtsView() {
        super("\n------------------------------------------------"
           + "\n|     Defense Against the Dark Arts Menu         |"
            + "\n------------------------------------------------"+
                "\nI - Instructions" +
                "\nD - Disarm" +
                "\nS - Stun" +
                "\nB - Bow" +
                "\nF - Finish" +
                "\nQ - Quit"
                +"\n------------------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
     
        String value = (String) obj;
        value = value.toUpperCase();
        if(value.length() > 1){
            this.console.println("\n *** Invalid Selection. Enter only a single character. ***\n");
            return false;
        }
        
        char choice = value.charAt(0);
        
        switch(choice){
            case 'I':
                this.displayInstructions();
                break;
            case 'D':
                this.disarm();
                break;
            case 'S':
                this.stun();
                break;
            case 'B':
                this.bow();
                break;
            case 'F':
                this.finish();
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
                + "\nTo duel your opponent, you must first be curtious"
                + "\nand bow to your opponent. After you have bowed, you"
                + "\nshould try to disarm your opponent. Once they are"
                + "\ndisarmed, stun your opponent. When you have done"
                + "\nthese steps, enter the finish option."
                + "\n--------------------------------------------------");
    }

    private void disarm() {
        selections.add("disarm");
        this.console.println("You attempt to disarm your opponent.");
    }

    private void stun() {
        selections.add("stun");
        this.console.println("You used a stuning charm on your opponent");
    }

    private void bow() {
        selections.add("bow");
        this.console.println("You bowed to your opponent");
    }

    private void finish() {
        String[] correctAnswer = {"bow", "disarm", "stun"};
        
        if(correctAnswer.length != selections.size()){
            this.console.println("\nYou got hit by a stun charm and lost the duel. Maybe you'll get it next time.");
        }
        else{
            boolean match = true;
            for(int i = 0; i < correctAnswer.length; i++){
                if(correctAnswer[i] != selections.get(i)){
                    this.console.println("\nYou got hit by a stun charm and lost the duel. Maybe you'll get it next time.");
                    match = false;
                    break;
                }
            }
            if(match == true){
                this.console.println("Congratulations! You won the duel. "
                    + "\nYou have earned 7 galleons and 6 points for your house.");
                try {
                    InventoryControl.addGalleons(7);
                } catch (InventoryControlException ex) {
                    ErrorView.display(this.getClass().getName(), ex.getMessage());
                }
                try {
                    HouseControl.addPoints(6);
                } catch (HouseControlException ex) {
                    ErrorView.display(this.getClass().getName(), ex.getMessage());
                }
            }
        }
        
        selections = new ArrayList<>();
    }
    
}
