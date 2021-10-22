package Nested;

public interface It1 
{
	void disp();
}

class TestClient7
{
	public static void main(String[] args) 
	{
		It1 i  = new It1()
		{
			public void disp()
			{
				System.out.println("good morning");
			}
		};
		i.disp();

	}
}
