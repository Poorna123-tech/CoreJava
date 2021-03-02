package assignment;
import java.util.*;
public class Tree {
     public static void main(String args[]){
        TreeSet<String> p = new TreeSet<String>();
        p.add("poorna");
        p.add("sree");
        Iterator<String> i = p.descendingIterator();
        while(i.hasNext()){
        	System.out.print(i.next());
            
        }
        
     }
}
