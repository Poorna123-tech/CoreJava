package revise;
import java.util.*;
//ArrayList to String array using toArray() 

public class S3 {
    public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("sree");
		list.add("poorna");
		list.add("honey");
		
		String array[] = new String[list.size()];
		for(int i = 0 ; i<list.size(); i++){
			array[i] = list.get(i);
		}
		for(String j : array){
			System.out.println(j);
		}
		
	}
}
