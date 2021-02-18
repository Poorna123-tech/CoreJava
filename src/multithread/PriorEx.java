package multithread;

public class PriorEx extends Thread {
    public void run(){
    	System.out.println("Running Thread is:" +  Thread.currentThread().getName());
    }
    public static void main(String args[]){
    	PriorEx t1 = new PriorEx();
    	PriorEx t2 = new PriorEx();
    	
    	System.out.println("t1 Thread Priority is :" + t1.getPriority());
    	System.out.println("t2 Thread Priority is :" + t2.getPriority());
    	
    	t1.start();
    	t2.start();
    }
}
