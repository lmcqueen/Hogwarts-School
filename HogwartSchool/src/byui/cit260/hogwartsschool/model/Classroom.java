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
 * @author lmcqueen
 */
public class Classroom implements Serializable {
    
    private String description;
    private boolean blocked;
    private boolean visited;

    public Classroom() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + (this.blocked ? 1 : 0);
        hash = 23 * hash + (this.visited ? 1 : 0);
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
        final Classroom other = (Classroom) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.blocked != other.blocked) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Classroom{" + "description=" + description + ", blocked=" + blocked + ", visited=" + visited + '}';
    }
    
    
    
}
