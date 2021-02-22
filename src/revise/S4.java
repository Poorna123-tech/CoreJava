package revise;

import java.util.*;

public class S4 {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		/*
		 * Iterator<Integer> i = hs.iterator(); while(i.hasNext()){
		 * System.out.println(i.next()); }
		 */

		for (Integer i : hs) {
			System.out.println(i);
		}
	}
}
