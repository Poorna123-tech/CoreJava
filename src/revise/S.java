package revise;

import java.util.*;
import java.util.Map.Entry;

public class S {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, null);
		map.put(2, null);
		map.put(3, "sree");
		System.out.println("Iterating ..");

		for (Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
			Entry<Integer, String> m = iterator.next();
			System.out.println(m.getKey());
		}
	}
}
