package assignment;

class Company {
	 private String name;
	 
	 Company(String name){
		 this.name = name;
	 }
	 
	 public String getCompanyName(){
		
		 return this.name;
	 }
}

//package assignment;

class Employee {

		private String name;
		public int rating;
		public long startYear;
		
		Employee(String name, int rating, long Year)
		{
			this.name = name;
		
			 this.rating = rating;
			 this.startYear = Year;
			 
		 }
		 public String getEmployeeName()
		 {
			 
			 return this.name +    + this.rating +  + this.startYear;
		 }
	

}

class association {
	
	public static void main(String args[])
	{
		Company comp = new Company("Techouts");
		Employee emp = new Employee("Poorna",9, 2021);
					
		System.out.println(emp.getEmployeeName() + ","+comp.getCompanyName());
		
	}

}
