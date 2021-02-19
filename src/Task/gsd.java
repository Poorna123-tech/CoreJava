package Task;

import java.util.Scanner;
class Details{
	private String username;
	private String password;
	private String name;
	private String email;
	private long mobilenumber;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
	
}


 class Login1{
	public void login(){
		String username, password;
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter username :");
	     username = sc.nextLine();
	     System.out.println("Enter password :");
	       password = sc.nextLine();
	       if(username.equals(username) && password.equals(password)){
	    	   System.out.println("Authentication Successful");
	       }else{
	    	   System.out.println("Invalid username or password");
	       }sc.close();
	}
}
 class Registration1{
	 
		
		 
	
 }
public class gsd{
	public static void main(String[] args) {
	    
	       
	}
}

