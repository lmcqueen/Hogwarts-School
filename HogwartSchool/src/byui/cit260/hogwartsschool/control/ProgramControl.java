/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import byui.cit260.hogwartsschool.exceptions.ProgramControlException;
import byui.cit260.hogwartsschool.model.Player;
import hogwartsschool.HogwartsSchool;

/**
 *
 * @author User
 */
public class ProgramControl {
    
    public ProgramControl(){
    }
    
    public static Player createPlayer(String playerName)throws ProgramControlException { 
        
        if(playerName == null){
            throw new ProgramControlException("The player name is invalid. "
                    + "input a valid name.");
        }
        
        Player player = new Player();
        player.setName(playerName);
        
        HogwartsSchool.setPlayer(player);
        
        return player;
    }
    
}
