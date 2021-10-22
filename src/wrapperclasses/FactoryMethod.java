package wrapperclasses;

public class FactoryMethod 
{
	public static void main(String[] args) 
	{
		 Boolean b = new Boolean(true);
		 Boolean b1 = new Boolean("true");
		 Boolean b2 = new Boolean("True");
		 Boolean b3 = new Boolean("amol");
		 Boolean b4 = new Boolean("FALSE");
		 Boolean b5 =new Boolean(null);
		 
		 System.out.println(b);
		 System.out.println(b1);
		 System.out.println(b2);
		 System.out.println(b3);
 		 System.out.println(b4);
		 System.out.println(b5);
		 
		 
		
	}

}
