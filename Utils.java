/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bprm;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author kaveh
 */
public class Utils {

    public final static String brp = "BRP";
    public final static String csv = "CSV";
    public final static String txt = "TXT";
    public final static String jpg = "jpg";
    public final static String jpeg = "jpeg";
    public final static String png = "png";
    public final static String bmp = "bmp";
    public final static String gif = "gif";
    public final static Color main_color=hex2Rgb("#39709d");
    public static String flashcard_name="FlashCard";
    public static int cur_card_row;

    /*
     * Get the extension of a file.
     */  
    public static String getExtension(File f) {
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 &&  i < s.length() - 1) {
            ext = s.substring(i+1).toLowerCase();
        }
        return ext;
    }
    /**
     * conver hex string color to rgb
     * example parameter "#34f51d"
     */
    public static Color hex2Rgb(String colorStr) {
    return new Color(
            Integer.valueOf( colorStr.substring( 1, 3 ), 16 ),
            Integer.valueOf( colorStr.substring( 3, 5 ), 16 ),
            Integer.valueOf( colorStr.substring( 5, 7 ), 16 ) );
}
        public static void copyFile(String from_file,String to_file)
    {
    	   // If we've gotten this far, then everything is okay.
        // So we copy the file, a buffer of bytes at a time.
        FileInputStream from = null;  // Stream to read from source
        FileOutputStream to = null;   // Stream to write to destination
      //  from.reset();
        
        try {
          from = new FileInputStream(from_file);  // Create input stream
          to = new FileOutputStream(to_file);     // Create output stream
          byte[] buffer = new byte[4096];         // A buffer to hold file contents
          int bytes_read;                         // How many bytes in buffer
          // Read a chunk of bytes into the buffer, then write them out, 
          // looping until we reach the end of the file (when read() returns -1).
          // Note the combination of assignment and comparison in this while
          // loop.  This is a common I/O programming idiom.
          while((bytes_read = from.read(buffer)) != -1) // Read bytes until EOF
            to.write(buffer, 0, bytes_read);            //   write bytes 
        }
        catch(FileNotFoundException e)
        {
        	
        }
        catch (IOException e) {
			
		}
        // Always close the streams, even if exceptions were thrown
        finally {
          if (from != null) try { from.close(); } catch (IOException e) {  }
          if (to != null) try { to.close(); } catch (IOException e) {  }
        }
    }
    public static void open_weblog() {                             
     try {
         //Set your page url in this string. For eg, I m using URL for Google Search engine
         String url = "http://brainpower.blogsky.com";
         java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
       }
       catch (java.io.IOException e) {
           System.out.println(e.getMessage());
       }
}    
}
