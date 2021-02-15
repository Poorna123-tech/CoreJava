package assignment;
import java.util.*;
public class HighLow {
   public static void main(String args[]){
	   TreeSet <Integer> h = new TreeSet<Integer>();
	   h.add(10);
	   h.add(20);
	   h.add(65);
	   System.out.println("Highest value:" + h.pollLast());
	   System.out.println("Lowest value:" + h.pollFirst());
   }
}
