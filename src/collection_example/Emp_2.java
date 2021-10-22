package collection_example;

public class Emp_2 implements Comparable {
	int eid;
	String ename;
	int esalary;
	int esrlno;

	Emp_2(int eid, String ename, int esalary, int esrlno) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.esrlno = esrlno;
	}

	@Override
	public int compareTo(Object o) {
		Emp_2 e = (Emp_2) o;
		if (esalary == e.esalary)
			return 0;
		else if (esalary > e.esalary)
			return 1;
		else
			return -1;

	}

}
