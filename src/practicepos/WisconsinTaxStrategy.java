/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package practicepos;

/**
 *
 * @author Expression Fnetzlaw is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class WisconsinTaxStrategy implements TaxStrategy{

    /**
     * declaring variables
     */
    private double wisconsinTax = 0.05;

    /**
     * * method from the interface class that is override to the specifics of this 
     * class
     * @return tax value 
     */
    @Override
    public double getTaxValue(double taxAmount) {
        return (taxAmount * wisconsinTax);
    }

}
