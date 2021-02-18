package multithread;

public class SetNormEx extends Thread{
    public void run(){
    	System.out.println("Thread Priority is " + Thread.currentThread().getPriority());
    }
    public static void main(String args[]){
    	SetNormEx t1 = new SetNormEx();
    	
    	t1.setPriority(Thread.NORM_PRIORITY);
    	t1.start();
    }
}
