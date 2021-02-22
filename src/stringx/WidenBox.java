package stringx;

public class WidenBox {
     /*static void m(long l){
    	 System.out.println("int");
     }
     static void m(Long i){
    	 System.out.println("Integer");
     }
     public static void main(String[] args) {
		long l = 10000;
		m(l);
		
	}
	//Widening beats varags
	/*static void m(int i, long j){System.out.println("int...");}
	static void m(Integer i, Long j){System.out.println("Integer...");}
	public static void main(String[] args) {
		short s =10;
		long l = 100;
		m(s,l);
		m(s,l);
	}
	//Boxing beats varags
	/*static void m(byte i){System.out.println("byte..");}
	static void m(float f){System.out.println("float");}
	public static void main(String[] args) {
		float f = 10.0f;
		
		byte b = 12;
		m(b);
		m(f);
	}*/
	
	static void m(Long b){System.out.println("byte...");}
	public static void main(String[] args) {
		int b = 19;
		m((long) b);
	}
}
