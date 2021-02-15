package assignment;

public class TryCatchEx2 {

		public static void main(String[] args) {
		 int i =10, j=0, k;
		 try {
			 k = i/j;
		 }catch (Exception e){
			 k = i/(j+2);
			 System.out.println("k = " + k);
		 }
		 
	}

}
