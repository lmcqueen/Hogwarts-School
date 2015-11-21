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
        wand.setDescription("10 inch unicorn hair and holly wand");
        wand.setItemType("Wand");
        wand.setName("Magic Wand");
        wand.setQuantity(0);
        inventory[InventoryItem.Items.wand.ordinal()] = wand;
                
        InventoryItem hornedSlugs = new InventoryItem();
        hornedSlugs.setDescription("A type of slug that has boil curing properties when stewed");
        hornedSlugs.setItemType("Potion ingredient");
        hornedSlugs.setName("Horned Slug");
        hornedSlugs.setQuantity(0);
        inventory[InventoryItem.Items.hornedSlug.ordinal()] = hornedSlugs;
        
        
        InventoryItem porcupineQuills = new InventoryItem();
        porcupineQuills.setDescription("Spines that protect a porcupine fron danger");
        porcupineQuills.setItemType("Potion ingredient");
        porcupineQuills.setName("Porcupine Quills");
        porcupineQuills.setQuantity(0);
        inventory[InventoryItem.Items.porcupineQuills.ordinal()] = porcupineQuills;
        
        InventoryItem pungousOnions = new InventoryItem();
        pungousOnions.setDescription("Magical leaves used for the cure of boils");
        pungousOnions.setItemType("Potion ingredient");
        pungousOnions.setName("Pungous Onions");
        pungousOnions.setQuantity(0);
        inventory[InventoryItem.Items.pungousOnions.ordinal()] = pungousOnions;
        
        InventoryItem snakeFangs = new InventoryItem();
        snakeFangs.setDescription("Magical ingredient that must not be gotten from the snake vernom");
        snakeFangs.setItemType("Potion ingredient");
        snakeFangs.setName("Snake Fangs");
        snakeFangs.setQuantity(0);
        inventory[InventoryItem.Items.snakeFangs.ordinal()] = snakeFangs;
        
        InventoryItem flobberwormMucus = new InventoryItem();
        flobberwormMucus.setDescription("A sticky and green substance that is extracted from flobberworm");
        flobberwormMucus.setItemType("Potion ingredient");
        flobberwormMucus.setName("Flobberworm Mucus");
        flobberwormMucus.setQuantity(0);
        inventory[InventoryItem.Items.flobberwormMucus.ordinal()] = flobberwormMucus;
        
        InventoryItem gingerRoot = new InventoryItem();
        gingerRoot.setDescription("Magical ingredient that is used for the cure of boils");
        gingerRoot.setItemType("Potion ingredient");
        gingerRoot.setName("Ginger Root");
        gingerRoot.setQuantity(0);
        inventory[InventoryItem.Items.gingerRoot.ordinal()] = gingerRoot;
        
        InventoryItem feather = new InventoryItem();
        feather.setDescription("Magical ingredient that is used for the cure of boil");
        feather.setItemType("Charms tool");
        feather.setName("Feather");
        feather.setQuantity(0);
        inventory[InventoryItem.Items.feather.ordinal()] = feather;
        
        InventoryItem goblet = new InventoryItem();
        goblet.setDescription("Magical ingredient that is used for the cure of boil");
        goblet.setItemType("Transfiguration tool");
        goblet.setName("Goblet");
        goblet.setQuantity(0);
        inventory[InventoryItem.Items.goblet.ordinal()] = goblet;
        
        InventoryItem cauldron = new InventoryItem();
        cauldron.setDescription("A vessel that is used to brew or hold potions");
        cauldron.setItemType("Potions tool");
        cauldron.setName("Cauldron");
        cauldron.setQuantity(0);
        inventory[InventoryItem.Items.cauldron.ordinal()] = cauldron;
        
        InventoryItem telescope = new InventoryItem();
        telescope.setDescription("For looking at the stars in astronomy");
        telescope.setItemType("Astonomy tool");
        telescope.setName("Telescope");
        telescope.setQuantity(0);
        inventory[InventoryItem.Items.telescope.ordinal()] = telescope;
        

        return inventory;
    
    }
    
}
