package collection_example_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization_Demo {
	void Serialization_Demo() throws IOException {
		Emp e = new Emp(111, "amol");
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.close();
		System.out.println("serialization process is completed....");

	}

	void De_serialization_demo() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Emp e = (Emp) ois.readObject();
		System.out.println(e.id + " " + e.name);
		ois.close();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Serialization_Demo sd = new Serialization_Demo();
		sd.Serialization_Demo();
		sd.De_serialization_demo();

	}

}
