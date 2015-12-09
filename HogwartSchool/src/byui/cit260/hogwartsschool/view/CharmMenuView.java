/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.GameControl;
import hogwartsschool.HogwartsSchool;


/**
 *
 * @author Johnson
 */
public class CharmMenuView extends View {
    
      public CharmMenuView() {
        super("\n------------------------------------------------"
            + "\n|               Charm Menu                      |"
            + "\n------------------------------------------------"
            + "\nI - Get Instructions" 
            + "\nS - Get Switch"
            + "\nK - Get Flick"
            + "\nC - Get Incantation"
            + "\nF - Finish"
            + "\nE - Exit"
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
                this.getInstructions();
                break;
            case 'S':
                this.getSwitch();
                break;
            case 'K':
                this.getFlick();
                break;
            case 'C': 
                this.getIncantation();
                break;
            case 'F': 
                this.getFinish();
                break;
            case 'E':
                return true;
            default:
                System.out.println("\n*** Invalid selection. Try again. ***");
                break; 
        } 
        return false;
    }

  private void getInstructions() {
       
        System.out.println("\n To perform the charm, follow this steps. Use the getSwitch and getFlick once \n");
    }

    private void getSwitch() {
        System.out.println("\n*** getSwitch stub function called ***\n");
    }

    private void getFlick() {
        
        System.out.println("\n*** getFlick stub function called ***\n");
    }

    private void getIncantation() {
        System.out.println("\n To get incantation follow this steps. Click getSwitch and getFlick two times each. \n");
    }
    
    private void getFinish() {
        System.out.println("\n*** getFinish stub function called ***\n");
    }
    

}
