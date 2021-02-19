package revise;

import java.util.ArrayList;
import java.util.Collections;

public class ComMain {
	public static void main(String[] args) {
		ArrayList<CompEx> al = new ArrayList<CompEx>();
		al.add(new CompEx(9, "poorna"));
		al.add(new CompEx(1, "poo"));
		al.add(new CompEx(7, "sree"));
		Collections.sort(al);
		for (CompEx c : al) {
			System.out.println(c.a + "=" + c.name);

		}
	}

}
