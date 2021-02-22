package stringx;

/*public class Wrapp1 {
//Converting prim to wrap
	public static void main(String[] args) {
		int a = 10;
		Integer i = Integer.valueOf(a);
		String s = String.valueOf(a);
		Character c = Character.valueOf((char) a);
		Float f = Float.valueOf(a);
		Double d = Double.valueOf(a);
		System.out.println(i + " "+ s+" "+ c +" " +f + " "+ d  );
		
	}
}
*/

//Custom Wrapper Class
class Abc{
	private float f;
	
		Abc(float f)
		{
			this.f = f;
		}
		
		public float getF() {
		return f;
	}
	public void setF(float f) {
		this.f = f;
	}
	public String toString(){
		return Float.toString(f);
	}
	public static class Wrapp1{
		public static void main(String[] args) {
			Abc m = new Abc(12);
			System.out.println(m);
		}
	}
}