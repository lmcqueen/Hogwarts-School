/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

/**
 *
 * @author Johnson and lmcqueen
 */
public class FlyingMenuView extends View {
    
    public FlyingMenuView() {
        super("\n------------------------------------------------"
        + "\n|               Fly Menu                      |"
        + "\n------------------------------------------------"
        + "\nI - Instructions" 
        + "\nC - Calculate"
        + "\nY - Fly"
        + "\nF - Finish"
        + "\n-----------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase();
        if(value.length() > 1){
            System.out.println("\n *** Invalid Selection. Enter only a single character. ***\n");
            return false;
        }

        char choice = value.charAt(0);
        
        switch (choice) {
            case 'I': 
                this.displayInstructions();
                break;
            case 'C':
                this.displayCalculate();
                break;
            case 'Y':
                this.displayFly();
                break;
            case 'F':
                return true;
            default:
                System.out.println("\n*** Invalid selection. Try again. ***");
                break;  
        } 
        
        return false;
   }

    private void displayInstructions() {
        System.out.println("Use the results of the averageAcceleration gotten to fly, if the result is wrong.Try again");
    }

    private void displayCalculate() {
        FlyingView myFlyingView = new FlyingView();
         myFlyingView.display();
    }

    private void displayFly() {
        System.out.println("If Average Acceleration is right; Congratulation. You can now fly. If wrong, please try again ");}


    
}
