package Nested;

public class AnonymousIC
{
	// application without anonymous
	void disp()
	{
		
	}
}

class Test2 extends AnonymousIC
{
	void disp()
	{
		System.out.println("good morning");
	}
}
class TestClient
{
	public static void main(String[] args) 
	{
		Test2 t = new Test2();
		t.disp();
	}
}