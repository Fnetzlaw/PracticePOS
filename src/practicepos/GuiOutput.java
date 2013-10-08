/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package practicepos;

import javax.swing.JOptionPane;

/**
 *
 * @author Expression Fnetzlaw is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class GuiOutput implements OutputStrategy {

    @Override
    public void outputReceipt(String data) {
        JOptionPane.showMessageDialog(null,data);
    }

}
