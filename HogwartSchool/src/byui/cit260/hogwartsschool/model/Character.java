/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.model;

import java.io.Serializable;
/**
 *
 * @author lmcqueen
 */
public enum Character implements Serializable {
   
    Harry("Famous student who is to conquer You Know Who. Also known as the boy who lived"),
    Hermione("Cleverest witch at Hogwarts and best friends with Harry Potter"),
    Ron("Harry Potter's best friend"),
    Snape("Professor of Potions and head of Slytherin house"),
    McGonagall("Professor of Transfiguration and head of Gryffindor house"),
    Dumbledore("Headmaster of Hogwarts"),
    Flitwick("Professor of charms"),
    Trelany("Professor of Divination");
    
    private final String description;
    private final Coordinate coordinates;

    Character(String description) {
        this.description = description;
        coordinates = new Coordinate(1,1);
    }

    public String getDescription() {
        return description;
    }

    public Coordinate getCoordinates() {
        return coordinates;
    }
    
}
