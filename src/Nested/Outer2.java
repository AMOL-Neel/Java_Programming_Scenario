package Nested;

public class Outer2 
{
	private int a=10,b=20;
	void m1()
	{
		System.out.println("outer class m1 method");
	}
	class Inner2
	{
		int a = 100,b=200;
		void m2(int a, int b)
		{
			m1();
			System.out.println(Outer2.this.a+Outer2.this.b);
			System.out.println(this.a+this.b);
			System.out.println(a+b);
		}
	}

	public static void main(String[] args) 
	{
		new Outer2().new Inner2().m2(1000, 2000);
		
	}
}
