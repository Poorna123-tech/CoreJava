package assignment;

public class WhileFibonacci {

	public static void main(String[] args) {
		 
		int i=1, n = 5, f1=0, f2=1;
		
		while(i<=n)
		{
			System.out.print(f1 + " ");
			
			int sum = f1 + f2;
			     f1 = f2;
			     f2 = sum;
			     i++;
		}
		

	}

}
