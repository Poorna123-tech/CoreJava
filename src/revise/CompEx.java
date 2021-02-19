package revise;

public class CompEx implements Comparable<CompEx> {
	int a;
	String name;

	public CompEx(int a, String name) {
		this.a = a;
		this.name = name;
	}

	public int compareTo(CompEx i) {
		if (a == i.a) {
			return 0;
		} else if (a > i.a) {
			return 1;
		} else {
			return -1;
		}
	}
}
