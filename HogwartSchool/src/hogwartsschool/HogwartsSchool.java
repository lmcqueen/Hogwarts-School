/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsschool;

import byui.cit260.hogwartsschool.model.Game;
import byui.cit260.hogwartsschool.model.Player;
import byui.cit260.hogwartsschool.view.ErrorView;
import byui.cit260.hogwartsschool.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

 /**
 * @author lmcqueen and jagiriga
 */
public class HogwartsSchool {

    private static Player player = null;
    private static Game currentGame = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            HogwartsSchool.inFile = new BufferedReader(new InputStreamReader(System.in));
            HogwartsSchool.outFile = new PrintWriter(System.out, true);
            
            String filePath = "log.txt";
            HogwartsSchool.logFile = new PrintWriter(filePath);
            
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
            
        }
        catch(Throwable te){
            ErrorView.display("HogwartsSchool", te.getMessage());
        }
        finally {
            try {
                if(HogwartsSchool.inFile != null)
                    HogwartsSchool.inFile.close();
                if(HogwartsSchool.outFile != null)
                    HogwartsSchool.outFile.close();
                if(HogwartsSchool.logFile != null)
                    HogwartsSchool.logFile.close();
            } catch (IOException ex) {
                ErrorView.display("HogwartsSchool","Error closing files");
                return;
            }
        }
        
    }

     public static Player getPlayer() {
        return player;
    }
    
    public static void setPlayer(Player player) {
        HogwartsSchool.player = player;
    }  

    public static void setCurrentGame(Game game) {
        HogwartsSchool.currentGame = game;
    }
    
    public static Game getCurrentGame(){
        return currentGame;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        HogwartsSchool.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        HogwartsSchool.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        HogwartsSchool.logFile = logFile;
    }
    
}
