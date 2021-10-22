package ArrayList_serialization_demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Test1 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	
	{
		ArrayList<Product> al = new ArrayList<Product>();
		al.add(new Product(111, "chair", 3000.00f));
		al.add(new Product(222, "lights", 45000.00f));
		al.add(new Product(333, "pen_box", 5000.00f));
		al.add(new Product(444, "mobile", 19000.00f));

		Iterator itr =al.iterator();
		while(itr.hasNext()){
			Product p =(Product)itr.next();
			System.out.println(p.pid+" "+p.pname+" "+p.pcost);

		}
		
		// serialization process
		FileOutputStream fos = new FileOutputStream("product.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
		System.out.println("serialization process is completed......");
		
		// de-serialization process
		FileInputStream fis = new FileInputStream("product.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Product> newal =(ArrayList<Product>)ois.readObject();
		
		for(Product p1:newal)
		{
			System.out.println(p1.pid+" "+p1.pname+" "+p1.pcost);
		}
		ois.close();
		System.out.println("de_serialization process is completed.....");
		
		



	}

}
