package assignment;

import java.util.*;

public class Hash2 {
     public static void main(String args[]){
    	 HashSet<Character> ss = new HashSet<Character>();
    	 ss.add('a');
    	 ss.add('g');
    	 Iterator<Character> i = ss.iterator();
    	 while(i.hasNext())
    	 {
    		 System.out.println(i.next());
    	 }
     }
}
