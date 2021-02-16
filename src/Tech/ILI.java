package Tech;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ILI {

	public static void main(String[] args) {
		ArrayList<Integer> s = new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		Iterator<Integer> i = s.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		System.out.println("Forwawrd ");
		ListIterator<Integer> p = s.listIterator();
		while(p.hasNext()){
			
			System.out.println(p.next());
		}
		
		
		
		ListIterator<Integer> k = s.listIterator();
		System.out.println("Backward");
		
		while(k.hasPrevious()){
			
			System.out.println(k.previous());
		}System.out.println("....");
	}

}
