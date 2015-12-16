/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.model;

import java.io.Serializable;


/**
 *
 * @author Johnson
 */
public class Cauldron extends InventoryItem implements Serializable{
    // class instance variable
    private int depth;
    private int diameter; 

    public Cauldron() {
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.depth;
        hash = 97 * hash + this.diameter;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cauldron other = (Cauldron) obj;
        if (this.depth != other.depth) {
            return false;
        }
        if (this.diameter != other.diameter) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cauldron{" + "name=" + this.getName() + ", description=" + this.getDescription() + ", quantity=" + this.getQuantity() + ", depth=" + depth + ", diameter=" + diameter + '}';
    }
    
             
    
}
