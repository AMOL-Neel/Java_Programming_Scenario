package TreeMSort;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class Test2 
{
	public static void main(String[] args)
	{

		TreeMap<Product, Integer> tm = new TreeMap<Product,Integer>(new MyComp());
		tm.put(new Product(11, "pencil", 45.5f), 1);
		tm.put(new Product(12, "pen", 455.5f), 2);
		tm.put(new Product(13, "chair", 456.5f), 3);
		tm.put(new Product(14, "Mobile", 453.5f), 4);
		tm.put(new Product(15, "laptop", 458.5f), 5);

		Set<Product> p  =tm.keySet();
		for(Product pp : p)
		{
			System.out.println(pp.pid+"			"+pp.pname+"		"+pp.pcost);
		}

	}

}

class MyComp implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.pid.compareTo(o2.pid);
	}



}
