package revise;

import java.util.ArrayList;

//Convert ArrayList To String Array
public class S2 {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("1");
	al.add("2");
	al.add("3");
	
	String Numbers[] = al.toArray(new String[al.size()]);
	for(String j : Numbers){
		System.out.println(j);
	}
}
}
