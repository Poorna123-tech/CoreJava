package assignment;

import java.time.LocalDateTime;

public class DTS {

	public static void main(String a[]){
     LocalDateTime now = LocalDateTime.now();
     String s = String.valueOf(now);
     System.out.println(s);
     
     
     LocalDateTime i = LocalDateTime.parse(s);
     System.out.print(i);
     
     
	}
}
