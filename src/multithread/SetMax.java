package multithread;

public class SetMax extends Thread {
    public void run(){
    	System.out.println("Thread Priority is :" + Thread.currentThread().getPriority());
    }
    public static void main(String args[]){
    	SetMax t1 = new SetMax();
    
    	t1.setPriority(Thread.MAX_PRIORITY);
    
    	
    	
    	t1.start();
    	
    }

	
}
