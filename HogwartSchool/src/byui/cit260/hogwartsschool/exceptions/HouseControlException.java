/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.exceptions;

/**
 *
 * @author lmcqueen
 */
public class HouseControlException extends Exception{

    public HouseControlException() {
    }

    public HouseControlException(String message) {
        super(message);
    }

    public HouseControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public HouseControlException(Throwable cause) {
        super(cause);
    }

    public HouseControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
