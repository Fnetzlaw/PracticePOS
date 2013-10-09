/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package practicepos;

/**
 *
 * @author Expression Fnetzlaw is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class OutputFactory extends AbstractFactory {
    
    private static OutputFactory instance;

    private OutputFactory() {
    }
    

    public static OutputFactory getInstance() {
        if(instance == null) {
            instance = new OutputFactory();
        }
        return instance;
    }
    
    public OutputStrategy getWriter(AbstractFactory.Outputs outputType) {
        OutputStrategy w = null;
        
        switch(outputType) {
            case GUI:
                w = new GuiOutput();
                break;
            case CONSOLE:
                w = new ConsoleOutput();
                break;
        }
        
        return w;
    }

}
