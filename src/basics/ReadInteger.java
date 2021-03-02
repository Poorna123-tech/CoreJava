package basics;

import java.util.Scanner;

public class ReadInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int a = sc.nextInt();
		System.out.println("Enter any input which is related to given type");
		String s = sc.next();
		System.out.println("The given number is : " + a);
		System.out.println("The given input is : " + s);
		sc.close();
	}
}
