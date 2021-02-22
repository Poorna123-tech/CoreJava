package serialization;

import java.io.*;

class EX implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2353121972198930650L;
	public int a;
	public String b;
	public char c;
	public double f;

	public EX(int a, String b, char c, double d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.f = d;
	}

}

public class Ex {
	private static EX object1;
	private static EX object;

	public static void main(String[] args) throws Exception {
		setObject(new EX(1, "Poorna", 'A', 6.77));
		String filename = "file.ser";

		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream y = new ObjectOutputStream(file);

			y.defaultWriteObject();
			y.close();
			file.close();

			System.out.println("Object Serialized");
		} catch (Exception e) {
			System.out.println("IO Exception Caught");
		}

		EX object1 = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			object1 = (EX) in.readObject();
			file.close();
			in.close();

			System.out.println("Object1 is deserialized");
			System.out.println("a:" + object1.a);
			System.out.println("b:" + object1.b);
			System.out.println("c:" + object1.c);
			System.out.println("d:" + object1.f);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException f) {
			f.printStackTrace();
		}

	}

	public static EX getObject() {
		return object;
	}

	public static void setObject(EX object) {
		Ex.object = object;
	}

	public static EX getObject1() {
		return object1;
	}

	public static void setObject1(EX object1) {
		Ex.object1 = object1;
	}
}
