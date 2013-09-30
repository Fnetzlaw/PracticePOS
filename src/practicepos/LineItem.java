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
public class LineItem {

    /**
     * declaring variables
     */
    private DatabaseProduct ndb = new ProductDatabase();
    private Product product;
    private int qty;

    /**
     * construtor that requires a prodId and qty
     */
    public LineItem(String prodId, int qty) {
        this.qty = qty;
        product = ndb.getTheProductID(prodId);
    }

    /**
     * @return the product id
     */
    public String getLineItemID() {
        return (product.getProductID());
    }

    /**
     * @return the products description
     */
    public String getLineItemDescription() {
        return (product.getDescription());
    }

    /**
     * @return the discount amount for all qty of the item
     */
    public double getDiscountAmt() {
        return (product.getDiscountAmount(qty));
    }

    /**
     * @return the unit price value
     */
    public double getPriceAmt() {
        return (product.getPrice());
    }

    /**
     * @return the total prices of all the same items
     */
    public double getProductAmt() {
        return (product.getPrice() * qty);
    }

    /**
     * @return  product data
     */
    public Product getProduct() {
        return product;
    }

    /**
     * setting data with the product variables 
     */
    public final void setProject(Product product) {
        // validations is needed
        this.product = product;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * setting data with the variable qty 
     */
    public final void setQty(int qty) {
        // validations is needed
        this.qty = qty;
    }
}
