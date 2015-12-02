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
import byui.cit260.hogwartsschool.model.Course;
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
       
       Course[] courses= Course.values();
       game.setCourses(courses);
    }

    public static InventoryItem[] getSortedInventoryList() {
        
        InventoryItem[] origionalInventoryList = HogwartsSchool.getCurrentGame().getInventory();
        
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
    
    public static House[] getSortedHouses(){
        
        House[] housesOrigional = HogwartsSchool.getCurrentGame().getHouses();
        
        House[] housesSorted = housesOrigional.clone();
        
        House tempHouse;
        for(int i = 1; i < housesSorted.length; i++){
            for(int j = i; j > 0; j--){
                if(housesSorted[j].getName().compareToIgnoreCase(housesSorted[j-1].getName()) < 0){
                    tempHouse = housesSorted[j];
                    housesSorted[j] = housesSorted[j-1];
                    housesSorted[j-1] = tempHouse;
                }
            }
        }
        
        return housesSorted;
    }
    
    
    public static Course[] getSortedCourses(){
        
        Course[] coursesOrigional = HogwartsSchool.getCurrentGame().getCourses();
        
        Course[] coursesSorted = coursesOrigional.clone();
        
        Course tempCourse;
        for(int i = 1; i < coursesSorted.length; i++){
            for(int j = i; j > 0; j--){
                if(coursesSorted[j].getDescription().compareToIgnoreCase(coursesSorted[j-1].getDescription()) < 0){
                    tempCourse = coursesSorted[j];
                    coursesSorted[j] = coursesSorted[j-1];
                    coursesSorted[j-1] = tempCourse;
                }
            }
        }
        
        return coursesSorted;
        
    }
}

    