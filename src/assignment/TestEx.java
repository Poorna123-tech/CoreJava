package assignment;

public class TestEx extends Thread {
    public void run(){
    	System.out.println("Task");
    }
    	public static void main(String a[]){
    		TestEx t1 = new TestEx();
    		TestEx t2 = new TestEx();
    		TestEx t3 = new TestEx();
    		t1.start();
    		t2.start();
    		t3.start();
    	
    	}
    }

