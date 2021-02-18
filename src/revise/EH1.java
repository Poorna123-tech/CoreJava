package revise;

public class EH1 {
    
	String classname;
	
	
	public static void main(String[] args) {
	  
		try{
			 EH1 t1 = new EH1();
			if(t1.classname.equals("EH1")){
				
			
				System.out.println("EH1");
			}
		else {
			System.out.println("other");
		}
	}
		catch(Exception e){
		System.out.println(e);
	System.out.println("Exception occurred");
		}
		
		
		
		
		
		
		
		
	}
}
