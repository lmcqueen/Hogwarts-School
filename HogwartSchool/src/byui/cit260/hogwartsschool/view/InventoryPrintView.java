/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.GameControl;
import byui.cit260.hogwartsschool.model.InventoryItem;
import java.io.PrintWriter;

/**
 *
 * @author Johnson
 */
public class InventoryPrintView extends View {

    private static PrintWriter inventoryPrintFile = null;

    public InventoryPrintView() {
        super("Please enter where you will like to save your inventory print.");
        // prompt message of pls enter your input
    }

   

    @Override
    public void display() {
        this.console.println(this.getPromptMessage());
        String filePath = this.getInput();

        if (this.doAction(filePath)) {
            this.console.println("You have successfully printed the inventory to " + filePath);
        } else {
            this.console.println("Unable to print inventory");
        }

    }

    @Override
    public boolean doAction(Object obj) {

        String filePath = (String) obj;

        try {InventoryPrintView.inventoryPrintFile = new PrintWriter(filePath);
             InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        InventoryPrintView.inventoryPrintFile.println("\nList of Inventory Items");
        InventoryPrintView.inventoryPrintFile.printf("%20s\t%20s\t%20s\t%20s\t\n", "Name","Item Type","Quantity","Description");
        InventoryPrintView.inventoryPrintFile.println("---------------------------------------------------------------------------------------------------");
        for (InventoryItem inventoryItem : inventory){
           InventoryPrintView.inventoryPrintFile.printf("%20s\t%20s\t%20s\t%20s\t\n",inventoryItem.getName(),inventoryItem.getItemType(),
             inventoryItem.getQuantity(),inventoryItem.getDescription());
            
            }

        } catch (Throwable te) {
            ErrorView.display(this.getClass().getName(), te.getMessage());
        } finally {

            if (InventoryPrintView.inventoryPrintFile != null) {
                InventoryPrintView.inventoryPrintFile.close();
                return true;
            } else {
                ErrorView.display(this.getClass().getName(), "Could not close file");
                return false;
            }

        }

    }

}

