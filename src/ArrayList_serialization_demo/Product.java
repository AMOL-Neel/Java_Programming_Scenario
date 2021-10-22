package ArrayList_serialization_demo;

import java.io.Serializable;

public class Product implements Serializable {
	int pid;
	String pname;
	float pcost;

	Product(int pid, String pname, float pcost) {
		this.pid = pid;
		this.pcost = pcost;
		this.pname = pname;
	}

}
