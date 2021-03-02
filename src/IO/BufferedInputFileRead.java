package IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputFileRead {
	public static void main(String[] args) {         
	      //Specify the path of the file here
	      File file = new File("C:\\Users\\Tech\\OneDrive\\Documents");
	      BufferedInputStream bis = null;
	      FileInputStream  fis= null;

	      try
	      {
	         
	          fis = new FileInputStream(file);

	          
	          bis = new BufferedInputStream(fis);

	        
	          while( bis.available() > 0 ){             	
	              System.out.print((char)bis.read());
	          }

	       }catch(FileNotFoundException i)
	        {
	            System.out.println("The specified file not found" + i);
	        }
	        catch(IOException o)
	        {
	            System.out.println("I/O Exception: " +o); 
	        }
	        finally
	        {
	            try{
	               if(bis != null && fis!=null)
	               {
	       	          fis.close();
	                  bis.close();
	               }      
	             }catch(IOException ioe)
	              {
	                  System.out.println("Error in InputStream close(): " + ioe);
	              }         
	        }
	   }    
	}

