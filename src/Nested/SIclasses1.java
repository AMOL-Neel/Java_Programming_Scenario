package Nested;

public class SIclasses1 
{
	static int a = 10;
	static int b = 20;
	static class Inner5
	{
		void m1()
		{
			System.out.println(a+b);
		}
		{
			System.out.println("instance block");
		}
		static 
		{
			System.out.println("static block");
		}
		public static void main(String[] args) 
		{
			new Inner5().m1();
			
		}
	}
	public static void main(String[] args)
	{
		new SIclasses1.Inner5();
		
	}

}
