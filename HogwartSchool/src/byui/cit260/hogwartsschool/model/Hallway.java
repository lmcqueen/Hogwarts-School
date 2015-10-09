/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author User
 */
public class Hallway implements Serializable{
    
    private String desctiption;

    public Hallway() {
    }

    public String getDesctiption() {
        return desctiption;
    }

    public void setDesctiption(String desctiption) {
        this.desctiption = desctiption;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.desctiption);
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
        final Hallway other = (Hallway) obj;
        if (!Objects.equals(this.desctiption, other.desctiption)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Hallway{" + "desctiption=" + desctiption + '}';
    }
}
