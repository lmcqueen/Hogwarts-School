/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.model;

/**
 *
 * @author User
 */
public class Coordinate {
    
    private int currentRow;
    private int currentCol;

    public Coordinate(int currentRow, int currentCol) {
        this.currentRow = currentRow;
        this.currentCol = currentCol;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentCol() {
        return currentCol;
    }

    public void setCurrentCol(int currentCol) {
        this.currentCol = currentCol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.currentRow;
        hash = 89 * hash + this.currentCol;
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
        final Coordinate other = (Coordinate) obj;
        if (this.currentRow != other.currentRow) {
            return false;
        }
        if (this.currentCol != other.currentCol) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Coordinate{" + "currentRow=" + currentRow + ", currentCol=" + currentCol + '}';
    }
    
}
