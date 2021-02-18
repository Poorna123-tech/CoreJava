package multithread;

public class GetNameEx extends Thread{
	 public void run(){
    	 
     }
     public static void main(String args[]){
    	 GetNameEx t1 =new GetNameEx();
    	 
    	 
    	System.out.println("t1:" + t1.getName());
    	
    	t1.start();
    	//t1.start();//One thread can execute only one time
    	//t1.run();//no change
     }
}
