package Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class Test2 
{
	public static void main(String[] args) 
	{
		TreeSet<Product> ts = new TreeSet<Product>(new MyComp55());
		ts.add(new Product(111, "pencil", 10.8f));
		ts.add(new Product(222, "pen",45.5f));
		ts.add(new Product(444, "Rubber", 56.45f));
		ts.add(new Product(888, "Chair", 566.00f));

		for(Product p:ts)
		{
			System.out.println(p.pid+" "+p.pname+" "+p.pcost);
		}

	}
}


class MyComp55 implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2)
	{
		
		return o1.pname.compareTo(o2.pname);
	
	}
	
}

