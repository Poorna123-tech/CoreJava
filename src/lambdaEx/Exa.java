package lambdaEx;

import java.util.LinkedList;

import java.util.stream.Stream;

public class Exa {

	public static void main(String[] args) {

		// Creating a stream of fixed number of integers
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(p -> System.out.println(p));
		// Creating a stream of Array
		Stream<Integer> stream1 = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		stream1.forEach(a -> System.out.println(a));
		// List.Stream()
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);

		}
		/*Stream<Integer> stream2 = list.stream();
		stream2.forEach(p1 -> System.out.println(p1));
		*/
		
    
		
	}
}