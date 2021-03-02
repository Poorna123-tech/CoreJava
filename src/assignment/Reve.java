package assignment;
import java.util.Scanner;
public class Reve {
 public static void main(String args[]){
	 String s ="";
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the String");
	 s = sc.nextLine();
	 for(int i=s.length();i>0;--i) 
	 {
		 System.out.print(s.charAt(i-1)); 
		 }sc.close();
 }
}
