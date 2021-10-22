package collection_example_2;

import java.util.Comparator;

public class Proidcompt implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Product p1 = (Product) o1;
		Product p2 = (Product) o2;

		if (p1.pid == p2.pid)
			return 0;
		else if (p1.pid > p2.pid)
			return 1;
		else

			return -1;
	}

}
