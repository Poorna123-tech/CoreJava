package stringx;

//Performance of String  and StringBuffer
public class StrandStB {
	public static String withString() {
		String s = "poorna";
		for (int i = 0; i < 100; i++) {
			s = s + "sree";

		}
		return s;
	}

	public static String withStringBuffer() {
		StringBuffer sb = new StringBuffer("lovely");
		for (int i = 0; i < 100; i++) {
			sb = sb.append("sree");
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		withString();
		System.out.println(System.currentTimeMillis() - startTime + "ms");
		withStringBuffer();
		System.out.println(System.currentTimeMillis() - startTime + "ms");
	}
}


/*//convert class to obj and printing obj to see Hashcode
class StrandStB{
	public static void main(String[] args) {
		StrandStB t1 = new StrandStB();
		System.out.println(t1);
	}
}*/
