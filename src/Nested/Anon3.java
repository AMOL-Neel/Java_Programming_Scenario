package Nested;

public abstract class Anon3 
{
	abstract void disp();
}

class Testclie
{
	public static void main(String[] args) 
	{
		new Anon3()
		{
			void disp()
			{
				System.out.println("amol");
				System.out.println("babasaheb");
				System.out.println("neel");
			}
		}.disp();
		
	}
}
