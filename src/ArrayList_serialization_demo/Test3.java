package ArrayList_serialization_demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Test3 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("amol", 52, 3000.00f));
		al.add(new Student("ketan", 53, 5099.00f));
		al.add(new Student("sam", 54, 5600.00f));
		al.add(new Student("gitesh", 55, 65000.00f));

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.sname + " " + st.srollno + " " + st.sfees);
		}

		// serialization process
		FileOutputStream fos = new FileOutputStream("student.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
		System.out.println("serialization process is completed......");

		// de_serialization process
		FileInputStream fis = new FileInputStream("student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Student> newal = (ArrayList<Student>) ois.readObject();

		for (Student st : newal) {
			System.out.println(st.sname + " " + st.srollno + " " + st.sfees);
		}
		ois.close();
		System.out.println("deserialization process is completed......");
	}

}
