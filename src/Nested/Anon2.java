package Nested;

public abstract class Anon2 
{
	abstract void disp();
}

class TestCl
{
	public static void main(String[] args) 
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
		a.disp();
		
	}
}
