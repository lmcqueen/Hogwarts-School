/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.model;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author User lmcqueen And jagiriga
 */
public class Game implements Serializable{
    
    private Player player;
    private Map map;
    private House[] houses;
    private InventoryItem[] inventory; 
    private Character[] characters;
    private Course[] courses;
    
    public Game(){
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public House[] getHouses() {
        return houses;
    }

    public void setHouses(House[] houses) {
        this.houses = houses;
    }

    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }

    public Character[] getCharacters() {
        return characters;
    }

    public void setCharacters(Character[] characters) {
        this.characters = characters;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.player);
        hash = 47 * hash + Objects.hashCode(this.map);
        hash = 47 * hash + Arrays.deepHashCode(this.houses);
        hash = 47 * hash + Arrays.deepHashCode(this.inventory);
        hash = 47 * hash + Arrays.deepHashCode(this.characters);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Arrays.deepEquals(this.houses, other.houses)) {
            return false;
        }
        if (!Arrays.deepEquals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Arrays.deepEquals(this.characters, other.characters)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "player=" + player + ", map=" + map + ", houses=" + houses + ", inventory=" + inventory + ", characters=" + characters + '}';
    }
   
}
