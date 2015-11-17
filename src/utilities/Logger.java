/*
 * Matt Knouff
 * IT 90.301
 * Logger class - assignment #2
 */
package utilities;

public class Logger {

    static boolean isLogging;
    static int clogLevel;

    public static void logDebug(String strMessage) {
        if (isLogging == true) {
            if (clogLevel >= 4) {
                System.out.println("DEBUG: " + strMessage);
            }
        }
    }
    
    public static void logInfo(String strMessage) {
        if (isLogging == true) {
            if (clogLevel >= 3) {
                System.out.println("DEBUG: " + strMessage);
            }
        }
    }
   
    public static void logWarning(String strMessage) {
        if (isLogging == true) {
            if (clogLevel >= 2) {
                System.out.println("DEBUG: " + strMessage);
            }
        }
    }
    
    public static void logError(String strMessage) {
        if (isLogging == true) {
            if (clogLevel >= 1) {
                System.out.println("DEBUG: " + strMessage);
            }
        }
    }
    
    public static void enableLogging() {
        isLogging = true;
    }
    
    public static void disableLogging() {
        isLogging = false;
    }
    
    public static void setLogLevel(int logLevel) {
        /* Test for valid integer for logLevel */
        if(logLevel == 1 || logLevel == 2 || logLevel == 3 || logLevel == 4) {
            clogLevel = logLevel;
        } else {
            System.out.println("Invalid selection. Try 1, 2, 3, or 4.");
        }
        
    }
}