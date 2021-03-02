package Task1;

import java.io.FileInputStream;
import java.io.IOException;

public class Read {
	public static void main(String[] args) throws IOException{
//     String s = "PoornaSree";
     try{
    	 FileInputStream fin =  new FileInputStream("C:\\Users\\Tech\\Downloads");
    	 int i = fin.read();
    	 fin.available();
    	 fin.close();
    	 System.out.println(i +"success");
     }catch(Exception e){}
//     finally{System.out.println("Exception caught");}
	}
}
