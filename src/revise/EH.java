package revise;

public class EH extends Exception{
	
			private String message;
			
			public void Test(String message){
				this.message = message;
			}
			
			public static void main(String[] args){
				
				int a = 5, b = 3;
				try{
					
					if( a % b > 0 )
						throw new EH();
					
				}catch(Exception e){
					System.out.println("Test Exception");
				}
			}
			
		}
	
   
