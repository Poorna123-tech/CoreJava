package assignment;

import java.util.regex.Pattern;

public class RegEx {
   public static void main(String args[]){
	   System.out.println(Pattern.matches("[abc]", "abcd"));
	   System.out.println(Pattern.matches("[abv]", "a"));  
	   System.out.println(Pattern.matches("[mn]", "ammmna"));
   }
}
