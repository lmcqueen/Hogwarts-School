/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import java.util.Scanner;

/**
 *
 * @author lmcqueen
 */
public class HelpMenuView extends View {
    
    public HelpMenuView() {
        super ("\n------------------------------------------------"
        + "\n|               Help Menu                      |"
        + "\n------------------------------------------------"
        + "\nG - What is the goal of the game?" 
        + "\nM - How to move"
        + "\nP - How do I get points?"
        + "\nH - What house am I in?" 
        + "\nN - What are notes?"
        + "\nR - Return to previous selection"
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
            case 'G': 
                this.displayGoalHelp();
                break;
            case 'M':
                this.displayMoveHelp();
                break;
            case 'P':
                this.getPointsHelp();
                break;
            case 'H': 
                this.getHouseHelp();
                break;
            case 'N':
                this.getNotesHelp();
                break;
            case 'R':
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection. Try again. ***");
                break;  
        } 
        
        return false;
   }

    private void displayGoalHelp() {
        this.console.println("*** getGoalHelp stub function called. ***");
    }

    private void displayMoveHelp() {
        this.console.println("*** getMoveHelp stub function called. ***");
    }

    private void getPointsHelp() {
        this.console.println("*** getPointsHelp stub function called. ***");}

    private void getHouseHelp() {
        this.console.println("*** getHouseHelp stub function called. ***");
    }

    private void getNotesHelp() {
        this.console.println("*** getNotesHelp stub function called. ***");
    }

    
}
