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
public enum Course implements Serializable {
    
    Potions("Potions", "Stub lecture"),
    Charms("Charms", "Stub lecture"),
    Ancient("Ancient Runes", "Stub lecture"),
    Defense("Defense Against the Dark Arts", "Stub lecture"),
    Astronomy("Astronomy", "Stub lecture"),
    Transfiguration("Transfiguration", "Stub lecture"),
    Divination("Divination", "Stub lecture"),
    Herbology("Herbology", "Stub lecture"),
    Flying("Flying", "Stub lecture"),
    Care("Care of Magical Creatures", "Stub lecture");

    private final String description;
    private final String lecture;
    
    Course(String description, String lecture) {
        this.description = description;
        this.lecture = lecture;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getLecture() {
        return lecture;
    }

}
