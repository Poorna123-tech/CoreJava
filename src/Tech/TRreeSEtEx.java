package Tech;

import java.util.*;

public class TRreeSEtEx {
    public static void main(String args[]){
    	TreeSet<String> map = new TreeSet<String>();
    	    map.add("chinna");
    	    map.add("sree");
    	    map.add("CHINNA");
    	    map.add("LOVE");
    	    Iterator<String> i = map.iterator();
    	    while(i.hasNext()){
    	    	System.out.println(i.next());
    	    }
    }
}
