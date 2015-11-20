/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.model;

import java.io.Serializable;

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
    private String information;

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

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
