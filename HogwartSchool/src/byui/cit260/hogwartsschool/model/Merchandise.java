/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.model;

import java.io.Serializable;

/**
 *
 * @author lmcqueen and johnson
 */
public enum Merchandise implements Serializable{
   
    Wand("A wand to do your spells", 11),
    Newts("A potion ingredient", 3),
    Spiders("A potion ingredient", 2),
    Feather("An object for levitation", 1),
    Match("A regular match", 1),
    Cauldron("A cauldron for making potions", 10),
    Telescope("For looking at the stars in astronomy", 4),
    TeaCup("A cup for looking at predictions", 3);
   
    private final String description;
    private final int Price;

    private Merchandise(String description, int Price) {
       
        this.description = description;
        this.Price = Price;
     
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return Price;
    }
    
    
    
    
}
