package flowcontrol;

public class For_loop 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i<10; i++)
		{
			System.out.println("i love java"+i);
		}

	}

}

class F
{
	public static void main(String[] args) 
	{
		int i = 0;
		for(System.out.print("amol"),System.out.print(" babasaheb"),System.out.println(" neel");i<10;i++)
		{
			System.out.println("i love java="+i);
		}
	}
}

class F1
{
	public static void main(String[] args) 
	{
		for(int i =0,j=0;i<5;i++)
		{
			System.out.println("amol = "+i);

		}
	}
}

class F2
{
	public static void main(String[] args) 
	{
		for(int i= 0; i<10;System.out.println("amol"))
		{
			System.out.println("babasaheb neel");
			i++;
		}
	}
}

class F3
{
	public static void main(String[] args) 
	{
		int[] i = {10,20,30,40};
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println();

		for(int a =0;a<i.length;a++)
		{
			System.out.println(i[a]);
		}
		System.out.println();


		for(int a:i)
		{
			System.out.println(a);
		}
	}
}

class F4
{
	public static void main(String[] args) 
	{
		for(int i =333;i<444;i=i+2)
		{
			System.out.println(i);
		}
		
	}
}

class F5
{
	public static void main(String[] args) 
	{
		for(int i = 0;true;i++)
		{
			System.out.println("amol ");
		}
		//System.out.println("babasaheb neel"); Unreachable code
		
	}
}

class F6
{
	public static void main(String[] args) 
	{
		for(int i = 0;i<10;i++)
		{
			System.out.println("amol ");
		}
		System.out.println("babasaheb neel");	
	}
}

class F7
{
	static int m1()
	{
		return 0;
	}
	
    static boolean m2()
	{
		return true;
	}
	public static void main(String[] args) 
	{
		for(int i =F7.m1();F7.m2();i++)
		{
			System.out.println("amol");
		}
		
	}
}