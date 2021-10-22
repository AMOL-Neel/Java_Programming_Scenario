package flowcontrol;

public class Switch_case 
{
	public static void main(String[] args) 
	{
		int a =20;
		switch(a)
		{
		case 10: System.out.println("amol");
		break;
		
		case 20: System.out.println("ketan");
		break;
		
		case 30: System.out.println("sandeep");
		break;
		
		default: System.out.println("invalid number");
		break;
		}	
	}
}

class Case
{ 
	public static void main(String[] args) 
	{
		int a =10;
		switch(a)
		{
		case 10: System.out.println("amol");
		
		case 20: System.out.println("ketan");
		
		case 30: System.out.println("sandeep");
		break;
		
		default: System.out.println("invalid number");
		break;
		}
		 
		
	}
}

class Case1
{
	public static void main(String[] args) 
	{
		int a =10;
		switch(a)
		{
		case 10: System.out.println("amol");
		
		case 20: System.out.println("ketan");
		
		case 30: System.out.println("sandeep");
		
		default: System.out.println("invalid number");
		}	
	}	
}

class Case2
{
	public static void main(String[] args) 
	{
		int a = 10;
		switch(a)
		{
		default: System.out.println("invalid number");
		break;
		}
		
	}
}

class Case3
{
	public static void main(String[] args) 
	{
		final int a = 10, b= 20;
		switch(a)
		{
		case a: System.out.println("this is a");
		break;
		case b: System.out.println("this is b");
		break;
		default : System.out.println("case is not matched");
		break;
		}
	}
}

class Case4
{
	public static void main(String[] args) 
	{
		int a= 97;
		switch(a)
		{
		case 90: System.out.println("this is 90");
		break;
		case 'a': System.out.println("this is 97");
		break;
		default : System.out.println("value is not matched");
		break;
		}
	}
}

class Case5
{
	public static void main(String[] args) 
	{
		String month= "oct";
		switch (month)
		{
		case "jan": 
		case "feb":
		case "mar":
		case "apr": System.out.println("summer");
		break;
		
		case "may":
		case "jun":
		case "jul":
		case "aug": System.out.println("rainy");
			break;

		case "sept":
		case "oct":	
		case "nov":
		case "dec":System.out.println("winter");
		}
	}
}

class Case6
{
	public static void main(String[] args) 
	{
		byte b = -128;
		switch(b)
		{
		case 127: System.out.println("byte range value");
		case -128: System.out.println("byte range value");
		default : System.out.println("invlid range value");
		}
		
	}
}

class Case7
{
	public static void main(String[] args) 
	{
		int a = 10;
		switch(a)
		{
		case 50+50: System.out.println("it is expression for addition");
		case 10*1: System.out.println("it is expression for multiplication");
	//	case 50*2: System.out.println("it is expression");
		}
		
	}
}