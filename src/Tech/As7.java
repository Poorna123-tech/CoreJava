package Tech;

import java.util.*;

public class As7 {
     static int[] a = {1,2,3,3,7,8,7,8,9,10};
  
  
     public static void main(String args[]){
    	 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	 for (Integer i : a) {
			if(map.containsKey(i) ){
				System.out.println(i);
				
			}else{
				map.put(i, 1);
			}
		}
    	 
     }
     
}
