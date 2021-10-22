package Nested;

public class SIclasses 
{
	static int a =100;
	static int b = 200;
	
	static class Inner4
	{
		void m1()
		{
			System.out.println(a);
			System.out.println(b);
		}
	}
	static class Inner5
	{
		void m2()
		{
			System.out.println(a); 
			System.out.println(b);
		}
	}
	public static void main(String[] args) 
	{
		new SIclasses.Inner4().m1();
		 new SIclasses.Inner5().m2();
		
	}
}
