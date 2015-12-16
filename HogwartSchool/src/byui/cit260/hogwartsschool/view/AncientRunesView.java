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
public class AncientRunesView extends View{

    public AncientRunesView() {
        super("\n------------------------------------------------"
        + "\n|               Ancient Runes Menu             |"
        + "\n------------------------------------------------"
        + "\nI - Instructions"
        + "\nK - View Key"
        + "\nT - Translate"
        + "\nQ - Quit"
        + "\n------------------------------------------------");
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
            case 'K':
                this.viewKey();
                break;
            case 'T':
                this.translate();
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
        this.console.println("\n-----------------------------------------------------------"
                + "\nTo complete your assignment, you must translate the following"
                + "\nancinet rune message: @^9#9?9$@. View the key to see what each"
                + "\nsymbol stands for. When you have decoded the message enter"
                + "\nyour answer in the translate to see if you are correct. "
                + "\n-----------------------------------------------------------");
    }

    private void viewKey() {
        this.console.println("\nKey:"
                + "\n^ = 'L'"
                + "\n# = 'H'"
                + "\n@ = 'A'"
                + "\n$ = 'R'"
                + "\n? = 'M"
                + "\n9 = 'O");
    }

    private void translate() {
        this.console.println("Enter your translation:");
        String getInput = this.getInput();
        getInput = getInput.toLowerCase();
        if(getInput.equals("alohomora")){
            this.console.println("Congratulations! You decoded the code the word. "
                    + "Alohomora is a spell for unlocking locks. "
                    + "\nYou have earned 5 galleons and 8 points for your house.");
            
            try {
                InventoryControl.addGalleons(5);
            } catch (InventoryControlException ex) {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
            }
            try {
                HouseControl.addPoints(8);
            } catch (HouseControlException ex) {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
            }
        }
    }
    
}
