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
            +"\nTemporary menus for testing: P-Potions F-Flying A-Astronomy"
            + "\nE - Exit"
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
                
                //TEMPORARY FOR TESTING MUST FIX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            case 'P':
                this.tempPotions();
                break;
            case 'A':
                this.tempAstronomy();
                break;
            case 'F':
                this.tempFlying();
                break;
            case 'E':
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection. Try again. ***");
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
        this.console.println("\n*** getSavedGame stub function called ***\n");
    }

     private void getHelp() {
         
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
     
    private void saveGame() {
        this.console.println("Enter the filepath of where you would like to save your game.");
        
        String filePath = this.getInput();
    }
    
    
    
    
    

    private void tempPotions() {
        PotionsMenuView potionsMenu = new PotionsMenuView();
        potionsMenu.display();
    }

    private void tempAstronomy() {
       AstronomyMenuView astronomyMenu = new AstronomyMenuView();
       astronomyMenu.display();
    }

    private void tempFlying() {
       FlyingMenuView flying = new FlyingMenuView();
       flying.display();
    }
    
}
