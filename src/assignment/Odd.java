package assignment;
import java.util.*;
public class Odd {
	

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String");
			String str = sc.nextLine();
			char[] ch = str.toCharArray();
			for (int i = 0; i < str.length(); i++) {
				if (i % 2 == 0)
					ch[i] = '\0';
				System.out.print(ch[i]);
			}
			sc.close();
		}

	}

