package bprm;



import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import java.io.IOException;
import java.util.zip.ZipEntry; 
import java.util.zip.ZipInputStream; 
 
/** 
 * 
 * @author jon 
 */ 
public class Decompress { 
  private String _zipFile; 
  private String _location; 
 
  public Decompress(String zipFile, String location) { 
    _zipFile = zipFile; 
    _location = location; 
 
    _dirChecker(""); 
  } 
 //**********************************************
  public void unzip() { 
    try  { 
      FileInputStream fin = new FileInputStream(_zipFile); 
      ZipInputStream zin = new ZipInputStream(fin); 
      ZipEntry ze = null; 
      while ((ze = zin.getNextEntry()) != null) { 
        //Log.v("Decompress", "Unzipping " + ze.getName()); 
 
        if(ze.isDirectory()) { 
          _dirChecker(ze.getName()); 
        } else { 
          FileOutputStream fout = new FileOutputStream(_location + ze.getName()); 
          for (int c = zin.read(); c != -1; c = zin.read()) { 
            fout.write(c); 
          } 
 
          zin.closeEntry(); 
          fout.close(); 
        } 
         
      } 
      zin.close(); 
    } catch(Exception e) { 
      //Log.e("Decompress", "unzip", e); 
    } 
 
  }
  //**************************************
  public static void unzip(String zipFile, String location) throws IOException {
	    int size;
	    int BUFFER_SIZE=2048;
	    byte[] buffer = new byte[BUFFER_SIZE];

	    try {
	        if ( !location.endsWith("/") ) {
	            location += "/";
	        }
	        File f = new File(location);
	        if(!f.isDirectory()) {
	            f.mkdirs();
	        }
	        ZipInputStream zin = new ZipInputStream(new BufferedInputStream(new FileInputStream(zipFile), BUFFER_SIZE));
	        try {
	            ZipEntry ze = null;
	            while ((ze = zin.getNextEntry()) != null) {
	                String path = location + ze.getName();
	                File unzipFile = new File(path);

	                if (ze.isDirectory()) {
	                    if(!unzipFile.isDirectory()) {
	                        unzipFile.mkdirs();
	                    }
	                } else {
	                    // check for and create parent directories if they don't exist
	                    File parentDir = unzipFile.getParentFile();
	                    if ( null != parentDir ) {
	                        if ( !parentDir.isDirectory() ) {
	                            parentDir.mkdirs();
	                        }
	                    }

	                    // unzip the file
	                    FileOutputStream out = new FileOutputStream(unzipFile, false);
	                    BufferedOutputStream fout = new BufferedOutputStream(out, BUFFER_SIZE);
	                    try {
	                        while ( (size = zin.read(buffer, 0, BUFFER_SIZE)) != -1 ) {
	                            fout.write(buffer, 0, size);
	                        }

	                        zin.closeEntry();
	                    }
	                    finally {
	                        fout.flush();
	                        fout.close();
	                    }
	                }
	            }
	        }
	        finally {
	            zin.close();
	        }
	    }
	    catch (Exception e) {
	       // Log.e("unzip", "Unzip exception", e);
	    }
	}
 
  private void _dirChecker(String dir) { 
    File f = new File(_location + dir); 
 
    if(!f.isDirectory()) { 
      f.mkdirs(); 
    } 
  } 
} 