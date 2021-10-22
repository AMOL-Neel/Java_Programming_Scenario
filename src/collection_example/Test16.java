package collection_example;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test16 {
	public static void main(String[] args) {
		Vector<Product> v = new Vector<Product>();
		v.add(new Product(111, "pen", 1000));
		v.add(new Product(222, "fan", 2000));
		v.add(new Product(333, "chair", 3000));
		v.add(new Product(444, "light", 5000));

		// enumeration
		Enumeration<Product> en = v.elements();

		while (en.hasMoreElements()) {
			Product p = en.nextElement();
		}

		System.out.println("by using enumeration cursor");

		for (Product pp : v) {
			System.out.println(pp.id + " " + pp.name + " " + pp.cost);
		}

		// iterator
		Iterator<Product> itr = v.iterator();

		while (itr.hasNext()) {
			Product p = itr.next();
		}
		System.out.println("by using iterator cursor");

		for (Product pro : v) {
			System.out.println(pro.id + " " + pro.name + " " + pro.cost);

		}

		// listiterator
		ListIterator<Product> lstr = v.listIterator();

		while (lstr.hasNext()) {
			Product pr = lstr.next();
		}
		System.out.println("by using listiterator cursor");
		for (Product p : v) {
			System.out.println(p.id + " " + p.name + " " + p.cost);
		}

	}

}
