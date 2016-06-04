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
public class Imagefilter extends FileFilter {

    //Accept all csv, brp or txt files.
    @Override
    public boolean accept(File f) {

        String extension = Utils.getExtension(f);
        if(f.isDirectory()) return true;
        if (extension != null) {
            if (extension.equalsIgnoreCase(Utils.jpg) ||
                extension.equalsIgnoreCase(Utils.jpeg) ||
                extension.equalsIgnoreCase(Utils.png) ||
                extension.equalsIgnoreCase(Utils.gif) ||
                extension.equalsIgnoreCase(Utils.bmp)
                 )
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
        return "Images";
    }  
}