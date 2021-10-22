package wrapperclasses;

public class Test2 
{
	// conversion of wrapper object to String
	public static void main(String[] args) 
	{
		Integer i = Integer.valueOf("200");
		
		String str = i.toString();
		System.out.println(str);
		
		Integer i1 = Integer.valueOf("200");
		String str1= i1.toString();
		
		System.out.println(str+str1);
		
	}

}
