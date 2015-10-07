/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsschool;

import byui.cit260.hogwartsschool.model.Game;

/**
 *
 * @author User
 */
public class HogwartsSchool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Game gameOne = new Game();
        
        gameOne.setStartTime(9.43);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
    }
    
}
