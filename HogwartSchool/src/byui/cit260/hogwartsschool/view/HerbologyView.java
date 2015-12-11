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
            System.out.println("\n *** Invalid Selection. Enter only a single character. ***\n");
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
                System.out.println("\n*** Invalid selection. Try again. ***");
                break;  
        } 
        
        return false;
   }

    private void displayInstructions() {
        System.out.println("First observe the plant based on what learned in the lecture and then move to identify tab to indentify the plant");
    }

    private void displayObservePlant() {
        System.out.println("You are observing a plant that has glowing objects inside it, and if you touch it or pork it, it stars glowing ");
        //FlyingView myFlyingView = new FlyingView();
         //myFlyingView.display();
    }

    private void displayIdentify() {
        System.out.println("Type in what you observe here. ");}
        String identify = this.getInput();
        //HerbologyView myHerbologyView = new HerbologyView();
        //myHerbologyView.display();
        

        


    
}
