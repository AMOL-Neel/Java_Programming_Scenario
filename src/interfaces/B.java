package interfaces;

public class B 
{
	interface It41
	{
		void m1();
		void m2();
		void m3();
	}
}
class C implements B.It41
{
	public void m1()
	{
		System.out.println("good morning");
	}
	public void m2()
	{
		System.out.println("good evening");
	}
	public void m3()
	{
		System.out.println("good night");
	}
	public static void main(String[] args) 
	{
		C c  = new C();
		c.m1();c.m2();c.m3();
		
	}
	
}
