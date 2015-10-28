/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.ProgramControl;
import byui.cit260.hogwartsschool.model.Player;
import java.util.Scanner;

/**
 *
 * @author lmcqueen and Johnson
 */
public class StartProgramView {
    
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
    }
    
    public void startProgram(){
        
        this.displayBanner();
        
        String playerName = this.getPlayerName();
        Player player = ProgramControl.createPlayer(playerName);
        
        this.displayWelcomeMessage(player);
        
        
        
    }
    
    public void displayBanner(){
        System.out.println("Display banner here");
        
    }
    
    public String getPlayerName(){
        
        boolean valid = false;
        String playerName = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            
            System.out.println("Please enter player's name below:");
            
            playerName = keyboard.nextLine();
            playerName = playerName.trim();
            
            if(playerName.length() < 2){
                System.out.println("Invalid name - the name must not be blank \n"
                        + "and must have more than one character.");
                continue;
            }
            
            break;
        }
        
        return playerName;
    }
    
    public void displayWelcomeMessage(Player player){
        System.out.println("\n\n================================================");
        System.out.println("\tWelcome to Hogwarts " + player.getName());
        System.out.println("\tWe hope you have fun!");
        System.out.println("================================================");

    } 
            
}
