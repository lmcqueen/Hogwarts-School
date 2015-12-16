/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.InventoryControl;
import byui.cit260.hogwartsschool.control.MerchandiseControl;
import byui.cit260.hogwartsschool.exceptions.InventoryControlException;
import byui.cit260.hogwartsschool.exceptions.MerchandiseControlException;
import byui.cit260.hogwartsschool.model.InventoryItem;
import byui.cit260.hogwartsschool.model.Merchandise;
import hogwartsschool.HogwartsSchool;


/**
 *
 * @author lmcqueen
 */
public class MerchandiseView extends View {

    public MerchandiseView() {
        super("Select the item that you would like to purchase:"
                + "\nN - Newts"
                + "\nS - Spiders"
                + "\nF - Feathers"
                + "\nM - Match"
                + "\nC - Cauldron"
                + "\nT - Telescope"
                + "\nP - Tea Cup"
                + "\nQ - Quit");
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;
        value = value.toUpperCase();
        if (value.length() > 1) {
            ErrorView.display(this.getClass().getName(), "\n *** Invalid Selection. Enter only a single character. ***\n");
            return false;
        }

        char selection = value.charAt(0);
        //SWITCH selection
        switch (selection) {
            case 'N':
                this.buyNewts();
                break;
            case 'S':
                this.buySpiders();
                break;
            case 'F':
                this.buyFeather();
                break;
            case 'M':
                this.buyMatch();
                break;
            case 'C':
                this.butCauldron();
                break;
            case 'T':
                this.buyTelescope();
                break;
            case 'P':
                this.buyTeaCup();
                break;
            case 'Q':
                return true;
            //OTHERWISE: DISPLAY “Invalid selection” 
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection. Try again. ***");
                break;
        }

        return false;
    }

    private void buyNewts() {
        this.buyAnItem(InventoryItem.Items.newts.ordinal(), Merchandise.Newts.ordinal());
    }

    private void buySpiders() {
        this.buyAnItem(InventoryItem.Items.spiders.ordinal(), Merchandise.Spiders.ordinal());
    }

    private void buyFeather() {
        this.buyAnItem(InventoryItem.Items.feather.ordinal(), Merchandise.Feather.ordinal());
    }

    private void buyMatch() {
        this.buyAnItem(InventoryItem.Items.match.ordinal(), Merchandise.Match.ordinal());
    }

    private void butCauldron() {
        this.buyAnItem(InventoryItem.Items.cauldron.ordinal(), Merchandise.Cauldron.ordinal());
    }

    private void buyTelescope() {
        this.buyAnItem(InventoryItem.Items.telescope.ordinal(), Merchandise.Telescope.ordinal());
    }

    private void buyTeaCup() {
        this.buyAnItem(InventoryItem.Items.teacup.ordinal(), Merchandise.TeaCup.ordinal());
    }

    private void buyAnItem(int inventoryType, int merchType) {
        try {
            int galleons = InventoryControl.getGalleons();
            int cost;

            cost = MerchandiseControl.getCostOfItem(merchType);

            if (galleons < cost) {
                ErrorView.display(this.getClass().getName(), "You do not have enough money to buy this item. Earn money by earning some in class.");
            } else {
                InventoryControl.addItem(inventoryType);
                this.console.println("You now have " + InventoryControl.getCurrentQuantity(inventoryType) + " " + HogwartsSchool.getCurrentGame().getInventory()[inventoryType].getName());
                InventoryControl.subtractCost(cost);

            }
        } catch (MerchandiseControlException | InventoryControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }

    }
}
