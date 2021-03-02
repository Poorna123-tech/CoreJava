package lambdaEx;

@FunctionalInterface
interface sayable{
	void say(String msg);
	int hashcode = 1000;
	String toString();
	boolean equals(Object obj);
	
}
public class FunctionalInterfaceExample implements sayable{  //class implements interface
	public void say(String msg){
		System.out.println(msg);
	}
	public static void main(String[] args) {
		FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
		fie.say("Crazy");
	}
}
