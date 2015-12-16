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
public class HerbologyView extends View {
    
       public HerbologyView() {
        super("\n------------------------------------------------"
        + "\n|               Herbology Menu                      |"
        + "\n------------------------------------------------"
        + "\nI - Instructions" 
        + "\nO - Observe Plant"
        + "\nD - Identify"
        + "\nF - Finish"
        + "\n-----------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase();
        if(value.length() > 1){
            ErrorView.display(this.getClass().getName(),"\n *** Invalid Selection. Enter only a single character. ***\n");
            return false;
        }

        char choice = value.charAt(0);
        
        switch (choice) {
            case 'I': 
                this.displayInstructions();
                break;
            case 'O':
                this.displayObservePlant();
                break;
            case 'D':
                this.displayIdentify();
                break;
            case 'F':
                return true;
            default:
                this.console.println("\n*** Invalid selection. Try again. ***");
                break;  
        } 
        
        return false;
   }

    private void displayInstructions() {
        this.console.println("First observe the plant based on what learned in the lecture and then move to identify tab to indentify the plant");
    }

    private void displayObservePlant() {
        this.console.println("You are observing a plant that has glowing objects inside it, and if you touch it or pork it, it stars glowing ");
        //FlyingView myFlyingView = new FlyingView();
         //myFlyingView.display();
    }

    private void displayIdentify() {
        this.console.println("Type in what you observe here. ");
        String identify = this.getInput();
        if (identify.equals("Puffapod")) {
            this.console.println("You are right, proceed with the game");
            
        }
        
       //if the value is equall to puffapod, 
            // then call funtion of Leah control
       //else 
            // display an error message
       //
        
    }       
 }   


    

