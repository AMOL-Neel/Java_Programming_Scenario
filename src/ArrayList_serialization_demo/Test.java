package ArrayList_serialization_demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(111, "amol", 42346.00f));
		al.add(new Emp(222, "ketan", 45246.00f));
		al.add(new Emp(333, "kunal", 40000.00f));
		al.add(new Emp(444, "satish", 50000.00f));

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Emp e = (Emp) itr.next();
			System.out.println(e.eid + " " + e.ename + " " + e.esalary);
		}

		// serializatin process
		FileOutputStream fos = new FileOutputStream("mno.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
		System.out.println("serializatin process is completed........");

		// de_serialization process
		FileInputStream fis = new FileInputStream("mno.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Emp> newal = (ArrayList<Emp>) ois.readObject();

		for (Emp e1 : newal) {
			System.out.println(e1.eid + " " + e1.ename + " " + e1.esalary);
		}
		
		ois.close();
		System.out.println("de_serializatin is completed............");

	}

}
