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
public class ProductDatabase implements DatabaseProduct {

    /**
     * creating a list of products in an array
     */
    Product[] products = {
        new Product("900", "Hat", 19.85, new ChirsmasDiscountStrategy()),
        new Product("901", "Watch", 35.99, new HolidayDiscountStrategy()),
        new Product("902", "Sock", 4.50, new SeniorDiscountStrategy()),
        new Product("903", "Bat", 9.99, new HolidayDiscountStrategy()),
        new Product("904", "Glove", 5.00, new ChirsmasDiscountStrategy()),
        new Product("905", "Shoe", 45.99, new SeniorDiscountStrategy())
    };


    /**
     * method from the interface class that is override to the specifics of this
     * class 
     * returns product
     */
    @Override
    public Product getTheProductID(String prodId) {
        Product product = null;
        for (Product p : products) {
            if (prodId.equals(p.getProductID())) {
                product = p;
                break;
            }
        }
        return product;
    }
}
