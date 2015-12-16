/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

/**
 *
 * @author Johnson
 */
public class TransfigurationView extends View {
    
    public TransfigurationView() {
        super("\n------------------------------------------------"
        + "\n|               Transfiguration Menu                      |"
        + "\n------------------------------------------------"
        + "\nI - Instructions" 
        + "\nW – Wave wand"
        + "\nC - Incantation"
        + "\nF - Finish"
        + "\nQ - Quit"
        + "\n-----------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase();
        if(value.length() > 1){
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
            case 'F':
                this.displayFinish();
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

    private void displayWaveWand () {
        this.console.println("Used this burton to wave a wand ");
        
    }

    private void displayIncantation () {
        this.console.println("Used this burtton for incantation ");}
        
        
    private void displayFinish() {
        // will have an arraylist that will collect
        // check the arraylist, make sure they are of the same sixe. If not, made an error
        // check if the user type the things in the right order
            // do whatever message if they get right or wrong
                // a code to reset the arraylist at the very end of everything
    }
        

        


    
}

    
