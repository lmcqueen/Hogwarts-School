/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import byui.cit260.hogwartsschool.model.House;

/**
 *
 * @author User
 */
public class HouseControl {

    static House[] createHouseList() {
        
        House[] houses = new House[4];
        
        House gryffindor = new House();
        gryffindor.setDescription("\"You might belong in Gryffindor,\n" +
            "Where dwell the brave at heart,\n" +
            "Their daring, nerve and chivalry\n" +
            "Set Gryffindors apart\" --The Sorting Hat");
        
        gryffindor.setName("Gryffindor");
        gryffindor.setPoints(0);
        houses[0] = gryffindor;
        
        House ravenclaw = new House();
        ravenclaw.setDescription("\"In wise old Ravenclaw,\n "
            + "If you've a ready mind,\n" +
            "Where those of wit and learning,\n" +
            "Will always find their kind.\" --The Sorting Hat");
        ravenclaw.setName("Ravenclaw");
        ravenclaw.setPoints(0);
        houses[1] = ravenclaw;
        
        House hufflepuff = new House();
        hufflepuff.setDescription("\"You might belong in Hufflepuff,\n" +
              "Where they are just and loyal,\n" + 
              "Those patient Hufflepuffs are true,\n" +
              "And unafraid of toil\" --The Sorting Hat");
        hufflepuff.setName("Hufflepuff");
        hufflepuff.setPoints(0);
        houses[2] = hufflepuff;
        
        House slytherin = new House();
        slytherin.setDescription("\"Perhaps in Slytherin,\n" +
            "You'll make your real friends,\n" +
            "Those cunning folk use any means,\n" +
            "To achieve their ends.\" --The Sorting Hat");
        slytherin.setName("Slytherin");
        slytherin.setPoints(0);
        houses[3] = slytherin;
        
        return houses;
    }
    
}
