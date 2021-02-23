package lambdaEx;


//import java.util.function.Function;
import java.util.function.Predicate;

//convertingarg int to returns square
// normal way of coding
/*public class Ex1 {
	public static int squareIt(int a){
		return a*a;}	
     public static void main(String[] args) {
		System.out.println(squareIt(4));}
    	}
*/

public class Ex1{
	public static void main(String[] args) {
		/*Function<Integer, Integer> f = a->a*a;
		System.out.println(f.apply(9));*/
		Predicate<Integer> p=a->a%2==0|| a%2!=0;
		System.out.println(p.test(3));
		System.out.println(p.test(4));
	}
}