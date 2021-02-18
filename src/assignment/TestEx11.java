package assignment;

public class TestEx11 {
	static Thread t1 = new Thread(){
		public void run(){
			System.out.println("one");
		}
	};
      static Thread t2 = new Thread(){
    	  public void run(){
    		  System.out.println("two");
    	  }
      };
      
      public static void main(String args[]){
      
      t1.start();
      t2.start();
      }
}