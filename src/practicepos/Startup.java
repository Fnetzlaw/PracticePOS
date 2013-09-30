/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicepos;

/**
 *
 * @author netzl_000
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CashRegister cr = new CashRegister();
        cr.startNewSale(100, new WisconsinTaxStrategy());
        cr.addItemToSale("900", 2);
        cr.addItemToSale("901", 4);
        cr.getOutput();

        cr.startNewSale(101, new TaxFreeStrategy());
        cr.addItemToSale("900", 2);
        cr.addItemToSale("901", 4);
        cr.addItemToSale("902", 1);
        cr.getOutput();

    }
}
