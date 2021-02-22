package stringx;

public class SbandsB {
    public static String withStringBuffer(){
    	StringBuffer sb = new StringBuffer("poorna");
    	for(int i =0; i < 10000; i++){
    		sb.append("sree");
    		
    	}return sb.toString();
    }
    public static String withStringBuilder(){
    	StringBuilder sb = new StringBuilder("poorna");
    	for(int i =0; i < 10000; i++){
    		sb.append("sree");
    		
    	}return sb.toString();
    }
    public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		withStringBuffer();
		System.out.println(System.currentTimeMillis()-startTime);
		withStringBuilder();
		System.out.println(System.currentTimeMillis()-startTime);
	}
    
}
