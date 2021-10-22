package ArrayList_serialization_demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test4 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(111, "ketan", 45645.00f));
		al.add(new Emp(333, "kakasaheb", 56545.00f));
		
		ArrayList<Product> al1 = new ArrayList<Product>();
		al1.add(new Product(444, "lights", 45000.00f));
		al1.add(new Product(555, "chair", 65000.00f));
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(new Student("suyog", 45, 5000.00f));
		al2.add(new Student("gitesh", 46, 45000.00f));
		
		//serialization process
		FileOutputStream fos = new FileOutputStream("all.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(al);
		oos.writeObject(al1);
		oos.writeObject(al2);
		oos.close();
		System.out.println("serialization process is completed.....");
		
		// deserialization process
		FileInputStream fis = new FileInputStream("all.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Emp> emp1 = (ArrayList<Emp>)ois.readObject();
		ArrayList<Product> prod1 = (ArrayList<Product>)ois.readObject();
		ArrayList<Student> stud1 = (ArrayList<Student>)ois.readObject();
		
		for(Emp e:emp1)
		{
			System.out.println(e.eid+" "+e.ename+" "+e.esalary);
		}
		System.out.println();
		
		for(Product p:prod1)
		{
			System.out.println(p.pid+" "+p.pname+" "+p.pcost);
		}
		System.out.println();
		
		for(Student s : stud1)
		{
			System.out.println(s.sname+" "+s.srollno+" "+s.sfees);
		}
		System.out.println();
		
		ois.close();
		System.out.println("deserialization process is completed........");


	}

}
