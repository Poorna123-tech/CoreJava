package assignment;

public class Exce1 {
	public static void main (String args[]){
		try{
			int i = 1/0;
			
		}catch(ArithmeticException e){
			System.out.print(e);
		}
		System.out.print("rest");
	}

	
}
