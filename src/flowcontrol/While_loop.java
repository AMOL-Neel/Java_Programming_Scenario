package flowcontrol;

public class While_loop 
{
	public static void main(String[] args) 
	{
		int i = 0;
		while(i<10)
		{
			System.out.println("amol");
			i++;
		}
		System.out.println("rest of the application");
		
	}
	

}

class W 
{
	public static void main(String[] args) 
	{
		int i = 0;
		while(true)
		{
			System.out.println("amol");
			i++;
		}
		//System.out.println("babasaheb neel"); unreachable code
		
	}
}

class W1
{
	public static void main(String[] args) 
	{
		int i =0;
		/*while(false)
		{
			System.out.println("amol");
			i++;
		}*/ // unreachable code
		
	}
}

class W2
{
	public static void main(String[] args) 
	{
		int i = 0;
		while(i<0)
		{
			System.out.println("amol");
			i++;
		}
		System.out.println("rest of the application");
		
	}
}