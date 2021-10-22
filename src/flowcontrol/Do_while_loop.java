package flowcontrol;

public class Do_while_loop 
{
	public static void main(String[] args) 
	{
		int i = 10;
		do
		{
			System.out.println("amol");
			i++;
		}
		while(i<20);
		{
			System.out.println("rest of the application");
		}	
	}
}

class D 
{
	public static void main(String[] args) 
	{
		int i = 10;
		do
		{
			System.out.println("amol");
			i++;
		}
		while(true);
		/*{
			System.out.println("rest of the application");
		}*/ // unreachable code 
	}
}

class D1
{
	public static void main(String[] args) 
	{
		int i= 10;
		do
		{
			System.out.println("amol");
			if(i==10)
			{
				break;
			}
			i++;
		}
		while(true);
		{
			System.out.println("rest of the application");
		}
		
	}
}

class D2
{
	public static void main(String[] args) 
	{
		int i = 10;
		do
		{
			System.out.println("amol");
			i++;
		}
		while(false);
		{
			System.out.println("rest of the application");
		}
		
	}
}