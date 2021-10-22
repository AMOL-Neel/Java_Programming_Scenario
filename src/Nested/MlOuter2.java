package Nested;

public class MlOuter2 
{
	void m1()
	{
		for(int i = 0;i<10; i++)
		{
			class Inner2
			{
				void disp()
				{
					System.out.println("good morning");
				}
			}
			new Inner2().disp();
		}
	}
	public static void main(String[] args)
	{
		new MlOuter2().m1();
		
	}

}
