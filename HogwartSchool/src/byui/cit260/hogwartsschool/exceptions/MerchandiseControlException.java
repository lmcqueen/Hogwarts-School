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
public class MerchandiseControlException extends Exception {

    public MerchandiseControlException() {
    }

    public MerchandiseControlException(String message) {
        super(message);
    }

    public MerchandiseControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public MerchandiseControlException(Throwable cause) {
        super(cause);
    }

    public MerchandiseControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
