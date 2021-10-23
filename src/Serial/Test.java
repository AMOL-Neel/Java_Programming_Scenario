package Serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test 
{
	void SerilizationDemo() throws IOException
	{
		Emp e = new Emp(11, "amol","don",456567);
		FileOutputStream fos =new FileOutputStream("abc.text");
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.close();
		System.out.println("serilization process is complete..................");
	}
	
	void DeserilizationDemo() throws IOException, ClassNotFoundException 
	{
		FileInputStream fis = new FileInputStream("abc.text");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Emp ee =(Emp)ois.readObject();
		System.out.println(ee.id+" "+ee.name+" "+ee.pass+" "+ee.pnumber);
		ois.close();
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		Test t  = new Test();
		t.SerilizationDemo();
		t.DeserilizationDemo();
		
	}

}
