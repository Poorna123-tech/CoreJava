package lambdaEx;

/*import java.util.Arrays;

//Method reference to an instance method of an arbitrary object

class Sampl {
	public static void main(String[] args) {
		Integer[] i= {1,2,3,4,5,6,7,8,9,10};
		Arrays.sort(i, Integer::compareTo);
		for(Integer j : i){
			System.out.print(j);
		}
	}
}
*/

@FunctionalInterface
interface Sree{
	void sree();
}
class Sree1{
	Integer sree1(int a){
		return 10;
		
	}
}

public class Sampl{
	public static void main(String[] args) {
		Sree s = Sree1 :: new; 
		s.sree();
	}
}