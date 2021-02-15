package assignment;

import java.util.*;

public class HashTableEx {
     public static void main(String args[]){
    	 Hashtable<Integer , String> p = new Hashtable<Integer , String>();
    	 p.put(2,"sree");
    	 p.put(1,"sri");
    	 p.put(3,"aruna");
    	  
    	 System.out.println("Before:" + p);
    	 
    	 p.remove(1);
    	 p.remove(2);
    	 p.remove(3);
    	 System.out.println("After" + p);
    	 
     }
}
