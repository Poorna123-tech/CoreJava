package lambdaEx;

@FunctionalInterface
 interface A {
   public void m1();
}
@FunctionalInterface
interface B extends A{
	public void m1();
	//public void m2(); it is invalid bcoz it contains two abstract methods.
}
/*interface B extends A{
	public void m7();
	public void m2();//valid bcoz it is not a functional Interface, but it can contain multiple abstract methods.
}

*/