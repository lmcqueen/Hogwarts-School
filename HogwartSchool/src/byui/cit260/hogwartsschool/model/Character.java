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
    Dean("A Gryffindor student that is roommates with Harry on Ron."),
    Nick("Gryffindor ghost."),
    Neville("Gryffindor student that is rommates with Harry and Ron."),
    FredGeorge("Ron Weasley's older twin brothers that are Hogwart's school pranksters."),
    Draco("Little twit"),
    Percy("Bro to weasleys"),
    Peeves("Annoying"),
    Ginny("Little sis"),
    Wood("Quidditch captain"),
    Murtle("ghost"),
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
    
    //The description for each character is the answer to one of the questions in the final test.  
    private final String description;

    Character(String question) {
        this.description = question;
    }

    public String getDescription() {
        return description;
    }
    
}
