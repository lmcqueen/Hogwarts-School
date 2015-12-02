/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.MapControl;
import byui.cit260.hogwartsschool.exceptions.MapControlException;
import java.awt.Point;

/**
 *
 * @author lmcqueen
 */
public class MoveLocationView extends View{
    
    public MoveLocationView() {
        super("\n Please enter the coodinates of where you would like to go.");
    }
   
    @Override
    public void display() {
        //DISPLAY prompt
        this.console.println(getPromptMessage());
        boolean done = false;
        String row;
        String column;
        double rowNum;
        double columnNum;

        do {
            //GET cauldron depth and diameter
            this.console.println("\nEnter the row you would like to go to: ");
            row = this.getInput();
            
            try{
               rowNum = Double.parseDouble(row); 
            }
            catch(NumberFormatException nf){
                ErrorView.display(this.getClass().getName(), "You must enter a valid number. Please try again. /n");
                continue;
            }
            
            
            this.console.println("\nEnter the column you would like to go to: ");
            column = this.getInput();
            
            try{
               columnNum = Double.parseDouble(column); 
            }
            catch(NumberFormatException nf){
                ErrorView.display(this.getClass().getName(),"You must enter a valid number. Please try again. /n");
                continue;
            }
 
            Point point = new Point();
            point.setLocation(rowNum, columnNum);
            
            if(this.doAction(point)){
                done = true;
            }

        } while (!done);
    }
  
    @Override 
    public boolean doAction(Object obj) {
       Point point = (Point) obj;
       
       try{
           MapControl.movePlayer(point);
       }
       catch(MapControlException me){
           ErrorView.display(this.getClass().getName(), me.getMessage());
           return false;
       }
       
      return true;
      
    }
   
  
}
