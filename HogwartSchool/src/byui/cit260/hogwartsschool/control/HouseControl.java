/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import byui.cit260.hogwartsschool.exceptions.HouseControlException;
import byui.cit260.hogwartsschool.model.House;
import hogwartsschool.HogwartsSchool;

/**
 *
 * @author lmcqueen
 */
public class HouseControl {

    public static House[] createHouseList() {

        House[] houses = new House[4];

        House gryffindor = new House();
        gryffindor.setDescription("\n\"You might belong in Gryffindor,"
                + "Where dwell the brave at heart,"
                + "Their daring, nerve and chivalry\n"
                + "Set Gryffindors apart.");

        gryffindor.setName("Gryffindor");
        gryffindor.setPoints(0);
        houses[0] = gryffindor;

        House ravenclaw = new House();
        ravenclaw.setDescription("In wise old Ravenclaw,"
                + "If you've a ready mind,"
                + "Where those of wit and learning,\n"
                + "Will always find their kind.");
        ravenclaw.setName("Ravenclaw");
        ravenclaw.setPoints(0);
        houses[1] = ravenclaw;

        House hufflepuff = new House();
        hufflepuff.setDescription("You might belong in Hufflepuff,"
                + "Where they are just and loyal,"
                + "Those patient Hufflepuffs are true,\n"
                + "And unafraid of toil.");
        hufflepuff.setName("Hufflepuff");
        hufflepuff.setPoints(0);
        houses[2] = hufflepuff;

        House slytherin = new House();
        slytherin.setDescription("Perhaps in Slytherin,"
                + "You'll make your real friends,"
                + "Those cunning folk use any means,\n"
                + "To achieve their ends.\"\n\n");
        slytherin.setName("Slytherin");
        slytherin.setPoints(0);
        houses[3] = slytherin;

        return houses;
    }

    public static void setHouse(String house) throws HouseControlException {
        try {
            House[] houses = HogwartsSchool.getCurrentGame().getHouses();

            for (House curHouse : houses) {
                if (curHouse.getName().equals(house)) {
                    HogwartsSchool.getCurrentGame().getPlayer().setHouse(curHouse);
                }
            }
        } catch (Exception ex) {
            throw new HouseControlException(ex.getMessage());
        }
    }

    public static House[] getSortedHouses() throws HouseControlException {

        try {
            House[] housesOrigional = HogwartsSchool.getCurrentGame().getHouses();

            House[] housesSorted = housesOrigional.clone();

            House tempHouse;
            for (int i = 1; i < housesSorted.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (housesSorted[j].getName().compareToIgnoreCase(housesSorted[j - 1].getName()) < 0) {
                        tempHouse = housesSorted[j];
                        housesSorted[j] = housesSorted[j - 1];
                        housesSorted[j - 1] = tempHouse;
                    }
                }
            }

            return housesSorted;
        } catch (Exception ex) {
            throw new HouseControlException(ex.getMessage());
        }
    }

    public static void addPoints(int points) throws HouseControlException {
        try {
            House house = HogwartsSchool.getPlayer().getHouse();
            int curpoints = house.getPoints();
            curpoints += points;
            house.setPoints(curpoints);
            HouseControl.addOtherHousePoints();
        } catch (Exception ex) {
            throw new HouseControlException(ex.getMessage());
        }
    }

    public static void addOtherHousePoints() throws HouseControlException {
        try {
            House playerHouse = HogwartsSchool.getPlayer().getHouse();

            House[] houses = HogwartsSchool.getCurrentGame().getHouses();
            for (House house : houses) {
                if (!playerHouse.getName().equals(house.getName())) {
                    int curpoints = house.getPoints();
                    curpoints += Math.floor(Math.random() * 9 + 1);
                    house.setPoints(curpoints);
                }
            }
        } catch (Exception ex) {
            throw new HouseControlException(ex.getMessage());
        }
    }

    public static String getHouseMostPoints() throws HouseControlException {
        int maxPosition = 0;

        try {
            House[] houses = HogwartsSchool.getCurrentGame().getHouses();

            for (int i = 0; i < houses.length; i++) {
                if (houses[i].getPoints() > houses[maxPosition].getPoints()) {
                    maxPosition = i;
                }
            }

            return houses[maxPosition].getName();
        } catch (Exception ex) {
            throw new HouseControlException(ex.getMessage());
        }
    }

}
