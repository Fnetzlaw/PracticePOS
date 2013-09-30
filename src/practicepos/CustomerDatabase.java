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
public class CustomerDatabase implements DatabaseCustomer {

    /**
     * an array of customers ID and full name
     */
    private Customer[] customers = {
        new Customer(100, "Freddy Netzlaw"),
        new Customer(101, "Bob King")
    };

    /**
     * method from the interface class that is override to the specifics of this
     * class 
     * returns customer
     */
    @Override
    public Customer getTheCustomerID(int customerID) {
        Customer customer = null;
        for (Customer c : customers) {
            if (customerID == c.getCustID()) {
                customer = c;
                break;
            }
        }
        return customer;
    }
}
