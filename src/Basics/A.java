package Basics;

public class A 
{
		static 
		{
			System.out.println("a class static block");
		}
		
		public static void main(String[] args) throws ClassNotFoundException 
		{ 
		 try {
			Class.forName("B");
			 Class.forName("C");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}


	class B
	{
		static 
		{
			System.out.println("b class static block");
		}
	}

	class C
	{
		static 
		{
			System.out.println("c class static block");
		}
	}

