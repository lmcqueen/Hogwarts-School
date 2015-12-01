/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import byui.cit260.hogwartsschool.exceptions.MapControlException;
import byui.cit260.hogwartsschool.model.ActivityScene;
import byui.cit260.hogwartsschool.model.Classroom;
import byui.cit260.hogwartsschool.model.GreatHall;
import byui.cit260.hogwartsschool.model.Location;
import byui.cit260.hogwartsschool.model.Map;
import byui.cit260.hogwartsschool.model.Scene;
import hogwartsschool.HogwartsSchool;
import java.awt.Point;

/**
 *
 * @author User
 */
public class MapControl {
    
    private static Scene[] scenes = new Scene[25];
    
    private static Scene[] createScenes(){
        
        Scene hallwayHarry = new Scene();
        hallwayHarry.setDescription("This is a hallway");
        hallwayHarry.setMapSymbol("****");
        MapControl.scenes[Scene.SceneNames.hallwayHarry.ordinal()] = hallwayHarry;
        
        Scene hallwayRon = new Scene();
        hallwayRon.setDescription("This is a hallway");
        hallwayRon.setMapSymbol("****");
        MapControl.scenes[Scene.SceneNames.hallwayRon.ordinal()] = hallwayRon;
        
        Scene hallwayHermione = new Scene();
        hallwayHermione.setDescription("This is a hallway");
        hallwayHermione.setMapSymbol("****");
        MapControl.scenes[Scene.SceneNames.hallwayHermione.ordinal()] = hallwayHermione;
        
         Scene hallwayDean = new Scene();
        hallwayDean.setDescription("This is a hallway");
        hallwayDean.setMapSymbol("****");
        MapControl.scenes[Scene.SceneNames.hallwayDean.ordinal()] = hallwayDean;
        
         Scene hallwayNick = new Scene();
        hallwayNick.setDescription("This is a hallway");
        hallwayNick.setMapSymbol("****");
        MapControl.scenes[Scene.SceneNames.hallwayNick.ordinal()] = hallwayNick;
        
         Scene hallwayNeville = new Scene();
        hallwayNeville.setDescription("This is a hallway");
        hallwayNeville.setMapSymbol("****");
        MapControl.scenes[Scene.SceneNames.hallwayNeville.ordinal()] = hallwayNeville;
        
         Scene hallwayFredandGeorge = new Scene();
        hallwayFredandGeorge.setDescription("This is a hallway");
        hallwayFredandGeorge.setMapSymbol("****");
        MapControl.scenes[Scene.SceneNames.hallwayFredandGeorge.ordinal()] = hallwayFredandGeorge;
        
         Scene hallwayPercy = new Scene();
        hallwayPercy.setDescription("This is a hallway");
        hallwayPercy.setMapSymbol("****");
        MapControl.scenes[Scene.SceneNames.hallwayPercy.ordinal()] = hallwayPercy;
        
         Scene hallwayDraco = new Scene();
        hallwayDraco.setDescription("This is a hallway");
        hallwayDraco.setMapSymbol("****");
        MapControl.scenes[Scene.SceneNames.hallwayDraco.ordinal()] = hallwayDraco;
        
         Scene hallwayPeeves = new Scene();
        hallwayPeeves.setDescription("This is a hallway");
        hallwayPeeves.setMapSymbol("****");
        MapControl.scenes[Scene.SceneNames.hallwayPeeves.ordinal()] = hallwayPeeves;
        
         Scene hallwayGinny = new Scene();
        hallwayGinny.setDescription("This is a hallway");
        hallwayGinny.setMapSymbol("****");
        MapControl.scenes[Scene.SceneNames.hallwayGinny.ordinal()] = hallwayGinny;
        
         Scene hallwayDumbledore = new Scene();
        hallwayDumbledore.setDescription("This is a hallway");
        hallwayDumbledore.setMapSymbol("****");
        MapControl.scenes[Scene.SceneNames.hallwayDumbledore.ordinal()] = hallwayDumbledore;
        
        Classroom potions = new Classroom();
        potions.setDescription("Potions classroom");
        potions.setBlocked(false);
        potions.setVisited(false);
        potions.setMapSymbol(" PO ");
        MapControl.scenes[Scene.SceneNames.potions.ordinal()] = potions;
        
        Classroom charms = new Classroom();
        charms.setDescription("Charms classroom");
        charms.setBlocked(false);
        charms.setVisited(false);
        charms.setMapSymbol(" CH ");
        MapControl.scenes[Scene.SceneNames.charms.ordinal()] = charms;
        
        Classroom ancientRune = new Classroom();
        ancientRune.setDescription("Ancient Runes Classroom");
        ancientRune.setBlocked(false);
        ancientRune.setVisited(false);
        ancientRune.setMapSymbol(" AN ");
        MapControl.scenes[Scene.SceneNames.ancient.ordinal()] = ancientRune;
        
        Classroom defense = new Classroom();
        defense.setDescription("Defense Against the Dark Arts Classroom");
        defense.setBlocked(false);
        defense.setVisited(false);
        defense.setMapSymbol(" DE ");
        MapControl.scenes[Scene.SceneNames.defense.ordinal()] = defense;
        
        Classroom astronomy = new Classroom();
        astronomy.setDescription("Astronomy Classroom");
        astronomy.setBlocked(false);
        astronomy.setVisited(false);
        astronomy.setMapSymbol(" AS ");
        MapControl.scenes[Scene.SceneNames.astronomy.ordinal()] = astronomy;
        
        Classroom transfiguration = new Classroom();
        transfiguration.setDescription("Transfiguration Classroom");
        transfiguration.setBlocked(false);
        transfiguration.setVisited(false);
        transfiguration.setMapSymbol(" TR ");
        MapControl.scenes[Scene.SceneNames.transfiguration.ordinal()] = transfiguration;
        
        Classroom divination = new Classroom();
        divination.setDescription("Divination Classroom");
        divination.setBlocked(false);
        divination.setVisited(false);
        divination.setMapSymbol(" DI ");
        MapControl.scenes[Scene.SceneNames.divination.ordinal()] = divination;
        
        Classroom herbology = new Classroom();
        herbology.setDescription("Herbology Classroom");
        herbology.setBlocked(false);
        herbology.setVisited(false);
        herbology.setMapSymbol(" HE ");
        MapControl.scenes[Scene.SceneNames.herbology.ordinal()] = herbology;
        
        Classroom flying = new Classroom();
        flying.setDescription("Flying Classroom");
        flying.setBlocked(false);
        flying.setVisited(false);
        flying.setMapSymbol(" FL ");
        MapControl.scenes[Scene.SceneNames.flying.ordinal()] = flying;
        
        Classroom care = new Classroom();
        care.setDescription("Care of Magical Creatures Classroom");
        care.setBlocked(false);
        care.setVisited(false);
        care.setMapSymbol(" CA ");
        MapControl.scenes[Scene.SceneNames.care.ordinal()] = care;
        
        ActivityScene quidditch = new ActivityScene();
        quidditch.setDescription("Quidditch pitch where you can view quidditch games");
        quidditch.setVisited(false);
        quidditch.setMapSymbol(" QU ");
        MapControl.scenes[Scene.SceneNames.quidditch.ordinal()] = quidditch;
        
        ActivityScene bathroom = new ActivityScene();
        bathroom.setDescription("A bathroom. Beware of ghosts.");
        bathroom.setVisited(false);
        bathroom.setMapSymbol(" BA ");
        MapControl.scenes[Scene.SceneNames.bathroom.ordinal()] = bathroom;
        
	GreatHall greatHall = new GreatHall();
        greatHall.setDescription("The Great Hall, center of all Hogwarts");
        greatHall.setBlocked(false);
        greatHall.setVisited(false);
        greatHall.setMapSymbol(" XX ");
        MapControl.scenes[Scene.SceneNames.greatHall.ordinal()] = greatHall;

        return scenes;
    }
    
    private static void assignSceneLocations (Map map, Scene[] scenes){
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[Scene.SceneNames.potions.ordinal()]);
        locations[0][1].setScene(scenes[Scene.SceneNames.hallwayDean.ordinal()]);
        locations[0][2].setScene(scenes[Scene.SceneNames.astronomy.ordinal()]);
        locations[0][3].setScene(scenes[Scene.SceneNames.hallwayDraco.ordinal()]);
        locations[0][4].setScene(scenes[Scene.SceneNames.charms.ordinal()]);
        locations[1][0].setScene(scenes[Scene.SceneNames.bathroom.ordinal()]);
        locations[1][1].setScene(scenes[Scene.SceneNames.hallwayDumbledore.ordinal()]);
        locations[1][2].setScene(scenes[Scene.SceneNames.greatHall.ordinal()]);
        locations[1][3].setScene(scenes[Scene.SceneNames.hallwayFredandGeorge.ordinal()]);
        locations[1][4].setScene(scenes[Scene.SceneNames.herbology.ordinal()]);
        locations[2][0].setScene(scenes[Scene.SceneNames.care.ordinal()]);
        locations[2][1].setScene(scenes[Scene.SceneNames.hallwayGinny.ordinal()]);
        locations[2][2].setScene(scenes[Scene.SceneNames.hallwayHarry.ordinal()]);
        locations[2][3].setScene(scenes[Scene.SceneNames.hallwayHermione.ordinal()]);
        locations[2][4].setScene(scenes[Scene.SceneNames.divination.ordinal()]);
        locations[3][0].setScene(scenes[Scene.SceneNames.hallwayNeville.ordinal()]);
        locations[3][1].setScene(scenes[Scene.SceneNames.hallwayNick.ordinal()]);
        locations[3][2].setScene(scenes[Scene.SceneNames.hallwayPeeves.ordinal()]);
        locations[3][3].setScene(scenes[Scene.SceneNames.hallwayPercy.ordinal()]);
        locations[3][4].setScene(scenes[Scene.SceneNames.hallwayRon.ordinal()]);
        locations[4][0].setScene(scenes[Scene.SceneNames.ancient.ordinal()]);
        locations[4][1].setScene(scenes[Scene.SceneNames.flying.ordinal()]);
        locations[4][2].setScene(scenes[Scene.SceneNames.quidditch.ordinal()]);
        locations[4][3].setScene(scenes[Scene.SceneNames.defense.ordinal()]);
        locations[4][4].setScene(scenes[Scene.SceneNames.transfiguration.ordinal()]);
        
    }
    
    public static Map createMap(){
        
        Map map = new Map(5,5);
        
        MapControl.createScenes();
        MapControl.assignSceneLocations(map, scenes);
        
        return map;
    }
    
    public static void movePlayer(Point coordinates) throws MapControlException {
        
        Map map = HogwartsSchool.currentGame.getMap();
        int row = coordinates.x-1;
        int column = coordinates.y-1;
        
        if(row < 0 || column < 0 || row >= map.getRowCount() || column >= map.getColumnCount()){
            throw new MapControlException("Cannot move player to location because it is outside the bounds of the map");
        }
    }
}
