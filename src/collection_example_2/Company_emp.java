package collection_example_2;

import java.io.Serializable;

public class Company_emp implements Serializable {
	int empid;
	String empname;
	transient Double empsalary;

	Company_emp(int id, String name, Double salary) {
		this.empid = id;
		this.empname = name;
		this.empsalary = salary;
	}

}
