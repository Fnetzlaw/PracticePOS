/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package practicepos;

/**
 *
 * @author Expression Fnetzlaw is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class TaxFactory extends AbstractFactory {
    
    private static TaxFactory instance;

    private TaxFactory() {
    }
    public static TaxFactory getInstance() {
         if(instance == null) {
            instance = new TaxFactory();
         }
         return instance;
    }

    public TaxStrategy getReader(AbstractFactory.Taxs readerType) {
        TaxStrategy r = null;
        
        switch(readerType) {
            case WI:
                r = new WisconsinTaxStrategy();
                break;
            case NONE:
                r = new TaxFreeStrategy();
                break;
        }
        
        return r;
    }

}
