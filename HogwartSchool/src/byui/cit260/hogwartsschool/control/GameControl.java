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

    public static InventoryItem[] getSortedInventoryList() {
        
        InventoryItem[] origionalInventoryList = HogwartsSchool.currentGame.getInventory();
        
        InventoryItem[] inventorySorted = origionalInventoryList.clone();
        
        InventoryItem tempInventoryItem;
        for(int i = 0; i < inventorySorted.length-1; i++){
            for(int j = 0; j < inventorySorted.length-1-i; j++){
                if(inventorySorted[j].getName().compareToIgnoreCase(inventorySorted[j + 1].getName()) > 0){
                    tempInventoryItem = inventorySorted[j];
                    inventorySorted[j] = inventorySorted[j + 1];
                    inventorySorted[j + 1] = tempInventoryItem;
                }
            }
        }
        
        return inventorySorted;
    }
    
}
