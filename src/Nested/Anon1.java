package Nested;

public abstract class Anon1 
{
	abstract void disp();
}


class TestClientt
{
	Anon1 a= new Anon1()
	{
		void disp()
		{
			System.out.println("good morning");
			System.out.println("good night");
			System.out.println("good evening");

		}
	};
	public static void main(String[] args) 
	{
		TestClientt t = new TestClientt();
		t.a.disp();
		
	}
}
