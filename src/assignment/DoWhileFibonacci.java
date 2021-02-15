package assignment;

public class DoWhileFibonacci {

	public static void main(String[] args) {
		int i = 1, n = 5, f1 = 0, f2 = 1;
		do
		{
			System.out.print(f1 + " ");
			int sum = f1 + f1;
			f1 = f2;
			f2 = sum;
			i++;
		}
		
		while(i<=n);

	}

}
