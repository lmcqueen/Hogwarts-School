/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import java.util.Scanner;

/**
 *
 * @author lmcqueen and Johnson
 */
public abstract class View implements ViewInterface {
      
    private String promptMessage;
      
      public View(String promptMessage){
          this.promptMessage = promptMessage;
      }
      
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
    
      @Override
    public String getInput() {
        
        boolean valid = false;
        Scanner keyboard = new Scanner(System.in);
        String value = null;
        
        while(!valid){
            System.out.println("Please enter you input:");
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if(value.length() < 1) {
                System.out.println("\n *** Invalid Selection. Please enter a selection. ***\n");
                System.out.println(this.promptMessage);
                continue;
            }
            
            break;
        }
       
        return value;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
}

