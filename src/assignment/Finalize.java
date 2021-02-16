package assignment;

public class Finalize {


public void finalize() { System.out.println("Finalize");}
	public static void main(String args[]){
	    int f1= 2;
	    int f2 =6;
	    int f3 = 0;
		//f = new Finalize();
		Finalize u = new Finalize();
		f3 = f1 + f2;
		System.out.println("f3");
		//f=u;
		System.gc();System.gc();
	}

}
