
package utilities;


/**
 *
 * @author mkdesign
 */
public class NoDataException extends Exception {
    public NoDataException( String message ) {
        super(message);
    }
   public NoDataException( Throwable cause ) {
        super(cause);
    }
    public NoDataException( String message, Throwable cause) {
        super(message,cause);
    }
    public NoDataException( String message, Throwable cause, 
            boolean enableSuppression, boolean writableStackTrace) {
        super(message,cause,enableSuppression,writableStackTrace);
    }
}