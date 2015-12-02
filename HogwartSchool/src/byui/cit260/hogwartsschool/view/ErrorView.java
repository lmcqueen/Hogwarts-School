/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import hogwartsschool.HogwartsSchool;
import java.io.PrintWriter;

/**
 *
 * @author lmcqueen and jagiriga
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = HogwartsSchool.getOutFile();
    private static final PrintWriter logFile = HogwartsSchool.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                "---------------------------------------------------------------"
                +"\n - Error - " + errorMessage
                +"---------------------------------------------------------------");
        logFile.println(className + " - " + errorMessage);
        
    }
    
}
