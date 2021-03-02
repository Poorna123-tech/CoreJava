package assignment;

public class Exce1 {
	public static void main (String args[]){
		try{
			int i = 1;
			int a = 0;
			int b = i/a;
			System.out.print(b);
		}catch(ArithmeticException e){
			System.out.print(e);
			
		}
		
	}

	
}
