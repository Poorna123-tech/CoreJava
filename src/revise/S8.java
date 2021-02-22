package revise;
//program to find the length of the ArrayList
import java.util.*;
public class S8{
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		System.out.println("size before adding elements" + al.size());
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println("After adding elements" + " -"+al.size());
		al.remove(1);
		System.out.println("After removing elements" + "- "+al.size());
		for(Integer i : al){
			System.out.println(i);
		}
	}
}