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
   
    Harry("Did you know that the new broomstick called the Firebolt can go over "
            + "\n150 miles per hour? It's amazing!"),
    Hermione("The Great Hall is enchanted to look like the outside sky. Didn't you know? "
            + "\nIt's all in the book Hogwart's a History. You should read it sometime."),
    Ron("Did you know you can make someone throw up slugs with the spell Slugulus Eructo?"
            + "\nDon't let it backfire though. It's not pleasant."),
    Dean("Muggle devices don't work in Hogwarts. It's a shame since I'm half muggle."),
    Nick("The basalisk can kill people by looking at them. I looked straight at "
            + "\nonce, but I'm already dead so it didn't work."),
    Neville("Look at my Mimbulus Mimbletonia! Did you know they defend themselves "
            + "\nby squirting stink sap? Here, I'll poke it and...oh. Sorry. That'll"
            + "\nwash out."),
    FredGeorge("Don't tell anyone, but to get into the kitchens, all you need to "
            + "\ndo is tickle a pear in the painting accross from the Hufflepuff"
            + "\ncommon room. But you didn't hear that from us."),
    Draco("I nicked this remembrall off that oaf Neville. It was supposed to "
            + "\nhelp him remember things, but we all know that's impossible."),
    Percy("What are you doing in this hall? There was a troll down here earlier and"
            + "\nstudents are not yet allowed down here. Trolls get dreadfully "
            + "\nconfused, so it's no surprise it wandered in. Now get out of this"
            + "\nhallway. I am a prefect!"),
    Peeves("Ah, little student going to class are you? Maybe I should throw this "
            + "\nwater balloon at you? No? Oops, too late! Should have learned that"
            + "\nbubble charm so you could breathe under water!"),
    Ginny("Have you ever tried to use the bat-bogey hex on someone? I've been trying"
            + "\nto perfect mine. Do you mind if I practice on you? No? Oh I guess"
            + "\nthat's understandable."),
    Wood("Quidditch captain"),
    Murtle("ghost"),
    Snape("Professor of Potions and head of Slytherin house"),
    McGonagall("Professor of Transfiguration and head of Gryffindor house"),
    Dumbledore("My pheonix is about to have a burning day. Did you know Pheonixes"
            + "\nare reborn from their ashes after they go up in flame?"),
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
