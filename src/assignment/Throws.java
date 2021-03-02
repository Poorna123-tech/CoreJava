package assignment;
import java.io.*;
   public class Throws {
	   @SuppressWarnings("unused")
	public static void findFile() throws IOException{
		 File f = new File("jhf");
		 @SuppressWarnings("resource")
		FileInputStream stream = new FileInputStream(f);
	   }

	   public static void main(String args[]){
		   try{
			   findFile();
		   }catch(Exception e){
			   System.out.print("e");
			  
		   }System.out.print("sorry");
	   }
	

}
