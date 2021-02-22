package revise;

// Given an element write a program to check if element exists in HashSet
import java.util.*;

public class S6 {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);

		if (hs.contains(2)) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}
	}

}
