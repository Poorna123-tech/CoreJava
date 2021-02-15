package assignment;
import java.util.*;
import java.util.Map.Entry;
public class HashMapEx1 {
     public static void main(String args[]){
    	 HashMap<Integer, String> map = new HashMap<Integer, String>();
    	 map.put(1, "Honey");
    	 map.put(2,"Dev");
    	 map.put(3, "sree");
        System.out.println("Iterating HashMap:" + map);	 
    	  for(Entry<Integer, String> m : map.entrySet()){
    		  System.out.println(m.getKey() + m.getValue());
    	  }
    	   map.putIfAbsent(4,"Ram");
    	   for(Map.Entry<Integer, String> p : map.entrySet()){
    	   System.out.println(p.getKey() + "   " + p.getValue());
        }
    	   HashMap<Integer, String> map1 = new HashMap<Integer, String>();
    	   map1.put(5, "chinni");
    	   map1.putAll(map);
    	   for (Iterator<Entry<Integer, String>> iterator = (map1.entrySet()).iterator(); iterator.hasNext();) {
			Map.Entry k = iterator.next();
			System.out.println(k.getKey() + "   " + k.getValue());
		}
    		  map1.remove(1);
    		  map1.remove(2);
    		  System.out.println("Updated are:" + map1);
    		  
    	      		  
     }
        
}
