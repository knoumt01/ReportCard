/*
 * This may be used in the future for parsing data and formatting it in a
 * uniform fashion.
 */
package utilities;

import javax.swing.JOptionPane;


public class FieldFixer {
    // Date processor
    // SSN processor
    public static String ssnFixer(String ssn) {
        if ( ssn.length() != 9 ) {
        }
        return ssn;
    }
    // money fixter

    /**
     *
     * @param money
     * @return
     */
        public static String moneyFixer(String money) {
        money = money.replaceAll("\\$|(?<=\\d),(?=\\d)", "");
        return money;
    }
}
