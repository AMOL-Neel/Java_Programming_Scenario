package pattern;

public class Star1 
{
	// square star pattern
	public static void main(String[] args) 
	{
		for(int i = 0; i<=7; i++)
		{
			for(int j = 0; j<=7; j++)
			{
				System.out.print("*");

			}
			System.out.println();
		}
	}
}

class Star2
{
	// cross star pattern
	public static void main(String[] args) 
	{
		for(int i = 0; i<7; i++)
		{
			for(int j = 0; j<7; j++)
			{
				if(i==j || i+j==7-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

class Star3
{
	public static void main(String[] args) 
	{
		for(int i =0; i<7; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");

			}
			System.out.println();
		}
		
	}
}