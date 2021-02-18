package multithread;

public class MinEx {
	public void run(){
    	System.out.println("Thread Priority is :" + Thread.currentThread().getPriority());
    }
    public static void main(String args[]){
    	SetMax t1 = new SetMax();
    
    	t1.setPriority(Thread.MIN_PRIORITY);
    
    	
    	
    	t1.start();
    	
    }

	
}
