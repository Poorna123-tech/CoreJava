package assignment;

public class TryCatchEx {
  public static void main(String args[]){
	  int r = 0;
	  int s =1;
	  int a;
	  try{
	  a = s/r;
	  System.out.println(a);
	  }catch(ArithmeticException e ){
		  System.out.println(e);
	  }
  }
	
}
