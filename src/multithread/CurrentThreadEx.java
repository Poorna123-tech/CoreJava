package multithread;

public class CurrentThreadEx extends Thread {
      public void run(){
    	  System.out.println(Thread.currentThread().getName());
      }
      public static void main(String args[]){
    	  CurrentThreadEx t1 = new CurrentThreadEx();
    	  CurrentThreadEx t2 = new CurrentThreadEx();
    	  CurrentThreadEx t3 = new CurrentThreadEx();
    	  t1.start();
    	  t2.start();
    	  t3.start();
      }
}
