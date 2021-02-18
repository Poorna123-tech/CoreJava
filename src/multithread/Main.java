package multithread;

public class Main extends Thread{
      public void run(){
    	  try{
    		  Thread.sleep(500);
    		  System.out.println("x:" + Thread.currentThread().isAlive());
    		  
    	  }catch(Exception interrupted ){
    		  System.out.println();
    	  }
    	  if(Thread.currentThread().isDaemon()){
    		  System.out.println("Thread works");
    	  }
    	  else{
    		  System.out.println("Thread error");
    	  }
      }public static void main(String[] args) {
  		Main t1 = new Main();
  		Main t2 = new Main();
  		Main t3 = new Main();
  		t2.setDaemon(true);
  		t3.setDaemon(true);
  		System.out.println("before starting thread isAlive: "+t1.isAlive());  
  		t1.start();
  		System.out.println("after starting thread isAlive: "+t1.isAlive());
  		t2.start();
  		
  	}

	
}
