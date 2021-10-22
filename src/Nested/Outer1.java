package Nested;

public class Outer1 
{
	private int a= 10, b= 20;
	void m1(){
		System.out.println("outer class m1 method");
	}
	class Inner1
	{
		int x= 100, y = 200;
		void m2(int i, int j)
		{
			System.out.println(a+b);
			System.out.println(x+y);
			System.out.println(i+j);
		}
	}
	public static void main(String[] args) 
	{
		Outer1 o =new Outer1();
		o.m1();
		Outer1.Inner1 i  = o.new Inner1();
		i.m2(1000, 2000);
		
		new Outer1().new Inner1().m2(10000, 20000);
		
		
	}

}
