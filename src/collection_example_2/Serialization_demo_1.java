package collection_example_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization_demo_1 {

	void Serialization_Demo() throws IOException {
		Company_emp ce = new Company_emp(111, "amol", 42346.00);
		FileOutputStream fos = new FileOutputStream("abc.txt1");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ce);
		oos.close();
		System.out.println("serialization process completed...");
	}

	void De_serialization_demo() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("abc.txt1");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Company_emp ce = (Company_emp) ois.readObject();
		System.out.println(ce.empid + " " + ce.empname + " " + ce.empsalary);
		ois.close();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Serialization_demo_1 sd = new Serialization_demo_1();

		sd.Serialization_Demo();
		sd.De_serialization_demo();

	}

}
