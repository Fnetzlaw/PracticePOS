/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicepos;

/**
 *
 * @author netzl_000
 */
public interface DatabaseCustomer {
    
    /**
     * method that needs to be override to create a database strategy with the variable 
     * of customerID
     */
    public abstract Customer getTheCustomerID(int customerID);
    
}
