package multithread;

public class UserdEx extends Thread{
     public void run(){
    	 System.out.println("Thread priority is :" + Thread.currentThread().getPriority());
     }
     public static void main(String args[]){
    	 UserdEx t1 =new UserdEx();
    	 UserdEx t2 = new UserdEx();
    	 
    	 t1.setPriority(4);
    	 t1.setPriority(10);
    	 
    	 t1.start();
    	 t2.start();
     }
}
