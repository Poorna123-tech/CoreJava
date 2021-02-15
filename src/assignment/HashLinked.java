package assignment;
import java.util.*;
public class HashLinked {
     public static void main(String args[]){
    	 HashSet<String> g = new HashSet<String>();
    	  g.add("poorna");
    	  g.add("sree");
    	  g.add("pavani");
    	  Iterator<String> i = g.iterator();
    	  while(i.hasNext()){
    		  System.out.println(i.next());
    	  }
    	  String g1 = new String();
    	  g1 = g.remove(1) +"";
    	  System.out.println(g1);
     }
}
