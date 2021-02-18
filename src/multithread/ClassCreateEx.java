package multithread;

public class ClassCreateEx implements Runnable {
    public void run(){
    System.out.println("sree");	
    }
    public static void main(String args[]){
    	ClassCreateEx p = new ClassCreateEx();
    	Thread t1 = new Thread(p);
    	t1.start();
    }
    
}
