/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.NotesControl;
import static byui.cit260.hogwartsschool.control.NotesControl.getNotes;
import byui.cit260.hogwartsschool.exceptions.NotesControlException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lmcqueen
 */
public class NotesView extends View {

    public NotesView() {
        super("\n------------------------------------------------"
                + "\n|              View Notes Menu             |"
                + "\n------------------------------------------------"
                + "\nP - Potions"
                + "\nC - Charms"
                + "\nR - Ancient Runes"
                + "\nD - Defense Against the Dark Arts"
                + "\nA - Astronomy"
                + "\nT - Transfiguration"
                + "\nV - Divination"
                + "\nH - Herbology"
                + "\nM - Care of Magical Creatures"
                + "\nF - Flying"
                + "\nO - Other"
                + "\nQ - Quit"
                + "\n------------------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;
        value = value.toUpperCase();
        if (value.length() > 1) {
            ErrorView.display(this.getClass().getName(), "\n *** Invalid Selection. Enter only a single character. ***\n");
            return false;
        }

        switch (value) {

            case "P":
                this.viewPotionNotes();
                break;
            case "C":
                this.viewCharmsNotes();
                break;
            case "R":
                this.viewAncientNotes();
                break;
            case "D":
                this.viewDefenseNotes();
                break;
            case "A":
                this.viewAstronomyNotes();
                break;
            case "T":
                this.viewTransfigurationNotes();
                break;
            case "V":
                this.viewDivinationNotes();
                break;
            case "H":
                this.viewHerbologyNotes();
                break;
            case "M":
                this.viewCreaturesNotes();
                break;
            case "F":
                this.viewFlyingNotes();
                break;
            case "O":
                this.viewOtherNotes();
                break;
            case "Q":
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection. Try again. ***");
                break;

        }

        return false;
    }

    private void viewPotionNotes() {
        this.console.println("\nView Potion Notes:\n");
        ArrayList<String> printNotes;
        try {
            printNotes = getNotes(NotesControl.NoteNames.potion.ordinal());
            this.printList(printNotes);
        } catch (NotesControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

    private void viewCharmsNotes() {
        this.console.println("\nView Charms Notes:\n");
        ArrayList<String> printNotes;
        try {
            printNotes = getNotes(NotesControl.NoteNames.charm.ordinal());
            this.printList(printNotes);
        } catch (NotesControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

    private void viewAncientNotes() {
        this.console.println("\nView Ancient Runes Notes:\n");
        ArrayList<String> printNotes;
        try {
            printNotes = getNotes(NotesControl.NoteNames.ancient.ordinal());
            this.printList(printNotes);
        } catch (NotesControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

    private void viewDefenseNotes() {
        this.console.println("\nView Defense Against the Dark Arts Notes:\n");
        ArrayList<String> printNotes;
        try {
            printNotes = getNotes(NotesControl.NoteNames.defense.ordinal());
            this.printList(printNotes);
        } catch (NotesControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

    private void viewAstronomyNotes() {
        this.console.println("\nView Astronomy Notes:\n");
        ArrayList<String> printNotes;
        try {
            printNotes = getNotes(NotesControl.NoteNames.astronomy.ordinal());
            this.printList(printNotes);
        } catch (NotesControlException ex) {
            Logger.getLogger(NotesView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void viewTransfigurationNotes() {
        this.console.println("\nView Transfiguration Notes:\n");
        ArrayList<String> printNotes;
        try {
            printNotes = getNotes(NotesControl.NoteNames.transfiguration.ordinal());
            this.printList(printNotes);
        } catch (NotesControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

    private void viewDivinationNotes() {
        this.console.println("\nView Divination Notes:\n");
        ArrayList<String> printNotes;
        try {
            printNotes = getNotes(NotesControl.NoteNames.divination.ordinal());
            this.printList(printNotes);
        } catch (NotesControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

    private void viewHerbologyNotes() {
        this.console.println("\nView Herbology Notes:\n");
        ArrayList<String> printNotes;
        try {
            printNotes = getNotes(NotesControl.NoteNames.herbology.ordinal());
            this.printList(printNotes);
        } catch (NotesControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

    private void viewCreaturesNotes() {
        this.console.println("\nView Care of Magical Creatures Notes:\n");
        ArrayList<String> printNotes;
        try {
            printNotes = getNotes(NotesControl.NoteNames.care.ordinal());
            this.printList(printNotes);
        } catch (NotesControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

    private void viewFlyingNotes() {
        this.console.println("\nView Flying Notes:\n");
        ArrayList<String> printNotes;
        try {
            printNotes = getNotes(NotesControl.NoteNames.flying.ordinal());
            this.printList(printNotes);
        } catch (NotesControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

    private void viewOtherNotes() {
        this.console.println("\nView Other Notes:\n");
        ArrayList<String> printNotes;
        try {
            printNotes = getNotes(NotesControl.NoteNames.other.ordinal());
            this.printList(printNotes);
        } catch (NotesControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }

    }

    private void printList(ArrayList<String> printNotes) {

        if (printNotes.isEmpty()) {
            this.console.println("There are currently no notes in this notebook. \n");
        } else {
            for (String notes : printNotes) {
                this.console.println(notes);
            }
        }
    }

}
