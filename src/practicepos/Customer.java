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
public class Customer {

    /**
     * declaring variables
     */
    private int custID;
    private String fullName;

    /**
     * constuctor that requires a custID and fullName
     */
    public Customer(int custID, String fullName) {
        this.custID = custID;
        this.fullName = fullName;
    }

    /**
     * 
     * @return custID
     */
    public int getCustID() {
        return custID;
    }

    /**
     * setting data into the variable custID
     */
    public final void setCustID(int custID) {
        // validations is needed
        this.custID = custID;
    }

    /**
     * 
     * @return fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * setting data into the variable fullName
     */
    public final void setFullName(String fullName) {
        // validations is needed
        this.fullName = fullName;
    }
}
