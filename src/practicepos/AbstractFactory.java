/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package practicepos;

/**
 *
 * @author Expression Fnetzlaw is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public abstract class AbstractFactory {

    public static enum Taxs {
        WI, NONE
    }
    
    public static enum Outputs {
        GUI, CONSOLE
    }
   
    public static TaxStrategy getTaxInstance(Taxs taxType) {
        TaxStrategy r = TaxFactory.getInstance().getReader(taxType);
        return r;
    }

    public static OutputStrategy getOutputInstance(Outputs outputType) {
        OutputStrategy w = OutputFactory.getInstance().getWriter(outputType);
        return w;
    }
}
