package Nested;

public class Anonymo 
{
	void disp()
	{

	}

}

class TestCli
{
	public static void main(String[] args) 
	{
		Anonymo a = new Anonymo()
		{
			void disp()
			{
				System.out.println("good night");
			}
		};
		a.disp();

	}
}
