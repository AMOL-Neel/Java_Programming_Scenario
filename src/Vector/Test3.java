package Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test3 
{
	public static void main(String[] args) 
	{
		Vector<Product> p = new Vector<Product>();

		p.add(new Product(111, "pen", 50));
		p.add(new Product(112, "pencil", 100));
		p.add(new Product(113, "Rubber", 150));
		p.add(new Product(114, "compass", 200));

		Enumeration<Product> pp = p.elements();
		while(pp.hasMoreElements())
		{
			Product p1=	pp.nextElement();
			System.out.println(p1.pid+"  "+p1.pname+"  "+p1.pprice);
		}

		Iterator<Product> itr = p.iterator();
		while(itr.hasNext())
		{
			Product p1=itr.next();
			System.out.println(p1.pid+"  "+p1.pname+"  "+p1.pprice);

		}

		ListIterator<Product> itr2 = p.listIterator();
		while(itr2.hasNext())
		{
			Product p1=itr2.next();
			System.out.println(p1.pid+"  "+p1.pname+"  "+p1.pprice);


		}

	}

}
