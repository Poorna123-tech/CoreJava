package assignment;

public class TestEx1 implements Runnable{
        public void run(){
        	System.out.println("Task ");
        }
        public static void main(String args[]){
        	Thread t1 = new Thread(new TestEx1() );
        	Thread t2 = new Thread(new TestEx1());
        	t1.start();
        	t2.start();
        }
}
