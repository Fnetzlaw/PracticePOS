/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicepos;

/**
 *
 * @author Expression Fnetzlaw is undefined on line 12, column 14 in
 * Templates/Classes/Class.java.
 */
public class TaxFreeStrategy implements TaxStrategy {

    /**
     * declaring variables
     */
    private double taxFree = 0;

    /**
     * method from the interface class that is override to the specifics of this
     * class
     *
     * @return tax value
     */
    @Override
    public double getTaxValue(double taxAmount) {
        return (taxAmount * taxFree);
    }
}
