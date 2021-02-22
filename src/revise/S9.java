package revise;
import java.util.*;
//checking the size of hashmap

public class S9 {
   /*  public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String , Integer>();
		hm.put("1",1);
		hm.put("2",1);
		hm.put("3",2);
		hm.put("4",1);
		
		System.out.println(hm.size());
	}*/
	
	//checking whether hashmap is empty or not
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		
		
		
		System.out.println(hm.isEmpty());
		
		HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
		hm1.put("1",1);
		hm1.put("2",1);
		hm1.put("3",2);
		System.out.println(hm1.isEmpty());
	}
}
