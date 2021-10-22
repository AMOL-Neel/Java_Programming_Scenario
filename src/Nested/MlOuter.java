package Nested;

public class MlOuter 
{
	void m1()
	{
		class Inner
		{
			void disp()
			{
				System.out.println("method local inner classes");
			}
		}
		Inner i = new Inner();
		i.disp();
	}
	public static void main(String[] args) 
	{
		new MlOuter().m1();
		
	}

}
