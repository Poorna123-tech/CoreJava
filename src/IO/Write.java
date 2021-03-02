package IO;

import java.io.FileOutputStream;
import java.io.IOException;



public class Write {
  public static void main(String[] args) throws IOException{
	  try{
	FileOutputStream f = new FileOutputStream("C:\\Users\\Tech\\Downloads");
	String s = "PoornaSree";

	byte b[] = s.getBytes();//Converting String to Byte
	

	f.write(b);
	f.flush();
	f.close();
	  }catch(Exception e){}finally{
	  }
		  System.out.println("Io Exception caught");
	  }
}

