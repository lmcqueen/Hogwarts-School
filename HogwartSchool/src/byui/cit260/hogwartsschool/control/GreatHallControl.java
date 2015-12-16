/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import byui.cit260.hogwartsschool.exceptions.GreatHallException;
import byui.cit260.hogwartsschool.model.GreatHall;

/**
 *
 * @author lmcqueen
 */
public class GreatHallControl {

    public static GreatHall initializeGreatHall() {

        GreatHall greatHall = new GreatHall();

        //sorting menu questions
        String[] sortingMenu = new String[5];
        sortingMenu[0] = "Which trait do you value the most?"
                + "\n A - Courage"
                + "\n B - Wisdom"
                + "\n C - Loyal"
                + "\n D - Resourceful";
        sortingMenu[1] = "You and a friend need to cross a bridge. However, the bridge is guarded by a river troll. What do you do?"
                + "\n A - Volunteer to fight."
                + "\n B - Attempt to confuse the control to pass it without fighting."
                + "\n C - Suggest that you could both try to fight the troll together."
                + "\n D - Suggest drawing lots to decide who fights the troll.";
        sortingMenu[2] = "You are walking at night and hear a noise that you believe to be of magical origin. What do you do?"
                + "\n A - Draw your wand and stand your ground."
                + "\n B - Hide in the shadows and review the defensive spells in your mind that will be useful if an attack does happen."
                + "\n C - Proceed with caution while keeping one hand on your wand."
                + "\n D - Draw your wand and try to find the source.";
        sortingMenu[3] = "How would you like to be known to history?"
                + "\n A - Bold"
                + "\n B - Wise"
                + "\n C - Kind"
                + "\n D - Great";
        sortingMenu[4] = "Which of the following would you most hate people to call you?"
                + "\n A - Cowardly"
                + "\n B - Ignorant"
                + "\n C - Selfish"
                + "\n D - Ordinary";
        greatHall.setSortingQuestions(sortingMenu);

        //final exam questions
        String[] finalExam = new String[10];
        finalExam[0] = "What is the antidote to most poisons?"
                + "\nA - Polyjuice Potion"
                + "\nB - Felix Felicis"
                + "\nC - Bezoar"
                + "\nD - Veritaserum";
        finalExam[1] = "How fast does a firebolt go?"
                + "\nA - 120mph"
                + "\nB - 130mph"
                + "\nC - 140mph"
                + "\nD - 150mph";
        finalExam[2] = "What it the art of tea leaf reading called?"
                + "\nA - Divination"
                + "\nB - Fortune Telling"
                + "\nC - Tessomancy"
                + "\nD - Teatrecling";
        finalExam[3] = "What creatures like to reside in trees good for wands?"
                + "\nA - Bowtrunkles"
                + "\nB - Cornish Pixies"
                + "\nC - Nargles"
                + "\nD - Nifflers";
        finalExam[4] = "What charms allows you to breathe under water?"
                + "\nA - Aspiration Charm"
                + "\nB - Bubble Charm"
                + "\nC - Aquatis Charm"
                + "\nD - Marine Charm";
        finalExam[5] = "What thing can no object be transfigured into?"
                + "\nA - Lead"
                + "\nB - Iron"
                + "\nC - Food"
                + "\nD - Water";
        finalExam[6] = "What does the incantation Slugulus Eructo do?"
                + "\nA - Makes a slug appear"
                + "\nB - Makes someone throw up slugs"
                + "\nC - Turns someone into a slug"
                + "\nD - Squishes a slug";
        finalExam[7] = "What kind of plant strangles anything it can touch?"
                + "\nA - Devil's Snare"
                + "\nB - Mandrake"
                + "\nC - Mimbulus Mimbletonia"
                + "\nD - Strangulus Plantoneum";
        finalExam[8] = "What's the first thing you should do in a wizard's duel?"
                + "\nA - Let you second step in for you"
                + "\nB - Bow to your opponent"
                + "\nC - Cast a protection charm"
                + "\nD - Disarm your opponent";
        finalExam[9] = "What do you study in Ancient Runes?"
                + "\nA - Historic wizarding buildings"
                + "\nB - History of Magic"
                + "\nC - Spell incantations"
                + "\nD - Ancient magic languages.";
        greatHall.setTestQuestions(finalExam);

        return greatHall;
    }

    public static String getHouse(String[] answers) throws GreatHallException {
        try {
            String house = null;
            int[] timesChoosen = numberTimesChoosen(answers);
            int max = getMost(timesChoosen);

            switch (max) {

                case 0:
                    house = "Gryffindor";
                    break;
                case 1:
                    house = "Ravenclaw";
                    break;
                case 2:
                    house = "Hufflepuff";
                    break;
                case 3:
                    house = "Slytherin";
                    break;
            }

            return house;
        } catch (Exception ex) {
            throw new GreatHallException(ex.getMessage());
        }
    }

    private static int[] numberTimesChoosen(String[] answers) throws GreatHallException {
        try {
            int[] numAnswer = {0, 0, 0, 0};

            int timesChoosen;

            for (String answer : answers) {

                answer = answer.toUpperCase();
                switch (answer) {
                    case "A":
                        timesChoosen = numAnswer[0];
                        timesChoosen += 1;
                        numAnswer[0] = timesChoosen;
                        break;
                    case "B":
                        timesChoosen = numAnswer[1];
                        timesChoosen += 1;
                        numAnswer[1] = timesChoosen;
                        break;
                    case "C":
                        timesChoosen = numAnswer[2];
                        timesChoosen += 1;
                        numAnswer[2] = timesChoosen;
                        break;
                    case "D":
                        timesChoosen = numAnswer[3];
                        timesChoosen += 1;
                        numAnswer[3] = timesChoosen;
                        break;
                }
            }

            return numAnswer;
        } catch (Exception ex) {
            throw new GreatHallException(ex.getMessage());
        }
    }

    private static int getMost(int[] answers) throws GreatHallException {

        int maxPosition = 0;
        try {
            for (int i = 0; i < answers.length; i++) {
                if (answers[i] > answers[maxPosition]) {
                    maxPosition = i;
                }
            }
        } catch (Exception ex) {
            throw new GreatHallException(ex.getMessage());
        }

        return maxPosition;
    }
}
