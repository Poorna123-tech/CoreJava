package revise;
import java.util.*;


public class UR {
     private String FirstName;
     public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public long getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getMailid() {
		return Mailid;
	}
	public void setMailid(String mailid) {
		Mailid = mailid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		UR.count = count;
	}
	public static String getInput() {
		return input;
	}
	public static void setInput(String input) {
		UR.input = input;
	}
	private String LastName;
     private long MobileNumber;
    
     private String Mailid;
    
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
						System.out.println(a);
						input = sc.nextLine();
						}
					sc.close();
					}
			
			
		}

  