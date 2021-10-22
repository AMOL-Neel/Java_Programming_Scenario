package collection_example_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization_demo_3 {
	void Serialization_demo() throws IOException {
		Company_emp ce = new Company_emp(111, "kunal", 35000.0);
		Company_emp ce1 = new Company_emp(222, "ketan", 46000.0);
		FileOutputStream fos = new FileOutputStream("xyz.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ce1);
		oos.writeObject(ce);
		oos.close();
		System.out.println("serialization is completed");
	}

	void De_serialization_demo() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("xyz.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Company_emp ce = (Company_emp) ois.readObject();
		System.out.println(ce.empid + " " + ce.empname + " " + ce.empsalary);
		Company_emp ce1 = (Company_emp) ois.readObject();
		System.out.println(ce1.empid + " " + ce1.empname + " " + ce1.empsalary);
		ois.close();
	

	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Serialization_demo_3 sd = new Serialization_demo_3();
		sd.Serialization_demo();
		sd.De_serialization_demo();

	}

}
