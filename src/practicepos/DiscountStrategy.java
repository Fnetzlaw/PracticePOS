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
public interface DiscountStrategy {

    /*
     * method that needs to be override to create a discount strategy with the variable 
     * of qty and price
     */
    public abstract double getDiscountValue(int qty, double price);
}
