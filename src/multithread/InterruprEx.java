package multithread;

public class InterruprEx extends Thread {
	    
	    public void run()  
	    {    
	        try  
	        {    
	            
	              
	            Thread.sleep(100000);    
	            System.out.println("javatpoint");    
	        }catch(InterruptedException e){    
	            System.out.println("Exception handled "+e);    
	        }    
	        System.out.println("thread is running...");    
	    }    
	    public static void main(String args[])  
	    {    
	        InterruprEx t1=new InterruprEx();    
	         InterruprEx t2 = new InterruprEx();  
	           
	        t1.start();   
	        t1.interrupt();    
	        t2.isInterrupted();
	    }    
	}   

