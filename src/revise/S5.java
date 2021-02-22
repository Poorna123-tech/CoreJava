package revise;

import java.util.*;
//Given an element write a program to check if element(value) exists in ArrayList?

public class S5 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);

		// checking an element whether it is in arraylist or not

		if (al.contains(3)) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}
	}
}
