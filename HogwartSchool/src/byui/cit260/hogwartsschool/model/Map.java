/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.model;

import java.io.Serializable;
/**
 *
 * @author jagiriga
 */
public class Map implements Serializable{
    // class instance varriable
    private int rowCount;
    private int columnCount;
    private Location[][] location = new Location[5][5];
    
    public Map() {
        /**
         * for every row in location
         *  for every column in location
         *      create new location
         *      set default values for location
         *      assign location to current row and column
         */
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.rowCount;
        hash = 79 * hash + this.columnCount;
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        return true;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }


    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }
    
    
    
}
