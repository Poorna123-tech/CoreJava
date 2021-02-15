package assignment;
import java.util.*;
  public class HashMapEx {
       public static void main(String args[]){
    	   HashMap<String, Integer> map = new HashMap<String, Integer>();
    	   map.put("poorna", 6);
    	   map.put("Sree", 4);
    	   map.put("Pavani", 6);
    	   System.out.println("Iterating HashMap");
    	   for(Map.Entry a : map.entrySet()){
    	   System.out.println(a.getValue() + " "+a.getKey());
    	   System.out.println();
    	   }
       }
}
