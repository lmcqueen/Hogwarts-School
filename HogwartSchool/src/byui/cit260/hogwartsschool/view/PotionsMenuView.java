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
public class PotionsMenuView extends View {
    
     public PotionsMenuView() {
         super("\n------------------------------------------------"
        + "\n|               Potions Class Menu             |"
        + "\n------------------------------------------------"
        + "\nI - Instructions" 
        + "\nS - Add spiders" 
        + "\nN - Add newts" 
        + "\nW - Add water" 
        + "\nM - Mix" 
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
        
        char selection = value.charAt(0);
        //SWITCH selection
        switch(selection){
            //“I”: Display Instructions
            case 'I':
                this.displayInstructions();
                break;
            //“S”: Add spiders to potion
            case 'S':
                this.addSpider();
                break;
            //“N”: Add newts to potion
            case 'N':
                this.addNewts();
                break;
            //“W”: Add water to potion
              case 'W':
                this.addWater();
                break;  
            //"M": Mix potion
            case 'M':
                 this.mix();
                 break;
            //“F”: return 
            case 'F':
                return true;
            //OTHERWISE: DISPLAY “Invalid selection” 
            default:
                System.out.println("\n*** Invalid selection. Try again. ***");
                break;  
        }
        
        return false;
    }
    
     private void displayInstructions() {
        System.out.println("Stub function for diplaying instructions.");
     }

    private void addSpider() {
        System.out.println("Stub function for addSpider.");
    }

    private void addNewts() {
        System.out.println("Stub function for addNewts.");
     }
    
    private void addWater() {
        PotionsView potionsView = new PotionsView();
        potionsView.display();
    }

    private void mix() {
       System.out.println("Stub function for mixing the potion.");
    }
}
