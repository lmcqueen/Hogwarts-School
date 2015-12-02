/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;


/**
 *
 * @author lmcqueen
 */
public class AstronomyMenuView extends View{
    
   /**
    * steps:
    * Display message describing class
    * Display Menu
    * Get menu option
    * Perform Action
    
    */
    
    public AstronomyMenuView() {
        super("\n------------------------------------------------"
        + "\n|               Astronomy Class Menu                      |"
        + "\n------------------------------------------------"
        + "\nI - Instructions" 
        + "\nC - Calculate"
        + "\nF - Finish"
        + "\n-----------------------------------------");
    }
    
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
            case 'C':
                this.calculate();
                break;
            case 'F':
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection. Try again. ***");
                break;  
        }
        return false;
    }

    private void displayInstructions() {
        
        this.console.println("displayInstructions() stub function called ");
    }

    private void calculate() {
        AstronomyView astronomyView = new AstronomyView();
        astronomyView.display();
    }
    
}
