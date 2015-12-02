package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.ProgramControl;
import byui.cit260.hogwartsschool.model.Player;

/**
 *
 * @author lmcqueen and Johnson
 */
public class StartProgramView extends View{
    
    /**
     * startProgram(): void
     * BEGIN
     *  Display the banner screen
     *  Get the players name
     *  Create a new player
     *  DISPLAY a customized welcome message
     *  DISPLAY the main menu
     * END 
     */
    
    public StartProgramView(){
        super ("\n\n*************************************************"
            +"*                                                *"
                       + "\n* Welcome to the role playing game Hogwarts      *"
                       + "\n* School where you will be playing a student at  *"
                       + "\n* Hogwarts School of Witchcraft and Wizardry. In *"
                       + "\n* this game you goal is to earn points for one   *"
                       + "\n* of the four Hogwarts houses (Gryffindor,       *"
                       + "\n* Slytherin, Ravenclaw, or Hufflepuff) to win    *"
                       + "\n* the house cup.                                 *" 
                       + "\n* You will be sorted into a house at the"
                       + "\n* beginning of term at Hogwarts. During the game *"
                       + "\n* you will earn points for your house through    *"
                       + "\n* your accomplishments. Your goal is to get your *"
                       + "\n* house to have the most points by the end of    *"
                       + "\n* the school year to win the Hogwarts House Cup. *"
                       + "\n* You will navigate through the school and take  *"
                       + "\n* courses to earn points. There will be a final  *"
                       + "\n* exam at the end of the school year on the      *"
                       + "\n* things you learn in your courses. The test     *"
                       + "\n* will be an opportunity to win a significant    *"
                       + "\n* amount of points for your house.               *" 
                       + "\n\n* Good luck with your first year at Hogwarts!    *"
        
        + "\n\n*************************************************");
        
    }
    
    @Override
    public void display(){
        
        this.console.println(this.getPromptMessage());
        
        String playerName = this.getInput();
        Player player = ProgramControl.createPlayer(playerName);
        
        this.doAction(player); 
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
    
    @Override
    public boolean doAction(Object obj){
        Player player = (Player) obj;
        
        this.console.println("\n\n================================================");
        this.console.println("\tWelcome to Hogwarts " + player.getName());
        this.console.println("\tWe hope you enjoy your first year here.");
        this.console.println("================================================");
        
        return true;
    } 
            
}
