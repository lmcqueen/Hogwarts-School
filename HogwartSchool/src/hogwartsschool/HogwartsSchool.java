/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsschool;

import byui.cit260.hogwartsschool.model.Player;
import byui.cit260.hogwartsschool.view.StartProgramView;

 /**
 * @author lmcqueen and jagiriga
 */
public class HogwartsSchool {

    public static Player player = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        
    }

     public static Player getPlayer() {
        return player;
    }
    
    public static void setPlayer(Player player) {
        HogwartsSchool.player = player;
    }  
}
