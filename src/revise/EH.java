package revise;

public class EH extends Exception{
	
			/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
			private String message;
			
			public void Test(String message){
				this.setMessage(message);
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

			public String getMessage() {
				return message;
			}

			public void setMessage(String message) {
				this.message = message;
			}
			
		}
	
   
