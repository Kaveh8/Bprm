/*
 * Copyleft © 2013 Kaveh Shahhosseini
 * BPRM is distributed under the GNU General Public License Version3
 */
package bprm;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Kaveh Shahhosseini
 */
public class BPRM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
        } catch (IllegalAccessException ex) {
        } catch (InstantiationException ex) {
        } catch (ClassNotFoundException ex) {
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
//        Mainframe mainWindow=new Mainframe();
//        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//        mainWindow.setLocation(dim.width/2-mainWindow.getSize().width/2, dim.height/2-mainWindow.getSize().height/2);
//        mainWindow.setVisible(true);
           TabCards cl=new TabCards();
        cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        cl.setLocation(dim.width/2-cl.getSize().width/2, dim.height/2-cl.getSize().height/2);
        cl.setVisible(true);
    }
}
