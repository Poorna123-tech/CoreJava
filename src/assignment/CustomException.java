package assignment;
 class InvalidAgeException extends Exception{
	 InvalidAgeException(String s){
		 super();
	 }
 }
 class CustomException{
	 static void validate(int age) throws InvalidAgeException{
		 if(age > 17)
			 throw new InvalidAgeException("Invalid");
		  if(age<7)
			  throw new InvalidAgeException("Invalid");
		  else
			  System.out.println("Welcome to Badminton");
	 }
	 public static void main(String args[]){
		 try{
			 validate(7);
			 validate(19);
		 }
		 catch(Exception B){
			 System.out.println("Exception occurred:" + B);
			  
		 }
	 }
	 
 }