package collection_example_2;

import java.util.Comparator;
import java.util.TreeSet;

public class Tree_Set_exe_2 {
	public static void main(String[] args) {
		TreeSet<Product> p = new TreeSet<Product>(new Mycompt());
		p.add(new Product("pen", 100, 111));
		p.add(new Product("light", 125, 222));
		p.add(new Product("chair", 1000, 333));
		p.add(new Product("table", 2255, 444));

		for (Product p1 : p) {
			System.out.println(p1.pid + " " + p1.pname + " " + p1.pcost);
		}

	}

}

class Mycompt implements Comparator<Product>
{
	public int compare(Product p1 ,Product p2)
	{
		return -p1.pname.compareTo(p2.pname);
	}
}