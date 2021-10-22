package collection_example_2;

import java.util.Comparator;

public class EmpComptname implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.name.compareTo(o2.name);
	}

}
