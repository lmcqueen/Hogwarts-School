/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import java.util.Scanner;

/**
 *
 * @author Johnson
 */
public abstract class View implements ViewInterface {
    
    private String promptMessage;
    
    @Override
     public void display() {
        
        String value = "";
        boolean done = false;
        
        do{
            System.out.println(this.promptMessage);
            value = this.getInput();
            done = this.doAction(value);
            
        }while(!done);
                
    }

    private String getInput() {
        
        boolean valid = false;
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        
        while(!valid){
            System.out.println("Please enter a menu option below:");
            
            input = keyboard.nextLine();
            input = input.trim();
            input = input.toUpperCase();
            
            if(input.length() > 1){
                System.out.println("\n *** Invalid Selection. Enter only a single character. ***\n");
                System.out.println(MENU);
                continue;
            }
            
            break;
        }
       
        return input;
    }
    
    
}
