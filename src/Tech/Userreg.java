package Tech;

import java.util.*;
import java.util.regex.Pattern;

class Users {
	private String userName;
	private String password;
	private String email;
	private String firsName;
	private String lastName;
	private Long mobileNumber;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}

public class Userreg {
	HashMap<String, Users> userDetails;

	public static void main(String[] args) {
		Userreg reg = new Userreg();
		reg.userDetails = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Login or Register to continue");
		String input = sc.next();
		while (input.equalsIgnoreCase("Login") || input.equalsIgnoreCase("Register")) {
			System.out.println("Enter username");
			String userName = sc.next();
			Users existingUser = reg.userDetails.get(userName);
			if (Objects.isNull(existingUser)) {
				System.out.println("User name not found");
				System.out.println("Do you want to create an account, Yes or No?");
				String confirm = sc.next();
				if (confirm.equalsIgnoreCase("Yes")) {
					// registration method & and add details to
					Users user = new Users();
					System.out.println("Enter first name");
					user.setFirsName(sc.next());
					System.out.println("Enter last name");
					user.setLastName(sc.next());

					System.out.println("Enter email");
					String c = sc.next();

					String email = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
							+ "A-Z]{2,7}$";

					if (Pattern.matches(email, input))
						user.setEmail(c);

					sc.nextLine();

					System.out.println("Enter mobile number");
					long d = sc.nextLong();
					user.setMobileNumber(d);
					if (Pattern.matches(("[789][0-9]{9}"), input))

						sc.nextLine();
					System.out.println("Enter username");
					String userNameInput = sc.next();
					existingUser = reg.userDetails.get(userNameInput);
					while (!Objects.isNull(existingUser)) {
						System.out.println("User name already exists, please enter another username");
						userNameInput = sc.next();
						user.setUserName(userNameInput);
						existingUser = reg.userDetails.get(userNameInput);
					}
					user.setUserName(userNameInput);

					System.out.println("Enter password");
					user.setPassword(sc.next());

					reg.userDetails.put(userNameInput, user);
					System.out.println("Account created successfully");
				} else
					System.out.println("Acount not created");
			} else {
				System.out.println("Enter Password");
				String password = sc.next();
				if (password.equals(existingUser.getPassword()))
					System.out.println("User authenticated");
				else
					System.out.println("Incorrect password");
			}
			System.out.println();
			System.out.println("Enter Login or Register to continue");
			input = sc.next();
		}
		sc.close();
		System.out.println("Program exited");
	}
}
