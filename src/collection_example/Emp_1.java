package collection_example;

public class Emp_1 implements Comparable {
	int id;
	String name;
	int salary;

	Emp_1(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Object o) {

		Emp_1 e = (Emp_1) o;
		if (id == e.id)
			return 0;
		else if (id > e.id)
			return 1;
		else
			return -1;
	}

}
