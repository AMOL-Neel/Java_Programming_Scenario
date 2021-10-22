package wrapperclasses;

public class Test 
{
	public static void main(String[] args) 
	{
		Integer i = new Integer(10);
		Integer i1 = new Integer("10");
		
		Integer i2 = Integer.valueOf(100);
		Integer i3 = Integer.valueOf("200");
		
		System.out.println(i+i1);
		System.out.println(i2+i3);
		
	}

}
