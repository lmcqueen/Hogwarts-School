/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.model;

import java.io.Serializable;

/**
 *
 * @author User
 */
public enum Merchandise implements Serializable{
   
    Wand("A wand", 11),
    HornedSlugs("A potion ingredient", 3),
    PorcupineQuills("A potion ingredient", 1),
    PungousOnions("A potion ingredient", 1),
    SnakeFangs("Potion ingredient", 1),
    FlobberwormMucus("Potion ingredient", 2),
    GingerRoot("Potion ingredient", 1),
    Feather("A potion ingredient", 1),
    Goblet("A goblet for transfiguration practice", 1),
    Cauldron("A cauldron", 10),
    Telescope("For looking at the stars in astronomy", 4);
   
    private final String description;
    private final double Price;

    private Merchandise(String description, double Price) {
       
        this.description = description;
        this.Price = Price;
    }
    
}
