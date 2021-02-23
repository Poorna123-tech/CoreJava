package lambdaEx;
//Lambda Expressions with multiple parameters
@FunctionalInterface
interface Multi{
	String sree(String a, String b);
}
interface Multi1{
	Integer sree1(int a , int b);
}
public interface Mul {
	public static void main(String[] args) {
		Multi i = (a,b)->a+b;
		Multi1 j = (a,b)-> a*b;
		System.out.println(i.sree("poorna", "sree") + " "+ j.sree1(54, 54));
	}
}
   
		
