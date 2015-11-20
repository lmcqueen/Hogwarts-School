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
    
    Potions("Potions class", "Stub lecture"),
    Charms("Charms class", "Stub lecture"),
    Ancient("Ancient Runes class", "Stub lecture"),
    Defense("Defense Against the Dark Arts class", "Stub lecture"),
    Astronomy("Astronomy class", "Stub lecture"),
    Transfiguration("Transfiguration class", "Stub lecture"),
    Divination("Divination class", "Stub lecture"),
    Herbology("Herbology class", "Stub lecture"),
    Flying("Flying class", "Stub lecture"),
    Care("Care of magical creatures class", "Stub lecture");

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
