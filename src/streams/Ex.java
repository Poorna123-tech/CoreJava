package streams;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex{
	public static void main(String[] args) throws NullPointerException{
		
		IntStream onefourfive = IntStream.of(1,4,5);
		IntStream positiveSingleDigits = IntStream.rangeClosed(1,7);
		
		IntStream powersOfTwo = IntStream.iterate(1, a->a/2);
		IntStream chars = "ABD".chars();
		IntStream randomInts = new Random().ints();
		try{
		System.out.println(concat(onefourfive +" "+ positiveSingleDigits + " " + powersOfTwo + " "+ chars+ " "+ randomInts));
		}catch(NullPointerException e){
			System.out.println(e);
		}
	}

	private static char[] concat(String string) {
		return null;
	}
}