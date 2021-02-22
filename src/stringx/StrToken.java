package stringx;

import java.util.StringTokenizer;

public class StrToken {
   public static void main(String[] args) {
	StringTokenizer st = new StringTokenizer("poornasree");
	while(st.hasMoreElements()){
		System.out.println(st.hasMoreElements());
	}
	while(st.hasMoreTokens()){
		System.out.println(st.hasMoreTokens());
	}
	while(st.nextElement() != null){
		System.out.println(st.nextElement());
	}
	while(st.nextToken() != null){
		System.out.println(st.nextToken());
		
	}String delim = null;
	while(st.nextToken(delim) != null){
		System.out.println(st.nextToken(delim));
	}
	
}
}
