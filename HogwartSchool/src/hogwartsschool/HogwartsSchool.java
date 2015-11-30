/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsschool;

import byui.cit260.hogwartsschool.model.Game;
import byui.cit260.hogwartsschool.model.Player;
import byui.cit260.hogwartsschool.view.StartProgramView;

 /**
 * @author lmcqueen and jagiriga
 */
public class HogwartsSchool {

    public static Player player = null;
    public static Game currentGame = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        try{
            startProgramView.display();
        }
        catch(Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
        
    }

     public static Player getPlayer() {
        return player;
    }
    
    public static void setPlayer(Player player) {
        HogwartsSchool.player = player;
    }  

    public static void setCurrentGame(Game game) {
        HogwartsSchool.currentGame = game;
    }
    
    
}
