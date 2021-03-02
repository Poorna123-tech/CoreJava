package innerclass;

//Local Inner Class Example

public class Sampl{
	private int i = 10;
	private long l = 123454;
	private byte b = 1;
	private String s = "poorna";
	private char c = 'A';
	private short s1 = 23;
	private float f = 10.9f;
	private double d = 2354.8;
	
	void execute(){
		class Own{
			void msg(){
				System.out.println(i +" "+ l+ " " + b+ " " + s+ " " + c + " " + s1+ " " + f + " " + d );
			}
		}
		Own o = new Own();
		o.msg();
		
	}
	public static void main(String[] args) {
		Sampl sm = new Sampl();
		sm.execute();
	}
}