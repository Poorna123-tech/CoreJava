package assignment;

public class Finalize {


protected void finalize() { System.out.println("Finalize");}
	
	    int f1= 2;
	    int f2 =6;
	    int f3 = 0;{

		
		f3 = f1 + f2;
		System.out.println(f3);
		
	}

}
