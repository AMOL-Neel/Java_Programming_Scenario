package collection_example_2;

import java.util.Collections;
import java.util.LinkedList;

public class Test1 
{
	public static void main(String[] args) 
	{
		LinkedList<Product> ll = new LinkedList<Product>();
		ll.add(new Product("pen", 399, 100));
		ll.add(new Product("pencil", 499, 299));
		ll.add(new Product("chair", 2300, 343));
		ll.add(new Product("light", 4432, 994));
		ll.add(new Product("toy", 3432, 553));
		
		// sorting on the basis of id
		Collections.sort(ll,new Proidcompt());
		
		for(Product p:ll)
		{
			System.out.println(p.pid+" "+p.pname+" "+p.pcost);
		}
		
		System.out.println();
		
		// sorting on the basis on name
		
		Collections.sort(ll,new Pronamecompt());
		
		for(Product p : ll)
		{
			System.out.println(p.pid+" "+p.pname+" "+p.pcost);
		}
		
		
	}

}
