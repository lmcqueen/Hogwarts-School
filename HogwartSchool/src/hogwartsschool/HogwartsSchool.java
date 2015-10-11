/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsschool;

import byui.cit260.hogwartsschool.model.Game;
import byui.cit260.hogwartsschool.model.Player;
import byui.cit260.hogwartsschool.model.Character;
import byui.cit260.hogwartsschool.model.Classroom;
import byui.cit260.hogwartsschool.model.Course;
import byui.cit260.hogwartsschool.model.Hallway;
import byui.cit260.hogwartsschool.model.House;
import byui.cit260.hogwartsschool.model.InventoryItem;
import byui.cit260.hogwartsschool.model.Notebook;
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
        
        //test Player instance
        Player playerOne = new Player();
        playerOne.setName("Bob");
        playerOne.setCurrentRow(3);
        playerOne.setCurrentCol(6);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //test Character instance
        Character characterOne = new Character();
        characterOne.setName("George");
        characterOne.setDescription("A character named George");
        characterOne.setCurrentRow(5);
        characterOne.setCurrentCol(3);
        
        String characterInfo = characterOne.toString();
        System.out.println(characterInfo);
        
        //test House instance
        House houseOne = new House();
        houseOne.setName("Ravenclaw");
        houseOne.setDescription("The smart house");
        houseOne.setPoints(500);
        
        String houseInfo = houseOne.toString();
        System.out.println(houseInfo);
        
        //testing InventoryItem class
        InventoryItem itemOne = new InventoryItem();
        itemOne.setName("john");
        itemOne.setDescription("john is a person");
        itemOne.setItemType("humanbeing");
        itemOne.setQuantity(2);
        
        String itemOneInfo = itemOne.toString();
        System.out.println(itemOneInfo);
        
        //test Course instance
        Course courseOne = new Course();
        courseOne.setName("Potions");
        courseOne.setDescription("A course that teaches potions");
        courseOne.setTeacher("Snape");
        
        String courseOneInfo = courseOne.toString();
        System.out.println(courseOneInfo);
        
        //test note instance
        Notebook noteOne = new Notebook();
        noteOne.setNotes("This is a note");
        
        String noteOneInfo = noteOne.toString();
        System.out.println(noteOneInfo);
        
        //test Hallway
        Hallway hallwayOne = new Hallway();
        hallwayOne.setDesctiption("This hallway has a ghost");
        
        String hallwayOneInfo = hallwayOne.toString();
        System.out.println(hallwayOneInfo);
        
        //test classroom
        Classroom classOne = new Classroom();
        classOne.setBlocked(true);
        classOne.setDescription("The potions classroom");
        classOne.setVisited(false);
        
        String classOneInfo = classOne.toString();
        System.out.println(classOneInfo);
        
    }
}
