package revise;

import java.util.*;

public class S7 {
	public static void main(String[] args) {
		HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
		hm.put(1, 'a');
		hm.put(2, 'b');

		for (Map.Entry<Integer, Character> i : hm.entrySet()) {
			System.out.println(i.getKey() + i.getValue());
		}
	}
}
