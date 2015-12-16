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
public class GreatHallException extends Exception {

    public GreatHallException() {
    }

    public GreatHallException(String message) {
        super(message);
    }

    public GreatHallException(String message, Throwable cause) {
        super(message, cause);
    }

    public GreatHallException(Throwable cause) {
        super(cause);
    }

    public GreatHallException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
