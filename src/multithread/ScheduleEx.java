package multithread;

class K extends Thread{
	public void run(){
		int i = 0;
		System.out.println("Thread k Started");
		while(i<4){
			System.out.println("i :" + i);
			i++;
			
		}System.out.println("Thread K completed");
	}
}class L extends Thread{
	int i =1;
	public void run(){
		System.out.println("Thread l starts");
		while(i<3){
			System.out.println("i :" + i);
			i++;
		}System.out.println("Thread L completed");
	}
	
}
class M extends Thread{
	public void run(){
		int i = 2;
		System.out.println("Thread M starts");
		while(i<5){
			System.out.println("i :" + i);
			i++;
		}System.out.println("Thread M completed");
	}
}
public class ScheduleEx{
	public static void main(String args[]){
		K t1 = new K();
		L t2 = new L();
		M t3 = new M();
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}