package collection_example_2;

import java.util.Comparator;

public class Pronamecompt implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o1.pname.compareTo(o2.pname);
	}

}
