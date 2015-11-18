/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author lmcqueen
 */
public enum Course implements Serializable {
    
    Potions("Potions class"),
    Charms("Charms class"),
    Ancient("Ancient Runes class"),
    Defense("Defense Against the Dark Arts class"),
    Astronomy("Astronomy class"),
    Transfiguration("Transfiguration class"),
    Divination("Divination class"),
    Herbology("Herbology class"),
    Flying("Flying class"),
    Care("Care of magical creatures class"),
    Quidditch ("Quidditch field class");

    private String description;
    private Coordinate coordinates;

    Course(String description) {
        this.description = description;
        coordinates = new Coordinate(1,1);
    }

    public String getDescription() {
        return description;
    }

    public Coordinate getCoordinates(){
        return coordinates;
    }
   
}
