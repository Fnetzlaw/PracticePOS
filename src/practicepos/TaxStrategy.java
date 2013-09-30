/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicepos;

/**
 *
 * @author netzl_000
 */
public interface TaxStrategy {
    
    /**
     * method that needs to be override to create a tax strategy with the variable 
     * of taxAmount
     */
    public abstract double getTaxValue(double taxAmount);
    
}
