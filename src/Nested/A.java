package Nested;

public class A
{
	void disp()
	{
		System.out.println("good morning");
	}
}
class TestClient4
{
	A a = new A()
	{
		void disp()
		{
			System.out.println("good evening");
			System.out.println(a.getClass().getName());
		}

	};
	public static void main(String[] args) 
	{
		TestClient4 t = new TestClient4();
		t.a.disp();
		
	}
}
