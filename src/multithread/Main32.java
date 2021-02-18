package multithread;

public class Main32 extends Thread {
    public void run(){
    	
    }
    public static void main(String args[]){
    	Main32 t1 = new Main32 ();
    	Main32 t2 = new Main32 ();
    	Main32 t3 = new Main32();
    	
    	
    	System.out.println("t1 :" + t1.getName());
    	System.out.println("t3 :" + t3.getId());
    	
    	
    	
    	t1.start();
    	t2.start();
    	t2.setName("Sree");
    	System.out.println("t2 :" + t2.getName());
    }
}
