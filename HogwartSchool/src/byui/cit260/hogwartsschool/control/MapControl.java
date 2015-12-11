/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import byui.cit260.hogwartsschool.exceptions.MapControlException;
import byui.cit260.hogwartsschool.model.Course;
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
        hallwayHarry.setDescription("Harry Potter is in this hallway. Would you like to speak with him? Enter Y for yes N for no.");
        hallwayHarry.setMapSymbol("****");
        hallwayHarry.setSceneType("hallway");
        hallwayHarry.setBlocked(false);
        hallwayHarry.setVisited(true);
        hallwayHarry.setCourse(null);
        hallwayHarry.setCharacter(byui.cit260.hogwartsschool.model.Character.Harry);
        MapControl.scenes[Scene.SceneNames.hallwayHarry.ordinal()] = hallwayHarry;
        
        Scene hallwayRon = new Scene();
        hallwayRon.setDescription("Ronald Weasely is in this hallway. Would you like to speak with him? Enter Y for yes N for no.");
        hallwayRon.setMapSymbol("****");
        hallwayRon.setSceneType("hallway");
        hallwayRon.setVisited(true);
        hallwayRon.setCourse(null);
        hallwayRon.setBlocked(false);
        hallwayRon.setCharacter(byui.cit260.hogwartsschool.model.Character.Ron);
        MapControl.scenes[Scene.SceneNames.hallwayRon.ordinal()] = hallwayRon;
        
        Scene hallwayHermione = new Scene();
        hallwayHermione.setDescription("Hermione Granger is in this hallway. Would you like to speak with her? Enter Y for yes N for no.");
        hallwayHermione.setMapSymbol("****");
        hallwayHermione.setSceneType("hallway");
        hallwayHermione.setCharacter(byui.cit260.hogwartsschool.model.Character.Hermione);
        hallwayHermione.setBlocked(false);
        hallwayHermione.setCourse(null);
        hallwayHermione.setVisited(true);
        MapControl.scenes[Scene.SceneNames.hallwayHermione.ordinal()] = hallwayHermione;
        
         Scene hallwayDean = new Scene();
        hallwayDean.setDescription("Dean Thomas is in this hallway. Would you like to speak with him? Enter Y for yes N for no.");
        hallwayDean.setMapSymbol("****");
        hallwayDean.setCharacter(byui.cit260.hogwartsschool.model.Character.Dean);
        hallwayDean.setBlocked(false);
        hallwayDean.setCourse(null);
        hallwayDean.setSceneType("hallway");
        hallwayDean.setVisited(true);
        MapControl.scenes[Scene.SceneNames.hallwayDean.ordinal()] = hallwayDean;
        
         Scene hallwayNick = new Scene();
        hallwayNick.setDescription("Nearly Headnell Nick is in this hallway. Would you like to speak with him? Enter Y for yes N for no.");
        hallwayNick.setMapSymbol("****");
        hallwayNick.setCharacter(byui.cit260.hogwartsschool.model.Character.Nick);
        hallwayNick.setSceneType("hallway");
        hallwayNick.setBlocked(false);
        hallwayNick.setVisited(true);
        hallwayNick.setCourse(null);
        MapControl.scenes[Scene.SceneNames.hallwayNick.ordinal()] = hallwayNick;
        
         Scene hallwayNeville = new Scene();
        hallwayNeville.setDescription("Neville Longbottom is in this hallway. Would you like to speak with him? Enter Y for yes N for no.");
        hallwayNeville.setMapSymbol("****");
        hallwayNeville.setCharacter(byui.cit260.hogwartsschool.model.Character.Neville);
        hallwayNeville.setSceneType("hallway");
        hallwayNeville.setBlocked(false);
        hallwayNeville.setVisited(true);
        hallwayNeville.setCourse(null);
        MapControl.scenes[Scene.SceneNames.hallwayNeville.ordinal()] = hallwayNeville;
        
        Scene hallwayFredandGeorge = new Scene();
        hallwayFredandGeorge.setDescription("Fred and George Weasley is in this hallway. Would you like to speak with them? Enter Y for yes N for no.");
        hallwayFredandGeorge.setMapSymbol("****");
        hallwayFredandGeorge.setCharacter(byui.cit260.hogwartsschool.model.Character.FredGeorge);
        hallwayFredandGeorge.setSceneType("hallway");
        hallwayFredandGeorge.setBlocked(false);
        hallwayFredandGeorge.setVisited(true);
        hallwayFredandGeorge.setCourse(null);
        MapControl.scenes[Scene.SceneNames.hallwayFredandGeorge.ordinal()] = hallwayFredandGeorge;
        
         Scene hallwayPercy = new Scene();
        hallwayPercy.setDescription("Percy Weasley is in this hallway. Would you like to speak with him? Enter Y for yes N for no.");
        hallwayPercy.setMapSymbol("****");
        hallwayPercy.setCharacter(byui.cit260.hogwartsschool.model.Character.Percy);
        hallwayPercy.setSceneType("hallway");
        hallwayPercy.setBlocked(false);
        hallwayPercy.setVisited(true);
        hallwayPercy.setCourse(null);
        MapControl.scenes[Scene.SceneNames.hallwayPercy.ordinal()] = hallwayPercy;
        
         Scene hallwayDraco = new Scene();
        hallwayDraco.setDescription("Draco Malfoy is in this hallway. Would you like to speak with him? Enter Y for yes N for no.");
        hallwayDraco.setMapSymbol("****");
        hallwayDraco.setCharacter(byui.cit260.hogwartsschool.model.Character.Draco);
        hallwayDraco.setSceneType("hallway");
        hallwayDraco.setBlocked(false);
        hallwayDraco.setVisited(true);
        hallwayDraco.setCourse(null);
        MapControl.scenes[Scene.SceneNames.hallwayDraco.ordinal()] = hallwayDraco;
        
        Scene hallwayPeeves = new Scene();
        hallwayPeeves.setDescription("Peeves the poltergeist is in this hallway. Would you like to speak with him? Enter Y for yes N for no.");
        hallwayPeeves.setMapSymbol("****");
        hallwayPeeves.setCharacter(byui.cit260.hogwartsschool.model.Character.Peeves);
        hallwayPeeves.setSceneType("hallway");
        hallwayPeeves.setBlocked(false);
        hallwayPeeves.setVisited(true);
        hallwayPeeves.setCourse(null);
        MapControl.scenes[Scene.SceneNames.hallwayPeeves.ordinal()] = hallwayPeeves;
        
        Scene hallwayGinny = new Scene();
        hallwayGinny.setDescription("Ginny Weasley is in this hallway. Would you like to speak with her? Enter Y for yes N for no.");
        hallwayGinny.setMapSymbol("****");
        hallwayGinny.setCharacter(byui.cit260.hogwartsschool.model.Character.Ginny);
        hallwayGinny.setSceneType("hallway");
        hallwayGinny.setBlocked(false);
        hallwayGinny.setVisited(true);
        hallwayGinny.setCourse(null);
        MapControl.scenes[Scene.SceneNames.hallwayGinny.ordinal()] = hallwayGinny;
        
        Scene hallwayDumbledore = new Scene();
        hallwayDumbledore.setDescription("Ginny Weasley is in this hallway. Would you like to speak with her? Enter Y for yes N for no.");
        hallwayDumbledore.setMapSymbol("****");
        hallwayDumbledore.setCharacter(byui.cit260.hogwartsschool.model.Character.Dumbledore);
        hallwayDumbledore.setSceneType("hallway");
        hallwayDumbledore.setBlocked(false);
        hallwayDumbledore.setVisited(true);
        hallwayDumbledore.setCourse(null);
        MapControl.scenes[Scene.SceneNames.hallwayDumbledore.ordinal()] = hallwayDumbledore;
        
        Scene potions = new Scene();
        potions.setDescription("Potions classroom");
        potions.setCharacter(byui.cit260.hogwartsschool.model.Character.Snape);
        potions.setBlocked(false);
        potions.setVisited(false);
        potions.setSceneType("classroom");
        potions.setMapSymbol(" PO ");
        potions.setCourse(Course.Potions);
        MapControl.scenes[Scene.SceneNames.potions.ordinal()] = potions;
        
        Scene charms = new Scene();
        charms.setDescription("Charms classroom");
        charms.setBlocked(true);
        charms.setVisited(false);
        charms.setMapSymbol(" CH ");
        charms.setCharacter(byui.cit260.hogwartsschool.model.Character.Flitwick);
        charms.setCourse(Course.Charms);
        charms.setSceneType("classroom");
        MapControl.scenes[Scene.SceneNames.charms.ordinal()] = charms;
        
        Scene ancientRune = new Scene();
        ancientRune.setDescription("Ancient Runes Classroom");
        ancientRune.setBlocked(false);
        ancientRune.setVisited(false);
        ancientRune.setMapSymbol(" AR ");
        ancientRune.setCharacter(byui.cit260.hogwartsschool.model.Character.Babbling);
        ancientRune.setCourse(Course.Ancient);
        ancientRune.setSceneType("classroom");
        MapControl.scenes[Scene.SceneNames.ancient.ordinal()] = ancientRune;
        
        Scene defense = new Scene();
        defense.setDescription("Defense Against the Dark Arts Classroom");
        defense.setBlocked(false);
        defense.setVisited(false);
        defense.setMapSymbol(" DA ");
        defense.setCharacter(byui.cit260.hogwartsschool.model.Character.Lupin);
        defense.setCourse(Course.Defense);
        defense.setSceneType("classroom");
        MapControl.scenes[Scene.SceneNames.defense.ordinal()] = defense;
        
        Scene astronomy = new Scene();
        astronomy.setDescription("Astronomy Classroom");
        astronomy.setBlocked(true);
        astronomy.setVisited(false);
        astronomy.setMapSymbol(" AS ");
        astronomy.setCharacter(byui.cit260.hogwartsschool.model.Character.Sinistra);
        astronomy.setCourse(Course.Astronomy);
        astronomy.setSceneType("classroom");
        MapControl.scenes[Scene.SceneNames.astronomy.ordinal()] = astronomy;
        
        Scene transfiguration = new Scene();
        transfiguration.setDescription("Transfiguration Classroom");
        transfiguration.setBlocked(false);
        transfiguration.setVisited(false);
        transfiguration.setMapSymbol(" TR ");
        transfiguration.setCharacter(byui.cit260.hogwartsschool.model.Character.McGonagall);
        transfiguration.setCourse(Course.Transfiguration);
        transfiguration.setSceneType("classroom");
        MapControl.scenes[Scene.SceneNames.transfiguration.ordinal()] = transfiguration;
        
        Scene divination = new Scene();
        divination.setDescription("Divination Classroom");
        divination.setBlocked(false);
        divination.setVisited(false);
        divination.setMapSymbol(" DI ");
        divination.setCharacter(byui.cit260.hogwartsschool.model.Character.Trelany);
        divination.setCourse(Course.Divination);
        divination.setSceneType("classroom");
        MapControl.scenes[Scene.SceneNames.divination.ordinal()] = divination;
        
        Scene herbology = new Scene();
        herbology.setDescription("Herbology Classroom");
        herbology.setBlocked(false);
        herbology.setVisited(false);
        herbology.setMapSymbol(" HE ");
        herbology.setCharacter(byui.cit260.hogwartsschool.model.Character.Sprout);
        herbology.setCourse(Course.Herbology);
        herbology.setSceneType("classroom");
        MapControl.scenes[Scene.SceneNames.herbology.ordinal()] = herbology;
        
        Scene flying = new Scene();
        flying.setDescription("Flying Classroom");
        flying.setBlocked(false);
        flying.setVisited(false);
        flying.setMapSymbol(" FL ");
        flying.setCharacter(byui.cit260.hogwartsschool.model.Character.Hooch);
        flying.setCourse(Course.Flying);
        flying.setSceneType("classroom");
        MapControl.scenes[Scene.SceneNames.flying.ordinal()] = flying;
        
        Scene care = new Scene();
        care.setDescription("Care of Magical Creatures Classroom");
        care.setBlocked(false);
        care.setVisited(false);
        care.setMapSymbol(" CA ");
        care.setCharacter(byui.cit260.hogwartsschool.model.Character.Hagrid);
        care.setCourse(Course.Care);
        care.setSceneType("classroom");
        MapControl.scenes[Scene.SceneNames.care.ordinal()] = care;
        
        Scene quidditch = new Scene();
        quidditch.setDescription("Oliver Wood, captain of the Hogwarts quidditch team is here. Do you want to speak with him? Enter Y for yes N for no.");
        quidditch.setVisited(false);
        quidditch.setBlocked(false);
        quidditch.setCharacter(byui.cit260.hogwartsschool.model.Character.Wood);
        quidditch.setCourse(null);
        quidditch.setSceneType("activity");
        quidditch.setMapSymbol(" QU ");
        MapControl.scenes[Scene.SceneNames.quidditch.ordinal()] = quidditch;
        
        Scene bathroom = new Scene();
        bathroom.setDescription("A bathroom. Moaning Murtle haunts this bathroom. Do you want to speak with her? Enter Y for yes N for no.");
        bathroom.setVisited(false);
        bathroom.setBlocked(false);
        bathroom.setCharacter(byui.cit260.hogwartsschool.model.Character.Murtle);
        bathroom.setCourse(null);
        bathroom.setSceneType("activity");
        bathroom.setMapSymbol(" BA ");
        MapControl.scenes[Scene.SceneNames.bathroom.ordinal()] = bathroom;
        
	GreatHall greatHall = new GreatHall();
        greatHall.setDescription("The Great Hall, center of all Hogwarts");
        greatHall.setBlocked(true);
        greatHall.setVisited(false);
        greatHall.setCharacter(null);
        greatHall.setCourse(null);
        greatHall.setSceneType("greathall");
        greatHall.setMapSymbol(" XX ");
        MapControl.scenes[Scene.SceneNames.greatHall.ordinal()] = greatHall;

        return scenes;
    }
    
    private static void assignSceneLocations (Map map, Scene[] scenes){
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[Scene.SceneNames.potions.ordinal()]);
        locations[0][1].setScene(scenes[Scene.SceneNames.hallwayDean.ordinal()]);
        locations[0][2].setScene(scenes[Scene.SceneNames.hallwayHarry.ordinal()]);
        locations[0][3].setScene(scenes[Scene.SceneNames.hallwayDraco.ordinal()]);
        locations[0][4].setScene(scenes[Scene.SceneNames.charms.ordinal()]);
        locations[1][0].setScene(scenes[Scene.SceneNames.bathroom.ordinal()]);
        locations[1][1].setScene(scenes[Scene.SceneNames.hallwayDumbledore.ordinal()]);
        locations[1][2].setScene(scenes[Scene.SceneNames.greatHall.ordinal()]);
        locations[1][3].setScene(scenes[Scene.SceneNames.hallwayFredandGeorge.ordinal()]);
        locations[1][4].setScene(scenes[Scene.SceneNames.herbology.ordinal()]);
        locations[2][0].setScene(scenes[Scene.SceneNames.care.ordinal()]);
        locations[2][1].setScene(scenes[Scene.SceneNames.hallwayGinny.ordinal()]);
        locations[2][2].setScene(scenes[Scene.SceneNames.astronomy.ordinal()]);
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
    
    public static void movePlayer(int destRow, int destCol) throws MapControlException {
        
        Map map = HogwartsSchool.getCurrentGame().getMap();
        Location getLocation = new Location();
        
        if(destRow < 0 || destCol < 0 || destRow >= map.getRowCount() || destCol >= map.getColumnCount()){
            throw new MapControlException("Cannot move player to location because it is outside the bounds of the map");
        }
        else if(!map.getLocations()[destRow][destCol].getScene().getSceneType().equals("hallway") && 
            !HogwartsSchool.getCurrentGame().getPlayer().getLocation().getScene().getSceneType().equals("hallway")){
            throw new MapControlException("You must pass through the hallways to get to a classroom.");
        }
        else{
            getLocation = map.getLocations()[destRow][destCol];
            HogwartsSchool.getCurrentGame().getPlayer().setLocation(getLocation);
        }
     
    }
        
}
