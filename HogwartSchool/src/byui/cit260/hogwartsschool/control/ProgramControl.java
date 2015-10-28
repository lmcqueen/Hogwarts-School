/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import byui.cit260.hogwartsschool.model.Player;

/**
 *
 * @author User
 */
public class ProgramControl {
    
    public ProgramControl(){
    }
    
    public static Player createPlayer(String playerName){
        
        if(playerName == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(playerName);
        
        
        return null;
    }
    
}
