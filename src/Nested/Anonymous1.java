package Nested;

public class Anonymous1 
{
	void disp()
	{	
	}
}

class TestClient1
{
	Anonymous1 a = new Anonymous1()
	{
		void disp()
		{
			System.out.println("good morning");
			System.out.println(a.getClass().getName());
		}
	};
	public static void main(String[] args) 
	{
		TestClient1 t = new TestClient1();
		t.a.disp();
		
	}
}
