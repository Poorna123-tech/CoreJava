package IO;

import java.io.File;
import java.io.IOException;

public class Create {
   public static void main(String[] args) {
	File f = new File("C:\\Users\\Tech\\OneDrive\\Documents");
	boolean result;
	try{
		result = f.createNewFile();//Creating a file
		if(result)
			System.out.println(f.getCanonicalPath());
	}catch(IOException e){
	e.printStackTrace();}
}
}
