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
public class ConsoleOutput implements OutputStrategy {

    /**
     * method from the interface class that is override to the specifics of this 
     * class
     */
    @Override
    public void outputReceipt(String data) {
        System.out.println(data);
    }

}
