package ArrayList_serialization_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization_demo {
	void serializationDemo() throws IOException {
		Emp e = new Emp(111, "amol", 42346.00f);
		Product p = new Product(222, "mango", 1700.00f);
		Student s = new Student("sujit", 52, 500.00f);
		FileOutputStream fos = new FileOutputStream("jkl.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.writeObject(p);
		oos.writeObject(s);
		oos.close();
		System.out.println("serialization process complete...");

	}

	void de_serialization_demo() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("jkl.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Emp e1 = (Emp) ois.readObject();
		System.out.println(e1.eid + " " + e1.ename + " " + e1.esalary);
		Product p1 = (Product) ois.readObject();
		System.out.println(p1.pid + " " + p1.pname + " " + p1.pcost);
		Student s1 = (Student) ois.readObject();
		System.out.println(s1.srollno + " " + s1.sname + " " + s1.sfees);
		ois.close();
		System.out.println("deserialization process is complete...");

	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Serialization_demo sd = new Serialization_demo();
		sd.serializationDemo();
		sd.de_serialization_demo();

	}

}
