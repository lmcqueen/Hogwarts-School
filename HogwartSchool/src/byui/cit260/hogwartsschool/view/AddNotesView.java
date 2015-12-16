/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.NotesControl;
import byui.cit260.hogwartsschool.exceptions.NotesControlException;
/**
 *
 * @author lmcqueen
 */
public class AddNotesView extends View{
    
      public AddNotesView() {
        super("\n------------------------------------------------"
        + "\n|               Add Notes Menu             |"
        + "\n------------------------------------------------"
                + "\nP - Potions" +
            "\nC - Charms" +
            "\nR - Ancient Runes" +
            "\nD - Defense Against the Dark Arts" +
            "\nA - Astronomy" +
            "\nT - Transfiguration" +
            "\nV - Divination" +
            "\nH - Herbology" +
            "\nM - Care of Magical Creatures" +
            "\nF - Flying" +
            "\nO - Other" +
            "\nQ - Quit"
                + "\n------------------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase();
        if(value.length() > 1){
            ErrorView.display(this.getClass().getName(), "\n *** Invalid Selection. Enter only a single character. ***\n");
            return false;
        }
        
        switch(value){
            
            case "P":
                this.addPotionNotes();
                break;
            case "C":
                this.addCharmsNotes();
                break;
            case "R":
                this.addAncientNotes();
                break;
            case "D":
                this.addDefenseNotes();
                break;
            case "A":
                this.addAstronomyNotes();
                break;
            case "T":
                this.addTransfigurationNotes();
                break;
            case "V":
                this.addDivinationNotes();
                break;
            case "H":
                this.addHerbologyNotes();
                break;
            case "M":
                this.addCreaturesNotes();
                break;   
            case "F":
                this.addFlyingNotes();
                break;      
            case "O":
                this.addOtherNotes();
                break;   
            case "Q":
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection. Try again. ***");
                break;      
             
        }
        
        return false;
    }

    private void addPotionNotes() {
        String input = this.getInput();
          try {
              NotesControl.addNote(NotesControl.NoteNames.potion.ordinal(), input);
          } catch (NotesControlException ex) {
              ErrorView.display(this.getClass().getName(), ex.getMessage());
          }
    }

    private void addCharmsNotes() {
        String input = this.getInput();
          try {
              NotesControl.addNote(NotesControl.NoteNames.charm.ordinal(), input);
          } catch (NotesControlException ex) {
              ErrorView.display(this.getClass().getName(), ex.getMessage());
          }
    }

    private void addAncientNotes() {
        String input = this.getInput();
          try {
              NotesControl.addNote(NotesControl.NoteNames.ancient.ordinal(), input);
          } catch (NotesControlException ex) {
              ErrorView.display(this.getClass().getName(), ex.getMessage());
          }
    }

    private void addDefenseNotes() {
        String input = this.getInput();
          try {
              NotesControl.addNote(NotesControl.NoteNames.defense.ordinal(), input);
          } catch (NotesControlException ex) {
              ErrorView.display(this.getClass().getName(), ex.getMessage());
          }
    }

    private void addAstronomyNotes() {
        String input = this.getInput();
          try {
              NotesControl.addNote(NotesControl.NoteNames.astronomy.ordinal(), input);
          } catch (NotesControlException ex) {
              ErrorView.display(this.getClass().getName(), ex.getMessage());
          }
    }

    private void addTransfigurationNotes() {
       String input = this.getInput();
          try {
              NotesControl.addNote(NotesControl.NoteNames.transfiguration.ordinal(), input);
          } catch (NotesControlException ex) {
              ErrorView.display(this.getClass().getName(), ex.getMessage());
          }
    }

    private void addDivinationNotes() {
        String input = this.getInput();
          try {
              NotesControl.addNote(NotesControl.NoteNames.divination.ordinal(), input);
          } catch (NotesControlException ex) {
             ErrorView.display(this.getClass().getName(), ex.getMessage());
          }
    }

    private void addHerbologyNotes() {
        String input = this.getInput();
          try {
              NotesControl.addNote(NotesControl.NoteNames.herbology.ordinal(), input);
          } catch (NotesControlException ex) {
              ErrorView.display(this.getClass().getName(), ex.getMessage());
          }
    }

    private void addCreaturesNotes() {
        String input = this.getInput();
          try {
              NotesControl.addNote(NotesControl.NoteNames.care.ordinal(), input);
          } catch (NotesControlException ex) {
              ErrorView.display(this.getClass().getName(), ex.getMessage());
          }
    }

    private void addFlyingNotes() {
        String input = this.getInput();
          try {
              NotesControl.addNote(NotesControl.NoteNames.flying.ordinal(), input);
          } catch (NotesControlException ex) {
              ErrorView.display(this.getClass().getName(), ex.getMessage());
          }
    }

    private void addOtherNotes() {
        String input = this.getInput();
          try {
              NotesControl.addNote(NotesControl.NoteNames.other.ordinal(), input);
          } catch (NotesControlException ex) {
              ErrorView.display(this.getClass().getName(), ex.getMessage());
          }
    }

}
