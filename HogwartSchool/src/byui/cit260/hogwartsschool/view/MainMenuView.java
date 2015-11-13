package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.GameControl;
import hogwartsschool.HogwartsSchool;

/**
 *
 * @author lmcqueen and Johnson
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n------------------------------------------------"
            + "\n|               Main Menu                      |"
            + "\n------------------------------------------------"
            + "\nN - Start New Game" 
            + "\nG - Get Saved Game"
            + "\nH - Get Help"
            + "\nS - Save Game" 
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
            case 'N': 
                this.startNewGame();
                break;
            case 'G':
                this.getSavedGame();
                break;
            case 'H':
                this.getHelp();
                break;
            case 'S': 
                this.saveGame();
                break;
            case 'E':
                return true;
            default:
                System.out.println("\n*** Invalid selection. Try again. ***");
                break; 
        } 
        return false;
    }

    private void startNewGame() {
        
        GameControl.createNewGame(HogwartsSchool.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
    }

    private void getSavedGame() {
        System.out.println("\n*** getSavedGame stub function called ***\n");
    }

     private void getHelp() {
         
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
     
    private void saveGame() {
        System.out.println("\n*** saveGame stub function called ***\n");
    }
    
}
