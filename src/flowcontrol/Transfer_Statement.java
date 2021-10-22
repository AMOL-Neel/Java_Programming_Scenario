package flowcontrol;

public class Transfer_Statement 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(10/2);
		}
		
	}

}


class TS
{
	int m1()
	{
		return 19;
	}
	public static void main(String[] args) 
	{
		TS  t = new TS();
		int i =t.m1();
		System.out.println(i);
		
	}
}

class TS1
{
	public static void main(String[] args) 
	{
		for(int i = 0;i<10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println("amol babasaheb neel");
		}
		
	}
}

class TS2
{
	public static void main(String[] args) 
	{
		for(int i =1; i<10;i++)
		{
			if(i==7)
			{
				continue;
			}
			System.out.println("amol babasheb neel"+i);
		}
	}
}

class Ts3
{
	public static void main(String[] args) 
	{
		int i = 10;
		if(i==4)
		{
			System.out.println("amol");
			System.out.println("suyog");
			System.out.println("sameer");
			//break;  break cannot be used outside of a loop or a switch
			System.out.println("vindo");
			System.out.println("ganesh");
			
		}
		
	}
}