package assignment;
 public class Generics {
	 public static  < P > void printArray(P[] inputArray){
		 for(P element : inputArray){
			 System.out.printf("%s", element);
		 }
		 System.out.println();
	 }
	 public static void main(String a[]){
		 Integer[] intArray = {1,2,3,4,5};
		 Double[] doubleArray = {1.2,3.4,6.7};
		 Character[] chArray = {'s','r','e','e'};
		 String[] strArray = {"I", "Love","Mom"};
		 System.out.println("Array IntegerArray Contains");
		 printArray(intArray);
		 System.out.println("Array DoubleArray Contains");
		 printArray(doubleArray);
		 System.out.println("Array CharacterArray Contains");
		 printArray(chArray);
		 System.out.println("Array StringArray Contains");
		 printArray(strArray);
			
		 
		 
	 }
 }
