package Task;
import java.util.*;

public class Users {
	public String password;
	public String name;
	public String lastname;  
	public void users(){
		HashMap<String, Users> mapList = new HashMap<String,Users>();
		Users d1 = new Users();
		d1.password = "Your password";
		d1.name     = "Your name";
		d1.lastname = "Your lastname";
		mapList.put("login", d1);
		
	}
}
