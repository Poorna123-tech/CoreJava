package assignment;
import java.util.*;
public class Types {
    public static void main(String args[]){
    	TreeSet<String> l = new TreeSet<String>();
    	l.add("1");
    	l.add("2");
    	l.add("5");
    	l.add("4");
    	l.add("3");
    	System.out.println(l);
    	System.out.println("Reverse set :" + l.descendingIterator());
    	System.out.println("HeadSet:" + l.headSet("1",true));
    	System.out.println("Lowest:" + l.pollFirst());
    	
    	System.out.println("SubSet:" + l.subSet("1",false, "5", true));
    	System.out.println("TailSet:" + l.tailSet("3", false));
    }    
}
