package assignment;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5, f1 = 0, f2 = 1;
		 for(int i = 1; i<=n; i++ ){
			 System.out.print(f1 + " ");
			 int sum = f1 + f2;
			     f1 = f2;
			     f2 = sum;
		 }
	}

}
