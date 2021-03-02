package lambdaEx;

@FunctionalInterface
interface MyFunctionalInterface {

	// A method with no parameter
	public String sayHello();
}

public class Ex {

	public static void main(String args []) {
		// lambda expression
		MyFunctionalInterface msg = () -> {
			return "Hello";
		};
		System.out.println(msg.sayHello());
	}
}