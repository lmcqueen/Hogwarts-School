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
    private Location[][] locations;
    
    public Map(int rowCount, int columnCount) {
        
        if(rowCount < 1 || columnCount < 1){
            System.out.println("You need more than 0 rows or columns");
            return;
        }
        
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.locations = new Location[this.rowCount][this.columnCount];
        
        for(int row = 0; row < rowCount; row++){
            for(int column = 0; column < columnCount; column++){
                Location location= new Location();
                location.setRow(row);
                location.setColumn(column);
                
                locations[row][column] = location;
            }
        }
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

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }
    
    
    
}
