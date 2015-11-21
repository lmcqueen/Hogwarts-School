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
        
        
        InventoryItem porcupineQuills = new InventoryItem();
        porcupineQuills.setDescription("Spines that protect a porcupine fron danger");
        porcupineQuills.setItemType("Potion ingredient");
        porcupineQuills.setName("porcupineQuills");
        porcupineQuills.setQuantity(0);
        inventory[2] = porcupineQuills;
        
        InventoryItem pungousOnions = new InventoryItem();
        pungousOnions.setDescription("Magical leaves used for the cure of boils");
        pungousOnions.setItemType("Potion ingredient");
        pungousOnions.setName("pungousOnions");
        pungousOnions.setQuantity(0);
        inventory[3] = pungousOnions;
        
        InventoryItem snakeFangs = new InventoryItem();
        snakeFangs.setDescription("Magical ingredient that must not be gotten from the snake vernom");
        snakeFangs.setItemType("Potion ingredient");
        snakeFangs.setName("snakeFangs");
        snakeFangs.setQuantity(0);
        inventory[4] = snakeFangs;
        
        InventoryItem flobberwormMucus = new InventoryItem();
        flobberwormMucus.setDescription("A sticky and green substance that is extracted from flobberworm");
        snakeFangs.setItemType("Potion ingredient");
        snakeFangs.setName("snakeFangs");
        snakeFangs.setQuantity(0);
        inventory[5] = snakeFangs;
        
        InventoryItem gingerRoot = new InventoryItem();
        gingerRoot.setDescription("Magical ingredient that is used for the cure of boils");
        gingerRoot.setItemType("Potion ingredient");
        gingerRoot.setName("gingerRoot");
        gingerRoot.setQuantity(0);
        inventory[5] = gingerRoot;
        
        InventoryItem feather = new InventoryItem();
        feather.setDescription("Magical ingredient that is used for the cure of boil");
        feather.setItemType("Potion ingredient");
        feather.setName("feather");
        feather.setQuantity(0);
        inventory[6] = feather;
        
        InventoryItem goblet = new InventoryItem();
        goblet.setDescription("Magical ingredient that is used for the cure of boil");
        goblet.setItemType("Potion ingredient");
        goblet.setName("goblet");
        goblet.setQuantity(0);
        inventory[7] = goblet;
        
        InventoryItem cauldron = new InventoryItem();
        cauldron.setDescription("A vessel that is used to brew or hold potions");
        cauldron.setItemType("Potion ingredient");
        cauldron.setName("cauldron");
        cauldron.setQuantity(0);
        inventory[8] = cauldron;
        
        InventoryItem telescope = new InventoryItem();
        telescope.setDescription("For looking at the stars in astronomy");
        telescope.setItemType("Potion ingredient");
        telescope.setName("telescope");
        telescope.setQuantity(0);
        inventory[8] = telescope;
        

        
    
    }
    
}
