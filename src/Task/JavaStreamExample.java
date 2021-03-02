package Task;

import java.util.ArrayList;
import java.util.List;





class Goods {
	public static final int weight = 0;
	int id;
	float kg;
	String name;

	public Goods(int id, String name, float kg) {
		this.id = id;
		this.name = name;
		this.kg = kg;
	}
}

public class JavaStreamExample {
	public static void main(String[] args) {
		List<Goods> GoodsList = new ArrayList<Goods>();

		// Adding Products
		GoodsList.add(new  Goods(1, "HP Laptop", 100.0f));
		GoodsList.add(new  Goods(2, "Dell Laptop", 300.0f));
		GoodsList.add(new  Goods(3, "Lenevo Laptop", 280.0f));
		GoodsList.add(new  Goods(4, "Sony Laptop", 200.0f));
		GoodsList.add(new  Goods(5, "Apple Laptop", 900.0f));}
}

		// Converting product List into Set
		/*Set<Float> goodsWeightList = GoodsList.stream().filter(Goods -> Goods.weight > 200) // filter
																										// product
																										// on
																										// the
																										// base
																										// of
																										// price
				.map(goods -> goods.weight).collect(Collectors.toSet()); // collect
																			// it
																			// as
																			// Set(remove
																			// duplicate
																			// elements)
		System.out.println(goodsWeightList);
	}
}
*/