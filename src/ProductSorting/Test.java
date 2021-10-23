package ProductSorting;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test
{
	public static void main(String[] args) 
	{
		LinkedList<Product> ll = new LinkedList<Product>();


		ll.add(new Product(111, "Pen", 200));
		ll.add(new Product(333, "Pencil", 3000));
		ll.add(new Product(555, "Chair", 599));
		ll.add(new Product(444, "Tv", 4999));
		ll.add(new Product(222, "MObile", 15000));


		// id comparator
		Collections.sort(ll, new IdComparat());


		for(Product p:ll)
		{
			System.out.println(p.pid+" "+p.pname+" "+p.pcost);
		}

		System.out.println();


		// name comparator
		Collections.sort(ll,new NameComparat());

		for(Product p1:ll)
		{
			System.out.println(p1.pid+" "+p1.pname+" "+p1.pcost);

		}





	}

}
