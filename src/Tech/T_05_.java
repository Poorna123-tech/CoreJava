package Tech;

class T_05_{
	
	
	public int sumOfMultiples(int a, int b, int c){
		if(a%10 != 0){
			a = (a/10 + 1) * 10;
		}
		if(b%10 != 0){
			b = (b/10 + 1) * 10;
		}
		if(c%10 != 0){
			c = (c/10 + 1) * 10;
		}
		int sum = a + b + c;
		return sum;
	}
	public static void main(String args[]){
		T_05_ p = new T_05_();
	int sum =	p.sumOfMultiples(12, 10, 9);
		 System.out.println(sum);
		
	}
}