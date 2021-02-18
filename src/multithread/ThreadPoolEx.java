package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

 class ThreadPool implements Runnable{
	
	private Integer num;
	public ThreadPool(Integer s){
		this. num = s;
	}
   public void run(){
	   System.out.println(Thread.currentThread().getName() +"Start" +  num);
	   Processmessage();
	   System.out.println(Thread.currentThread().getName() + " end ");
   }
private void Processmessage() {
     try{
    	 Thread.sleep(500);
     }
	catch(Exception e){
	   e.printStackTrace();	
	}
}
}
public class ThreadPoolEx {
	public static void main(String args[]){
		ExecutorService executor = Executors.newFixedThreadPool(1);
		for(int i = 0; i < 4; i++){
		  Runnable Worker = new Thread("" + i);
		  executor.execute(Worker);
		  
		  
		}executor.shutdown();
		while(!executor.isTerminated()){
			System.out.println("All Threads");
		}
	}
}
