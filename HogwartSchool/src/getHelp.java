
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Johnson
 */
public class getHelp {
    
    private void getSomeHelp() {
   
        
         final String help = "\n"  + "\n-----------------------------------------"
            + "\n Help Menu                              |"
            + "\n-----------------------------------------"
            + "\nG - Game Goal" 
            + "\nM - How to move"
            + "\nP - How to earn Point"
            + "\nH - What House In" 
            + "\nN - What are Notes" 
            + "\nQ - Quit"
            + "\n-----------------------------------------";
         
    }
    
    public void displayHelp() {
        
        char selection = ' ';
        do{
            
            System.out.println();
            
            String input = this.getInput();
            selection = input.charAt(0);
            
             this.doAction(selection);
            
        }while(selection != 'Q');
    }

    private String getInput() {
        
        boolean valid = false;
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        
        while(!valid){
            System.out.println("Please enter a menu option below:\n");
            
            input = keyboard.nextLine();
            input = input.trim();
            
            if(input.length() > 1){
                System.out.println("Please enter only a single character");
                continue;
            }
            
            break;
        }
       
        return input;
    }

    private void doAction(char choice) {
        
        switch (choice) {
            case 'G': 
                this.gameGoal();
                break;
            case 'M':
                this.howToMove();
                break;
            case 'P':
                this.howToEarnPoint();
                break;
            case 'H': 
                this.whatHouseIn();
                break;
            case 'N':
                this.whatAreNotes();
                break;
            case 'Q':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
             
        }
        
   }

    private void gameGoal() {
    }

    private void howToMove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    private void howToEarnPoint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void whatAreNotes() {
        throw new UnsupportedOperationException("Not supported yet."); 
        
    
    }

    private void whatHouseIn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

    