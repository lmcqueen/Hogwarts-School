/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import byui.cit260.hogwartsschool.model.Classroom;
import byui.cit260.hogwartsschool.model.Map;
import byui.cit260.hogwartsschool.model.Scene;
import hogwartsschool.HogwartsSchool;

/**
 *
 * @author User
 */
public class MapControl {
    
    private Scene[] scenes = new Scene[25];
    
    public static void setPlayerLocation (String location){
        
        if(location == null) {
            System.out.println("Could not change the location");
            return;
        }
        
        /**
         * WHEN MAP IS INITIALIZED WITH LOCATIONS AND COORDINATES, INSERT CODE
         * HERE TO GET THE LOCATION'S COORDINATES.
         */
      
        MapControl.getLocationCoordinates();
        
        HogwartsSchool.getPlayer().setCurrentLocationName(location);
        
        /**
         * SET MAP LOCATION COORDINATES FOR PLAYER HERE
         */
        MapControl.setPlayerCoordinates();
        
    }

    private static void getLocationCoordinates() {
        System.out.println("Stub function for getting the location's coordinates");
    }

    private static void setPlayerCoordinates() {
        System.out.println("Stub function for setting the player's coordinates");
    }
    
    public Scene[] createScenes(){
        Scene hallway = new Scene();
        hallway.setDescription("This is a hallway");
        this.scenes[0] = hallway;
        
        Classroom potions = new Classroom();
        potions.setDescription("this is the potions class");
        potions.setBlocked(true);
        potions.setVisited(false);
        this.scenes[1] = potions;
    }
    
    public static Map createMap(){
        Map map = new Map();
        /**
         * create new map object
         * create each scene
         * assign locations to scenes
         * 
         */
        return map;
    }
}
