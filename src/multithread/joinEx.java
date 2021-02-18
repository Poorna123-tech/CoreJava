package multithread;

public class joinEx extends Thread {
     public void run(){
    	 for(int i = 0; i<3; i++){
    		 try{
    			 Thread.sleep(1000);
    		 }catch(Exception e){
    			 System.out.println(e);
    		 }System.out.println(i);
    		
    		 }
    	 } public static void main(String args[]){
			 joinEx t1 = new joinEx();
			 joinEx t2 = new joinEx();
			 
			 t1.start();
			 try{
				 t1.join();
				 
			 }catch(Exception e){
				 System.out.println(e);
			 }
			 t2.start();
     }
}
