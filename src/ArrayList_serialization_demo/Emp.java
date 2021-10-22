package ArrayList_serialization_demo;

import java.io.Serializable;

public class Emp implements Serializable {
	int eid;
	String ename;
	transient float esalary;

	Emp(int id, String name, float salary) {
		this.eid = id;
		this.ename = name;
		this.esalary = salary;
	}

}
