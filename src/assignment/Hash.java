package assignment;

import java.util.*;

public class Hash {
     public static void main(String args[]){
    	 HashSet<Integer> hs = new HashSet<Integer>();
    	 hs.add(12);
    	 hs.add(23);
    	 hs.add(90);
    	 Iterator<Integer> i= hs.iterator();
    	 while(i.hasNext()){
    		 System.out.println(i.next());
    	 }
     }
}
