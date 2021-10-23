package ArrayListSerializationDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(111, "amol",12000.00f));
		al.add(new Emp(222, "ketan",15000.00f));
		al.add(new Emp(333, "sagar",20000.00f));

		FileOutputStream fos = new FileOutputStream("abc.text");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
		System.out.println("serilization process is complete......");


		FileInputStream fis = new FileInputStream("abc.text");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Emp> al1 =(ArrayList<Emp>)ois.readObject();
		for(Emp ee:al1)
		{
			System.out.println(ee.id+" "+ee.name+" "+ee.salary);

		}
		
		ois.close();






	}

}
