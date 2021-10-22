package Nested;

public class MlOuter1 
{
	void m1()
	{
		class Inner01
		{
			void disp()
			{
				System.out.println("good morning");
			}
		}
		class Inner02 extends Inner01
		{
			void disp1()
			{
				System.out.println("good night");
			}
		}
		class Inner03 extends Inner02
		{
			void disp2()
			{
				System.out.println("good evening");
			}
		}
		Inner03 i = new Inner03();
		i.disp();i.disp1();i.disp2();
	}
	public static void main(String[] args) 
	{
	    new MlOuter1().m1();
		
	}

}
