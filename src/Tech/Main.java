package Tech;

class OuterClass {
	static int Outer_x = 15;// static
	static int Outer_y = 15;// instance(non-static)
	private static int Outer_private = 30;// private

	static class StaticNestedClass {// static nested class
		void display() {
			System.out.println(Outer_x);// can access static member

			System.out.println(Outer_y);// can access non-static member

			System.out.println(Outer_private);// display can access private also
		}
	}
}

public class Main {

	public static void main(String args[]) {
		OuterClass.StaticNestedClass np = new OuterClass.StaticNestedClass();
		np.display();
	}

}
