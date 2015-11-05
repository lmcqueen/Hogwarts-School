/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import hogwartsschool.HogwartsSchool;

/**
 *
 * @author User
 */
public class MapControl {
    
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
    
}
