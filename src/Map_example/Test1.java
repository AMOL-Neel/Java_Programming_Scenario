package Map_example;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, Product> lhm = new LinkedHashMap<Integer, Product>();
		lhm.put(1, new Product(111, "chair", 3500.00f));
		lhm.put(2, new Product(222, "bike", 76000.00f));
		lhm.put(3, new Product(333, "mobile", 10000.00f));
		lhm.put(4, new Product(444, "music_player", 5999.00f));
		lhm.put(5, new Product(555, "led_tv", 56999.00f));

		Set<Integer> s = lhm.keySet();
		System.out.println(s);
		System.out.println();

		Collection<Product> c = lhm.values();

		for (Product p : c) {
			System.out.println(p.pid + " " + p.pname + " " + p.pcost);

		}
		System.out.println();

		Set<Entry<Integer, Product>> e = lhm.entrySet();
		Iterator<Entry<Integer, Product>> itr = e.iterator();
		while (itr.hasNext()) {
			Entry<Integer, Product> e1 = itr.next();

			Integer in = e1.getKey();
			System.out.println(in);

			Product p1 = e1.getValue();
			if(p1.pid==111)
				itr.remove();
			if(p1.pname.equals("music_player"))
				itr.remove();
			
		}
		// print the data using for each loop
		for(Entry<Integer,Product>  e1:lhm.entrySet())
		{
			Product p1 =e1.getValue();
			System.out.println(p1.pid + " " + p1.pname + " " + p1.pcost);
		}

	}

}
