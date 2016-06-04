/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bprm;

/**
 *
 * @author kaveh
 */
import java.io.File;
import javax.swing.filechooser.*;

/* FlashCardFilter.java is used by MainJFrame.java to filter flash cards */
public class FcFilter extends FileFilter {

    //Accept all csv, brp or txt files.
    @Override
    public boolean accept(File f) {

        String extension = Utils.getExtension(f);
        if (extension != null) {
            if (extension.equalsIgnoreCase(Utils.brp) ||
                extension.equalsIgnoreCase(Utils.txt) ||
                extension.equalsIgnoreCase(Utils.csv) )
                 {
                    return true;
            } else {
                return false;
            }
        }

        return false;
    }

    //The description of this filter
    @Override
    public String getDescription() {
        return "Flash Cards";
    }  
}