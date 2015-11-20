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
public enum Character implements Serializable {
   
    Harry("Famous student who is to conquer You Know Who. Also known as the boy who lived"),
    Hermione("Cleverest witch at Hogwarts and best friends with Harry Potter"),
    Ron("Harry Potter's best friend"),
    Snape("Professor of Potions and head of Slytherin house"),
    McGonagall("Professor of Transfiguration and head of Gryffindor house"),
    Dumbledore("Headmaster of Hogwarts"),
    Flitwick("Professor of charms"),
    Trelany("Professor of Divination"),
    Lupin("Professor of Defense Against the Dark Arts"),
    Sprout("Professor of Herbology"),
    Hooch("Flying instructor"),
    Hagrid("Professor of Care of Magical Creatures"),
    Sinistra("Professor of Astronomy"),
    Babbling("Professor of Ancient Runes");
    
    private final String description;

    Character(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
}
