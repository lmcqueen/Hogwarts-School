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
public class DivinationView extends View{

    private ArrayList<String> selection = new ArrayList<>();
    
    public DivinationView() {
        super("\n------------------------------------------------"
           + "\n|               Divination Menu                  |"
           + "\n------------------------------------------------"+
                "\nI - Instructions" +
                "\nT - Drink tea" +
                "\nL - Look at tea leaves" +
                "\nD - Decipher meaning" +
                "\nQ - Quit" +
        "\n------------------------------------------------");
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
            case 'T':
                this.drinkTea();
                break;
            case 'L':
                this.lookAtLeaves();
                break;
            case 'D':
                this.decipher();
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
        this.console.println("To read your tea leaves, the first thing you must"
                + "\ndo is drink your tea. Then look at your tea leaves"
                + "\nand decide from the lecture what the meaning of "
                + "\nthe symbol you see is. Decipher the meaning by "
                + "\nentering your answer.");
    }

    private void drinkTea() {
        selection.add("drink");
        this.console.println("You drank the tea.");
    }

    private void lookAtLeaves() {
        selection.add("look");
        this.console.println("You look at your tea leaves. There is a small sun shape, though it could just be a blob.");
    }

    private void decipher() {
        
        if(selection.size() == 2) {
            if(selection.get(0).equals("drink") && selection.get(1).equals("look")){
                this.console.println("What do you foresee from the leaves? Enter one of the following: "
                        + "\nhappiness"
                        + "\ndeath"
                        + "\nwealth"
                        + "\ntrials");
                String input = this.getInput();
                input = input.toLowerCase();
                if(input.equals("happiness")){
                    try {
                        this.console.println("Congratulations! You correctly read the tea leaves. "
                                + "\nYou have earned 2 galleons and 4 points for your house.");
                        try {
                            InventoryControl.addGalleons(2);
                        } catch (InventoryControlException ex) {
                            ErrorView.display(this.getClass().getName(), ex.getMessage());
                        }
                        HouseControl.addPoints(4);
                    } catch (HouseControlException ex) {
                        ErrorView.display(this.getClass().getName(), ex.getMessage());
                    }
                }
                else{
                    this.console.println("You didn't decipher the tea leaves properly. Pour another cup of tea and try again.");
                }
            }
            else{
                this.console.println("You didn't drink your tea properly. Pour another cup and try again.");
            }
        }
        else{
            this.console.println("You didn't drink your tea properly. Pour another cup and try again.");
        }
        
        selection = new ArrayList<>();
    }
    
}
