/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.model;

import java.io.Serializable;

/**
 *
 * @author lmcqueen
 */
public class Note implements Serializable{
    
    private String notes;

    public Note() {
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Note{" + "notes=" + notes + '}';
    }
    
    
}
