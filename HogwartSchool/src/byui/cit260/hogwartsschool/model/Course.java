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
public enum Course implements Serializable {
    
    Potions("Potions", "Welcome to Professor Snape's potions class. This is today's lecture:"
            + "\nThere will be no foolish wand-waving or silly incantations in this class."
            + "\nIn this class you will learn that potion making is a precise science,"
            + "\nexcept for poison antidotes. All you have to do for that is shove"
            + "\na bezoar down their throat. Nevertheless, today we will be making"
            + "\na potion to cure boils. Read the instructions and work silently."),
    Charms("Charms", "Welcome to Professor Flitwick's charms class. This is Today's lecture:"
            + "\nOne of the wizard's most rudimentary skills is levitation, or the"
            + "\nability to make things fly. Do you all have your featers? Good!"
            + "\nNow all you have to remember is the correct wand movement: swish "
            + "\nand flick."),
    Ancient("Ancient Runes", "Welcome to Professor Babbling's ancient ruins class. This is today's lecture:"
            + "\nAncient runes is the study of is the study of ancient magic languages."
            + "\nWe will be learning the different glyphs that were used anciently"
            + "\nand translate them. Your assignment will be to translate one of"
            + "\nthese ancient words into a common spell. You may begin."),
    Defense("Defense Against the Dark Arts", "Welcome to Professor Lupin's Defense Against the Dark Arts class. This is today's lecture:"
            + "\nIn this class you will learn to protect yourself from the dangers"
            + "\nthat reside in the magical world. Today we are going to learn how "
            + "\nto properly duel another wizard. The proper edicate for a duel is"
            + "\nto begin by bowing to your oponent. The most important part is to"
            + "\nlearn how to properly  disarm and stun your partner. Pair up with "
            + "\nsomeone in the class and follow the instructions."),
    Astronomy("Astronomy", "Welcome to Professor Sinistra's astronomy class. Here is today's lecture:"
            + "\nAstronomy is a branch of magic that studies stars and the movement "
            + "\nof planets. Today we will be measuring the magnitude of stars. So"
            + "\nget out you telescopes and follow the instructions to complete the"
            + "\nassignemnt."),
    Transfiguration("Transfiguration", "Welcome to Professor McGonagall's transfiguration class. This is today's lecture:"
            + "\nTransfiguration is the ability to change one object into another."
            + "\nIt is a powerful ability, though it has it's limits such as you "
            + "\ncannot turn an object into food. Today we will being small. You"
            + "\nwill be practicing transforming a match into a needle. Follow the"
            + "instructions to perform the task."),
    Divination("Divination", "Welcome to Professor Trelawney's divination class. This is today's lecture:"
            + "\nIn this class you will learn the noble art of Divination. You will "
            + "\ndiscover if you possess the sight! Together, we shall cast ourselves"
            + "\ninto the future. We will be focusing today on Tessomancy which is "
            + "\nthe art of reading tea leaves. Read the instructions to begin your"
            + "\ntea leaf reading. "),
    Herbology("Herbology", "Welcome to Professor Sprout's herbology class. This is today's lecture:"
            + "\nToday we are going to learn about three different plants. The first is"
            + "\nmandrakes. Mandrakes are great for curing petrified people. They look"
            + "\nlike babies with a green plant coming out of their head. they like"
            + "\nto be burried in the dirt. Devil's snare is a plant that is deadly"
            + "\nbut doesn't look it. It looks like a vine, but the second it touches"
            + "\nanything, it will wrap itself around it and strangle it. They do not"
            + "\nlike light. Finally, we have a puffapod. They look a little like a "
            + "\npink blob and they have glowing seeds inside. If it touches anything"
            + "\nit starts flowering where it was touched. You will be identifying "
            + "\none of these plants. Follow the instructions below to complete"
            + "\nthe assignment."),
    Flying("Flying", "Welcome to Madam Hooch's flying class. This is today's lecture:"
            + "\nFlying is a skill that is useful when you need to travel without "
            + "\napparition. What you need to do is mount your broom stick, and get"
            + "\na nice firm hold on the handle, or else you will slip off. To take"
            + "\noff push hard off the ground. Guide the broom by tilting the broom "
            + "\nthe way you want to go. Follow the instructions to fly."),
    Care("Care of Magical Creatures", "Welcome to Hagrid's Care of Magical Creatures class. This is today's lecture:"
            + "\nToday we are going to be learning about three different type of"
            + "\ncreatures. The first is a niffler. Niffler's have long snouts and "
            + "\nare treasure seakers. Careful if you have anything shiny on you with"
            + "\nthose ones about. Next we have hypogryffs. Careful to never offend one"
            + "\nof them. Hippogriffs have the body of a horse, and the head, wings, "
            + "\nand front legs of an eagle. Last we have bowtruckles. Bowtrunckles"
            + "\nlike to reside trees that are good for wand making. They blend in with"
            + "\ntrees and hard to spot. They have sharp claws so be careful around them."
            + "\nYou will be identifying one of the creatures. Follow the instructions "
            + "\nto complete your assignment.");

    private final String description;
    private final String lecture;
    
    Course(String description, String lecture) {
        this.description = description;
        this.lecture = lecture;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getLecture() {
        return lecture;
    }

}
