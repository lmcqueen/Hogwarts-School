/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import byui.cit260.hogwartsschool.exceptions.MerchandiseControlException;
import byui.cit260.hogwartsschool.model.Merchandise;

/**
 *
 * @author lmcqueen
 */
public class MerchandiseControl {
    
    public static Merchandise[] getSortedMerchandise() throws MerchandiseControlException{
        try{    
        Merchandise[] merchandiseList = Merchandise.values();
        Merchandise[] merchandiseSorted = merchandiseList.clone();
        
        
        Merchandise tempMerchandise;
         for (int i = 1; i < merchandiseSorted.length; i++) {
            for (int j = i; j > 0; j--) {
                if (merchandiseSorted[j].name().compareToIgnoreCase(merchandiseSorted[j - 1].name()) < 0) {
                    tempMerchandise = merchandiseSorted[j];
                    merchandiseSorted[j] = merchandiseSorted[j - 1];
                    merchandiseSorted[j - 1] = tempMerchandise;
                }
            }
        }
        
        return merchandiseList;
        }catch(Exception ex){
            throw new MerchandiseControlException(ex.getMessage());
        }
    }
    
    public static int getCostOfItem(int position) throws MerchandiseControlException{
        try{
        Merchandise[] merchandiseList = Merchandise.values();
        
        int cost = merchandiseList[position].getPrice();
        
        return cost;
        }catch(Exception ex){
            throw new MerchandiseControlException(ex.getMessage());
        }
    }
}
