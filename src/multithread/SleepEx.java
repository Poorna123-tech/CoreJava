package multithread;

public class SleepEx extends Thread {
       public void run(){
    	   for(int i =1 ; i < 3; i++){
    		   try{
    			   Thread.sleep(1000);
    			   }catch(InterruptedException e){
    				   System.out.println(e);
    				   
    			   }System.out.println(i);
    	   }
       }public static void main(String args[]){
    	   SleepEx t1 = new SleepEx();
    	   SleepEx t2 = new SleepEx();
    	   t1.start();
    	   t2.start();
       }
}
