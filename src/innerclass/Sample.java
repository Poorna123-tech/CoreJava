package innerclass;

public class Sample {
	class Outer {
		private short s = 10;

		void msg() {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		Sample t1 = new Sample();
		Sample.Outer p = t1.new Outer();
		p.msg();
	}

}
