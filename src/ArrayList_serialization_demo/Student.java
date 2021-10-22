package ArrayList_serialization_demo;

import java.io.Serializable;

public class Student implements Serializable {
	String sname;
	int srollno;
	float sfees;

	Student(String name, int roll, float fee) {
		this.sname = name;
		this.sfees = fee;
		this.srollno = roll;
	}

}
