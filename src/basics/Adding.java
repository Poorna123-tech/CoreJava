package basics;

import java.util.Scanner;

public class Adding {
	public static void main(String[] args) {
		/*
		 * System.out.println("Enter 'a' value : " );
		 * System.out.println("Enter 'b' value : "); int a =3; int b=623; int c;
		 * c = a+b; System.out.println("Sum of two numbers is :" +c);
		 * 
		 */Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'a' value :");
		System.out.println("Enter 'b' value :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		c = a + b;
		System.out.println(" value of c is :" + c);
		sc.close();
	}
}
