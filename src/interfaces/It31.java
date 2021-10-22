package interfaces;

public interface It31 
{
	interface It32
	{
		void m1();
		void m2();
	}
}
class A31 implements It31.It32
{
	public void m1()
	{
		System.out.println("m1 method of nested interface ");
	}
	public void m2()
	{
		System.out.println("m2 method of nested interface");
	}
	public static void main(String[] args) 
	{
		A31 a = new A31();
		a.m1();a.m2();
		
	}
}
