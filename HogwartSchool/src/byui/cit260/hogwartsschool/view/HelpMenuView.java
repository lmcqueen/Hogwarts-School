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
        this.console.println("The goal of the game is to have the most points by"
                + "\nthe end of the game. Help your house earn the most points.");
    }

    private void displayMoveHelp() {
        this.console.println("To move around the map use the menu options given."
                + "\nYou cannot move from one classroom to another. You must move"
                + "\nthrough the hallways.");
    }

    private void getPointsHelp() {
        this.console.println("Points for your house are earned through completing"
                + "\nclass assignments and activities. The other houses will also"
                + "\nearn points throughout the game, so earn as many points as "
                + "\nyou can to win. You will also earn points by getting questions"
                + "\nright on the final exam.");}

    private void getHouseHelp() {
        this.console.println("Hogwarts has four different houses. At the beginning"
                + "\nof the game you will be sorted into a house. You will earn"
                + "\npoints for your house to win the game.");
    }

    private void getNotesHelp() {
        this.console.println("If you would like, keep notes of things you learn "
                + "\nfrom courses and people in the hallways. Some of the facts "
                + "\nthat are given will show up on the final exam. You will be "
                + "\nable to access your notes during the exam.");
    }

    
}
