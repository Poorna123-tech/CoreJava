package assignment;

   abstract class Bird {
	 
	   abstract void makeSound();
	   public void eat(){
		   System.out.println("I can eat.");
		  
	   }

}
   class Eagle extends Bird{
	   
	      void makeSound(){
	   
		   System.out.println(".....");
		   System.out.println("GEDYFW");
	      }
   }
   
   class Abstract{
	   public static void main(String args[]){
		   Eagle b = new Eagle();
		   b.eat();
		   b.makeSound();
	   }
	   
	   
   }
