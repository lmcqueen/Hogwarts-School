/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import byui.cit260.hogwartsschool.model.Game;
import byui.cit260.hogwartsschool.model.House;
import byui.cit260.hogwartsschool.model.InventoryItem;
import byui.cit260.hogwartsschool.model.Map;
import byui.cit260.hogwartsschool.model.Player;
import hogwartsschool.HogwartsSchool;

/**
 *
 * @author lmcqueen
 */
public class GameControl {

    public static void createNewGame(Player player) {
        
       Game game = new Game();
       HogwartsSchool.setCurrentGame(game);
       
       game.setPlayer(player);
       
       InventoryItem[] inventoryList = InventoryControl.createInventoryList();
       game.setInventory(inventoryList);
       
       House[] houseList = HouseControl.createHouseList();
       game.setHouses(houseList);
       
       Map map = MapControl.createMap();
       game.setMap(map);
       
    }
    
}
