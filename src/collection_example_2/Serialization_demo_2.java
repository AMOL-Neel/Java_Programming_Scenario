package collection_example_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization_demo_2 {
	void serialization() throws IOException {
		Company_emp ce = new Company_emp(100, "amol", 43346.00);
		FileOutputStream fos = new FileOutputStream("pqr.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ce);
		oos.close();
		System.out.println("serializaton is completed");
	}

	void De_serialization() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("pqr.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Company_emp ce = (Company_emp) ois.readObject();
		System.out.println(ce.empid + " " + ce.empname + " " + ce.empsalary);
		ois.close();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Serialization_demo_2 sd = new Serialization_demo_2();
		sd.serialization();
		sd.De_serialization();

	}

}
