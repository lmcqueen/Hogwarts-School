/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import byui.cit260.hogwartsschool.exceptions.InventoryControlException;
import byui.cit260.hogwartsschool.model.InventoryItem;
import hogwartsschool.HogwartsSchool;

/**
 *
 * @author User
 */
public class InventoryControl {

    public static InventoryItem[] createInventoryList() {

        InventoryItem[] inventory = new InventoryItem[9];

        InventoryItem wand = new InventoryItem();
        wand.setName("Wand");
        wand.setDescription("10 inch unicorn hair and holly wand");
        wand.setQuantity(1);
        inventory[InventoryItem.Items.wand.ordinal()] = wand;

        InventoryItem newts = new InventoryItem();
        newts.setDescription("Newts to add to potions.");
        newts.setName("Newts");
        newts.setQuantity(0);
        inventory[InventoryItem.Items.newts.ordinal()] = newts;

        InventoryItem spiders = new InventoryItem();
        spiders.setDescription("Spiders to add to potions");
        spiders.setName("Spiders");
        spiders.setQuantity(0);
        inventory[InventoryItem.Items.spiders.ordinal()] = spiders;

        InventoryItem feather = new InventoryItem();
        feather.setDescription("Magical ingredient that is used for the cure of boil");
        feather.setName("Feather");
        feather.setQuantity(0);
        inventory[InventoryItem.Items.feather.ordinal()] = feather;

        InventoryItem match = new InventoryItem();
        match.setDescription("A regular match");
        match.setName("Match");
        match.setQuantity(0);
        inventory[InventoryItem.Items.match.ordinal()] = match;

        InventoryItem cauldron = new InventoryItem();
        cauldron.setDescription("A vessel that is used to brew or hold potions");
        cauldron.setName("Cauldron");
        cauldron.setQuantity(0);
        inventory[InventoryItem.Items.cauldron.ordinal()] = cauldron;

        InventoryItem telescope = new InventoryItem();
        telescope.setDescription("For looking at the stars in astronomy");
        telescope.setName("Telescope");
        telescope.setQuantity(0);
        inventory[InventoryItem.Items.telescope.ordinal()] = telescope;

        InventoryItem teacup = new InventoryItem();
        teacup.setDescription("A regular tea cup which is used for making predictions");
        teacup.setName("Tea Cup");
        teacup.setQuantity(0);
        inventory[InventoryItem.Items.teacup.ordinal()] = teacup;

        InventoryItem galleons = new InventoryItem();
        galleons.setDescription("Wizarding world version of money");
        galleons.setName("Galleons");
        galleons.setQuantity(0);
        inventory[InventoryItem.Items.galleons.ordinal()] = galleons;

        return inventory;

    }

    public static int getGalleons() throws InventoryControlException {

        try {
            InventoryItem[] items = HogwartsSchool.getCurrentGame().getInventory();

            int galleons = items[InventoryItem.Items.galleons.ordinal()].getQuantity();

            return galleons;
        } catch (Exception ex) {
            throw new InventoryControlException(ex.getMessage());
        }
    }

    public static void addItem(int position) throws InventoryControlException {
        try {
            InventoryItem[] items = HogwartsSchool.getCurrentGame().getInventory();
            int curQuantity = items[position].getQuantity();
            curQuantity += 1;
            items[position].setQuantity(curQuantity);
            HogwartsSchool.getCurrentGame().setInventory(items);
        } catch (Exception ex) {
            throw new InventoryControlException(ex.getMessage());
        }

    }

    public static int getCurrentQuantity(int position) throws InventoryControlException {
        try {
            InventoryItem[] items = HogwartsSchool.getCurrentGame().getInventory();
            int curQuantity = items[position].getQuantity();
            return curQuantity;
        } catch (Exception ex) {
            throw new InventoryControlException(ex.getMessage());
        }
    }

    public static void subtractCost(int cost) throws InventoryControlException {

        try {
            InventoryItem[] items = HogwartsSchool.getCurrentGame().getInventory();
            int galleons = items[InventoryItem.Items.galleons.ordinal()].getQuantity();
            galleons -= cost;
            items[InventoryItem.Items.galleons.ordinal()].setQuantity(galleons);
        } catch (Exception ex) {
            throw new InventoryControlException(ex.getMessage());
        }

    }

    public static void addGalleons(int numGalleons) throws InventoryControlException {
        try {
            InventoryItem[] items = HogwartsSchool.getCurrentGame().getInventory();
            int galleons = items[InventoryItem.Items.galleons.ordinal()].getQuantity();
            galleons += numGalleons;
            items[InventoryItem.Items.galleons.ordinal()].setQuantity(galleons);
        } catch (Exception ex) {
            throw new InventoryControlException(ex.getMessage());
        }
    }

}
