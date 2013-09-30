/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicepos;

import java.text.NumberFormat;

/**
 *
 * @author Expression Fnetzlaw is undefined on line 12, column 14 in
 * Templates/Classes/Class.java.
 */
public class Receipt {
    /**
     * declares variables
     */
    private TaxStrategy tax;
    private DatabaseCustomer ndb = new CustomerDatabase();
    private LineItem lineItems[] = new LineItem[0];
    private Customer customer;
    private OutputStrategy os = new ConsoleOutput();
    NumberFormat nf = NumberFormat.getCurrencyInstance();

    /**
     * pass in the data from customerID and tax
     */
    public Receipt(int customerID, TaxStrategy tax) {
        customer = ndb.getTheCustomerID(customerID);
        this.tax = tax;
    }
    
    /**
     * pass in the data from prodId and qty 
     */
    public final void addToLineItem(String prodId, int qty) {
        // validations is needed
        LineItem item = new LineItem(prodId, qty);
        addToArray(item);
    }
    
    /**
     * adds items to an array to make an line item list 
     */
    public final void addToArray(LineItem item) {
        // validations is needed
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }

    /**
     * calculates the total cost before the discounts  
     * returns grandTotal
     */
    public double getTotalBeforeDiscount() {
        double grandTotal = 0.0;
        for (LineItem item : lineItems) {
            grandTotal += item.getProductAmt();
        }
        return grandTotal;
    }

    /**
     *  calculates the total cost for tax amount
     * returns grandTotalTax
     */
    public double getTaxAmount() {
        double grandTotalTax = 0.0;
        for (LineItem item : lineItems) {
            grandTotalTax += item.getProductAmt();
        }
        grandTotalTax = tax.getTaxValue(grandTotalTax);

        return grandTotalTax;
    }

    /**
     * calculates the total of discount
     * @returns grandTotal
     */
    public double getTotalForDiscount() {
        double grandTotal = 0.0;
        for (LineItem item : lineItems) {
            grandTotal += item.getDiscountAmt();
        }
        return grandTotal;
    }

    /**
     * formating for the layout of the output
     * @return getData
     */
    public String getDataForOutput() {
        String getData;
        double subTotal = (getTotalBeforeDiscount() - getTotalForDiscount());
        getData = customer.getFullName();
        getData += "\n__________________________________________________________________________________________\n";
        getData += "Item ID\t\t" + "Description\t" + "Quanity\t\t" + "Unit Price\t" + "Reg Price\t" + "Sale Price";
        getData += "\n__________________________________________________________________________________________";
        for (int i = 0; i < lineItems.length; i++) {
            
            getData += "\n" + lineItems[i].getLineItemID() + "\t\t" + lineItems[i].getLineItemDescription() + "\t\t" + lineItems[i].getQty()
                    + "\t\t" + nf.format(lineItems[i].getPriceAmt()) +"\t\t" + nf.format(lineItems[i].getProductAmt()) + "\t\t" 
                    + nf.format(lineItems[i].getProductAmt() - lineItems[i].getDiscountAmt());

        }
        getData += "\n\n\n\n\t\t\t\tYou Saved!: \t" + nf.format(getTotalForDiscount());
        getData += "\n\n\t\t\t\t\t\t\t\tSubTotal: \t" + nf.format(subTotal);
        getData += "\n\t\t\t\t\t\t\t\tTax Amount: \t" + nf.format(getTaxAmount());
        getData += "\n\t\t\t\t\t\t\t\tTotal Due: \t" + nf.format(subTotal + getTaxAmount());
        
        getData += "\n\n";


        return getData;
    }

    /**
     * delegates the work to make an output with the data from getDataForOutput
     */
    public void produceOutput() {
        os.outputReceipt(getDataForOutput());
    }
}
