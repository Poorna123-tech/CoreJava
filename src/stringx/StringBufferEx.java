package stringx; 


public class StringBufferEx {
	public static void main(String[] args) {
		
	
    StringBuffer sb = new StringBuffer("Poorna");
    
    System.out.println(sb.append("Sree"));

    System.out.println(sb.insert(1,"Sree"));

    System.out.println(sb.capacity());

    System.out.println(sb.reverse());

    System.out.println(sb.delete(1,3));

    System.out.println(sb.replace(1,4,"Sree"));
    
 
    System.out.println(sb.charAt(4));
    
    System.out.println(sb.length());
    
    System.out.println(sb.substring(1));

    System.out.println(sb.substring(1, 3));
	}
}
