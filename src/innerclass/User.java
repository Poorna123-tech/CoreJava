package innerclass;
//Anonymous Inner Class
/*abstract class Mobile{
	 abstract void call();
	 abstract void sms();
}

public class User{
	public static void main(String[] args) {
		Mobile m = new Mobile(){
			void call(){
				
				System.out.println("Calling purpose");
			}void sms(){
				System.out.println("Sms puprpose");
			}
		};
		m.call();
		m.sms();
		
	}
}*/

//Anonymous Inner class Using Interface
interface Eatable{
	void eat();
}
public class User{
	public static void main(String[] args) {
		Eatable e =  new Eatable(){
			public void eat(){
				System.out.println("eating....");
			};
		};
		e.eat();
		
	}
}