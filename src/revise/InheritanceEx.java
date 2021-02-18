package revise;

class Add{
	public int add(int i , int j){
		return i + j;
	}
}
class Sub extends Add{
	public int sub(int i , int j){
		return i - j;
	}
}
class Mul extends Sub{
	public int mul(int i, int j){
		return i * j;
	}
}
class Div extends Mul{
	public int div(int i, int j){
		return i/j;
	}
}
public class InheritanceEx extends Div {
     public static void main(String args[]){
    	 InheritanceEx ha = new InheritanceEx();
    	 ha.div(5,1);
    	 ha.add(4,2);
    	 ha.sub(1, 1);
    	 ha.mul(5, 5);
    	 System.out.println(ha);
     }
}
