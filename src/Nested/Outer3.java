package Nested;

public class Outer3 
{
	private int a= 10, b=20;

	class Inner3
	{
		final static int a=100, b=200;
		void m1(int a, int b)
		{
			System.out.println(Outer3.this.a+Outer3.this.b);
			System.out.println(this.a+this.b);
			System.out.println(a+b);


		}
	}
	public static void main(String[] args)
	{
		new Outer3().new Inner3().m1(1000, 2000);

	}

}
