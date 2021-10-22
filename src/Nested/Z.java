package Nested;

public class Z 
{
	Thread t = new Thread()
			{
		public void run(){System.out.println("thread class run method");
		}
			};
			public static void main(String[] args) 
			{
				Z z = new Z();
				z.t.run();
				
			}

}
