/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import byui.cit260.hogwartsschool.exceptions.NotesControlException;
import byui.cit260.hogwartsschool.model.Notes;
import hogwartsschool.HogwartsSchool;
import java.util.ArrayList;

/**
 *
 * @author lmcqueen
 */
public class NotesControl {
   
    public enum NoteNames {
        potion,
        charm,
        ancient,
        defense,
        astronomy,
        transfiguration,
        care,
        herbology,
        divination,
        flying,
        other
    }
    
    public static Notes[] intializeNotes(){
        
        Notes[] notebook = new Notes[11]; 
           
        ArrayList<String> potionNotes = new ArrayList<>();
        ArrayList<String> charmsNotes = new ArrayList<>();
        ArrayList<String> ancientNotes = new ArrayList<>();
        ArrayList<String> defenseNotes = new ArrayList<>();
        ArrayList<String> astronomyNotes = new ArrayList<>();
        ArrayList<String> transfigurationNotes = new ArrayList<>();
        ArrayList<String> herbologyNotes = new ArrayList<>();
        ArrayList<String> divinationNotes = new ArrayList<>();
        ArrayList<String> flyingNotes = new ArrayList<>();
        ArrayList<String> careNotes = new ArrayList<>();
        ArrayList<String> otherNotes = new ArrayList<>();
        
        Notes potions = new Notes();
        potions.setNotes(potionNotes);
        notebook[NoteNames.potion.ordinal()] = potions;
        
        Notes charms = new Notes();
        charms.setNotes(charmsNotes);
        notebook[NoteNames.charm.ordinal()] = charms;
        
        Notes ancient = new Notes();
        ancient.setNotes(ancientNotes);
        notebook[NoteNames.potion.ordinal()] = ancient;
        
        Notes defense = new Notes();
        defense.setNotes(defenseNotes);
        notebook[NoteNames.defense.ordinal()] = defense;
        
        Notes astronomy = new Notes();
        astronomy.setNotes(astronomyNotes);
        notebook[NoteNames.astronomy.ordinal()] = astronomy;
        
        Notes transfiguration = new Notes();
        transfiguration.setNotes(transfigurationNotes);
        notebook[NoteNames.transfiguration.ordinal()] = transfiguration;
        
        Notes herbology = new Notes();
        herbology.setNotes(herbologyNotes);
        notebook[NoteNames.herbology.ordinal()] = herbology;
        
        Notes care = new Notes();
        care.setNotes(careNotes);
        notebook[NoteNames.care.ordinal()] = herbology;
        
        Notes divination = new Notes();
        divination.setNotes(divinationNotes);
        notebook[NoteNames.divination.ordinal()] = divination;
        
        Notes flying = new Notes();
        flying.setNotes(flyingNotes);
        notebook[NoteNames.flying.ordinal()] = flying;
        
        Notes other = new Notes();
        other.setNotes(otherNotes);
        notebook[NoteNames.other.ordinal()] = other;
        
        return notebook;
    }
    
    public static ArrayList<String> getNotes (int position) throws NotesControlException{
        try{
        Notes[] notes = HogwartsSchool.getCurrentGame().getNotes();
        
        ArrayList<String> getNotes = notes[position].getNotes();
        
        return getNotes;
        }catch(Exception ex){
            throw new NotesControlException(ex.getMessage());
        }
    }
    
    public static void addNote(int position, String note) throws NotesControlException{
        try{
        Notes[] notes = HogwartsSchool.getCurrentGame().getNotes();
        notes[position].addNote(note);
        }catch(Exception ex){
            throw new NotesControlException(ex.getMessage());
        }
    }
}
