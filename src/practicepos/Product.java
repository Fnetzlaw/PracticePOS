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
public class Product {

    /**
     * declaring variables
     */
    private String productID;
    private String description;
    private double price;
    private DiscountStrategy discountStrategy;
    private int MIN_STRING_LENGTH = 3;
    private int MAX_STRING_LENGTH = 3;
    private int MIN_PRICE = 0;
    private int MAX_PRICE = 10000;
    private String ERR_MSG = "Invalid Data Entered";

    /**
     * constructor that requires productID, description, price and the
     * discountStrategy
     */
    public Product(String productID, String description, double price, DiscountStrategy discountStrategy) {
        this.productID = productID;
        this.description = description;
        this.price = price;
        this.discountStrategy = discountStrategy;
    }

    /**
     *
     * @return the discountStrategy
     */
    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    /**
     * setting the data for DiscountStrategy
     */
    public final void setDiscountStrategy(DiscountStrategy DiscountStrategy) {
        // validations is needed
        this.discountStrategy = DiscountStrategy;
    }

    /**
     * @return the discount amount from its qty and pricing
     */
    public double getDiscountAmount(int qty) {
        return (discountStrategy.getDiscountValue(qty, price));
    }

    /**
     *
     * @return the productID
     */
    public String getProductID() {
        return productID;
    }

    /**
     * setting data to the variable productID
     */
    public final void setProductID(String productID) {
        if (productID == null || productID.length() < MAX_STRING_LENGTH || productID.length() > MIN_STRING_LENGTH){
            throw new IllegalArgumentException(ERR_MSG);
        }else {
            this.productID = productID;
        }
        
    }

    /**
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * setting data to the variable description
     */
    public final void setDescription(String description) {
        // validations is needed
        this.description = description;
    }

    /**
     *
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * setting data to the variable price
     */
    public final void setPrice(double price) {
        if (price < MAX_PRICE || price > MIN_PRICE){
            throw new IllegalArgumentException("ERR_MSG");
        }else {
            this.price = price;
        }
        
    }
}
