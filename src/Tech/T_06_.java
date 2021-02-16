package Tech;

import java.util.*;

public class T_06_ {
	int getMaxNumber() {
		ArrayList<Integer> large = new ArrayList<Integer>();

		large.add(33);
		large.add(32);
		large.add(0);
		for (int i = 0; i < large.size(); i++) {
			if (large.get(i) <= 0)
				return -1;
		}
		return Collections.max(large);
	}

public static void main(String[] args) {

T_06_ get = new T_06_();
System.out.println(get.getMaxNumber());
}
}
