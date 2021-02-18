package revise;
import java.util.*;


public class UR {
     private String FirstName;
     private String LastName;
     private long MobileNumber;
     private char gender;
     private String Mailid;
     public int dateOfBirth;
     public String username;
     private String password;
     public int user_id =1;
     public static int count = 1;
     public static String input;
    
     public void users (String Ruser, String Rpassword){
    	 this.user_id = count++;
    	 this.username = Ruser;
    	 this.password = Rpassword;
    	 System.out.printf("User has been created", Ruser);
    	 System.out.println("Enter 'login' or 'register' to open another account");
     }
     public static void login(String Luser, String Lpassword) {
		for(int i =1; i<=count; i++){
			System.out.println("Enter 'login' or 'register' to open another account");
		}
     }
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("login");
			System.out.println("register");
			
			input = sc.nextLine();
					
					while(input.equals("login")){
						System.out.println("username");
						sc.nextLine();
						System.out.println("password");
						sc.nextLine();
						int a =count;
						login(input, input);
						System.out.println("");
						input = sc.nextLine();
						}
					}
			
			
		}

  