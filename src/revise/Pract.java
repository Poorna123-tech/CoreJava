package revise;
 class Animal{
	 public void bark(){
		 System.out.println("Bow-Bow");
	 }
 }
 class Dog extends Animal{
	 public void bark(int num){
		 System.out.println("I can make sound");
		 
	 }
 }
 public class Pract{
	 public static void main(String[] args) {
		 
		 Dog a = new Dog();
		 
		 a.bark();
		 		System.out.println(a);
	}
 }