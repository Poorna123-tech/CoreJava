package lambdaEx;

import java.util.function.BiFunction;

//Method reference to a ainstance method
/*interface Ex11 {
   void display();       
}
 class Ex81{
    void method(){
	   System.out.println("Instance ");
   }
   
 
 
	 public static void main(String[] args) {
		Ex81 j = new Ex81();
		Ex11 h = j::method;
		h.display();
	}
 }*/
//Method reference to a Static method

interface Addition {
	static int add(int a, int b) {
		return a + b;
	}

	public class Ex11 {
		public static void main(String[] args) {
			BiFunction<Integer, Integer, Integer> c = Addition::add;

			System.out.println(c.apply(4, 5));

		}
	}

}