package IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample{    
public static void main(String args[])throws IOException{    
	FileOutputStream fout = new FileOutputStream("C:\\Users\\Tech\\Downloads");
	try{
     FileOutputStream f1=new FileOutputStream("C:\\Users\\Tech\\Downloads");
     f1.close();
     }catch(FileNotFoundException e){
    	 System.out.println("Success");
     }finally{
    	 System.out.println("Exception caught");
     }
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
     String s="Welcome to javaTpoint.";    
     byte b[]=s.getBytes();    
     bout.write(b);    
     bout.flush();    
     bout.close();    
     fout.close();  
     
      System.out.println("success");   
    
}    
}  