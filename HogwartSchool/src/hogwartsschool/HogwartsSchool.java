/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsschool;

import byui.cit260.hogwartsschool.model.Game;
import byui.cit260.hogwartsschool.model.Player;
import byui.cit260.hogwartsschool.model.Character;
import byui.cit260.hogwartsschool.model.House;
/**
 *
 * @author lmcqueen and jagiriga
 */
public class HogwartsSchool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //implement Game instance
        Game gameOne = new Game();
        gameOne.setStartTime(9.43);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        //implement Player instance
        Player playerOne = new Player();
        playerOne.setName("Bob");
        playerOne.setCurrentRow(3);
        playerOne.setCurrentCol(6);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //implement Character instance
        Character characterOne = new Character();
        characterOne.setName("George");
        characterOne.setDescription("A character named George");
        characterOne.setCurrentRow(5);
        characterOne.setCurrentCol(3);
        
        String characterInfo = characterOne.toString();
        System.out.println(characterInfo);
        
        //implement House instance
        House houseOne = new House();
        houseOne.setName("Ravenclaw");
        houseOne.setDescription("The smart house");
        houseOne.setPoints(500);
        
        String houseInfo = houseOne.toString();
        System.out.println(houseInfo);
    }
    
}
