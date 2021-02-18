package revise;

public class MThread  implements Runnable{
	public void run(){
		
	}
    public static void main(String[] args) {
		Thread t1 = new Thread(new MThread());
		Thread t2 = new Thread(new MThread());
		
		   t1.start();
		   t2.start();
		
		 
		System.out.println("Mthread:" + t1.getName());
		System.out.println("Mthread:" + t2.getName());
	}
}
