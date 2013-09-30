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
public class SeniorDiscountStrategy implements DiscountStrategy {

    /**
     * declaring variables
     */
    private double price;
    private double discountRate = 0.15;

    /**
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * setting the data for price
     */
    public final void setPrice(double price) {
        // validations is needed
        this.price = price;
    }

    /**
     * method from the interface class that is override to the specifics of this 
     * class
     * @return discount value
     */
    @Override
    public double getDiscountValue(int qty, double price) {
        return ((price * discountRate) * qty);
    }
}
