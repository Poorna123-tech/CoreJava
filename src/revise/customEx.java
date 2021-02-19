package revise;

import java.util.*;

public class customEx {
	public static void main(String[] args) {
     int[] intArr =  { 6, 4, 9, 1 };
     Arrays.sort(intArr);
     System.out.println(Arrays.toString(intArr));
     
     String[] str = {"poorna", "Sree", "chinna"};
     Arrays.sort(str);
     System.out.println(Arrays.toString(str));
     
    char[] ch = {'a', 'b', 'c'};
    Arrays.sort(ch);
    System.out.println(Arrays.toString(ch));
   
	ArrayList<String> Ar = new ArrayList<String>();
	Ar.add("poorna");
	Ar.add("Sree");
	Collections.sort(Ar);
	for (int i = 0; i < Ar.size(); i++) {
		System.out.println("   " + Ar);
	}
	}
}
