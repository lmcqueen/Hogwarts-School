package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.GameControl;
import byui.cit260.hogwartsschool.exceptions.GameControlException;
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
            + "\n------------------------------------------------");
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
            case 'E':
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection. Try again. ***");
                break; 
        } 
        return false;
    }

    private void startNewGame() {
        
        try {
            GameControl.createNewGame(HogwartsSchool.getPlayer());
        } catch (GameControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        
        GreatHallView greatHall = new GreatHallView();
        greatHall.display();
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
    }

    private void getSavedGame() {
        this.console.println("Enter the filepath to where your game is saved.");
        
        String filePath = this.getInput();
        
        try{
            GameControl.getSavedGame(filePath);
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
            
        }catch(GameControlException ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
    }

     private void getHelp() {
         
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
     
    private void saveGame() {
        this.console.println("Enter the filepath of where you would like to save your game.");
        
        String filePath = this.getInput();
         try{
             GameControl.saveGame(HogwartsSchool.getCurrentGame(), filePath);
         } catch (Exception ex){
             ErrorView.display("MainMenuView", ex.getMessage());
         }
    }
   
}
