/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import java.util.Random;

/**
 *
 * @author Johnson
 */
public class TransfigurationView extends View {
    int requiredWands;
    int requiredIncantations;
    int wand;
    int incantation;

    public TransfigurationView(String promptMessage) {
        super(promptMessage);
    }


    public TransfigurationView() {
        super("\n------------------------------------------------"
                + "\n|               Transfiguration Menu                      |"
                + "\n------------------------------------------------"
                + "\nI - Instructions"
                + "\nW – Wave wand"
                + "\nC - Incantation"
                + "\nQ - Quit"
                + "\n-----------------------------------------");
        
        
        // generate random values for number warns needed and incantations needed
        
        Random rn = new Random();
        requiredWands = rn.nextInt(5);
        
        rn = new Random();
        requiredIncantations = rn.nextInt(5);
       // set the number warnds selected and incantations selected to zero's
        wand = 0;
        incantation = 0;
        
               
        
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;
        value = value.toUpperCase();
        if (value.length() > 1) {
            ErrorView.display(this.getClass().getName(), "\n *** Invalid Selection. Enter only a single character. ***\n");
            return false;
        }

        char choice = value.charAt(0);

        switch (choice) {
            case 'I':
                this.displayInstructions();
                break;
            case 'W':
                this.displayWaveWand();
                break;
            case 'C':
                this.displayIncantation();
                break;
           
            case 'Q':
                return true;
            default:
                this.console.println("\n*** Invalid selection. Try again. ***");
                break;
        }

        return false;
    }

    private void displayInstructions() {
        this.console.println("To turn a match into a niddle, you need to wave a wand two times and doThis is a charm that transform one thing into an entirely different thing");
    }

    private void displayWaveWand() {
        this.console.println("Used this burton to wave a wand ");
        wand = wand+1;
        

    }

    private boolean displayIncantation() {
        this.console.println("Used this burtton for incantation ");
        incantation++;
        
        if (requiredWands == wand && requiredIncantations == incantation){
            return true;
        
        else{ 
                
}
}
        return false;
    }
}
  // will have an arraylist that will collect
                // check the arraylist, make sure they are of the same sixe. If not, made an error
                // check if the user type the things in the right order
                // do whatever message if they get right or wrong
                // a code to reset the arraylist at the very end of everything
//}

        
