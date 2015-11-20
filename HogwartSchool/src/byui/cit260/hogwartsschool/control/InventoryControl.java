/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import byui.cit260.hogwartsschool.model.InventoryItem;

/**
 *
 * @author User
 */
public class InventoryControl {

    static InventoryItem[] createInventoryList() {
        
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
    
        InventoryItem[] inventory = new InventoryItem[11];
        
        InventoryItem wand = new InventoryItem();
        wand.setDescription("A magical wand");
        wand.setItemType("Wand");
        wand.setName("10 inch unicorn hair and holly wand");
        wand.setQuantity(0);
        inventory[0] = wand;
                
        InventoryItem hornedSlugs = new InventoryItem();
        hornedSlugs.setDescription("A type of slug that has boil curing properties when stewed");
        hornedSlugs.setItemType("Potion ingredient");
        hornedSlugs.setName("Horned Slug");
        hornedSlugs.setQuantity(0);
        inventory[1] = hornedSlugs;

        
    
    }
    
}
