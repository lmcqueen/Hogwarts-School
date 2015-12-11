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
public class Scene implements Serializable {
    
    public enum SceneNames {
        hallwayHarry,
        hallwayRon,
        hallwayHermione, 
        hallwayDean, 
        hallwayNick, 
        hallwayNeville, 
        hallwayFredandGeorge,
        hallwayPercy,
        hallwayDraco, 
        hallwayPeeves, 
        hallwayGinny,
        hallwayDumbledore, 
        potions,
        charms,
        ancient,
        defense,
        astronomy,
        transfiguration,
        divination,
        herbology, 
        flying,
        care,
        quidditch,
        bathroom, 
        greatHall;
    }
    
    private String description;
    private Character character;
    private String sceneType;
    private String mapSymbol;
    private boolean blocked;
    private boolean visited;
    private Course course;

    public Scene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    } 

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }   

    public String getSceneType() {
        return sceneType;
    }

    public void setSceneType(String sceneType) {
        this.sceneType = sceneType;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.character);
        hash = 97 * hash + Objects.hashCode(this.sceneType);
        hash = 97 * hash + Objects.hashCode(this.mapSymbol);
        hash = 97 * hash + (this.blocked ? 1 : 0);
        hash = 97 * hash + (this.visited ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.course);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.character != other.character) {
            return false;
        }
        if (!Objects.equals(this.sceneType, other.sceneType)) {
            return false;
        }
        if (!Objects.equals(this.mapSymbol, other.mapSymbol)) {
            return false;
        }
        if (this.blocked != other.blocked) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (this.course != other.course) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", character=" + character + ", information=" + sceneType + ", mapSymbol=" + mapSymbol + ", blocked=" + blocked + ", visited=" + visited + ", course=" + course + '}';
    }
    
    
}
