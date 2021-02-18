package multithread;


	class A extends Thread{
		public void run(){
			int i = 0;
			System.out.println("Thread  Started");
			while(i<4){
				System.out.println("i :" + i);
				i++;
				
			}System.out.println("Thread  completed");
		}
	}class B extends Thread{
		int i =1;
		public void run(){
			System.out.println("Thread  starts");
			while(i<3){
				System.out.println("i :" + i);
				i++;
			}System.out.println("Thread  completed");
		}
		
	}
	class C extends Thread{
		public void run(){
			int i = 2;
			System.out.println("Thread  starts");
			while(i<5){
				System.out.println("i :" + i);
				i++;
			}System.out.println("Thread  completed");
		}
	}


	public class ScheduleEx1 extends Thread
	{
		
			public static void main(String args[]){
				A t1 = new A();
				B t2 = new B();
				C t3 = new C();
				
				t1.setPriority(Thread.MAX_PRIORITY);
				t2.setPriority(Thread.MIN_PRIORITY);
				t3.setPriority(Thread.NORM_PRIORITY);
				
				
				t1.start();
				t2.start();
				t3.start();
				
				
				try{
					t1.join();
					t2.join();
					t3.join();
					
				}catch(Exception e){
					e.printStackTrace();
				}
				
				
				
			}
	   }


