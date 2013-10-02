/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicepos;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Expression Fnetzlaw is undefined on line 12, column 14 in
 * Templates/Classes/Class.java.
 */
public class CashRegister {

    private Receipt receipts;

    /**
     * delegates the work to start a new sale. pass in the variables custId, tax
     * data from start up.
     */
    public final void startNewSale(int custId, TaxStrategy tax, OutputStrategy os) {
        receipts = new Receipt(custId, tax, os);
    }

    /**
     * delegates the work to add items to the line item by passing in the
     * variables prodId, qty.
     */
    public final void addItemToSale(String prodId, int qty) {
        receipts.addToLineItem(prodId, qty);
    }

    /**
     * delegate the work to Receipts to get the output lay out.
     */
    public final void getOutput() {
        receipts.produceOutput();
    }
}
