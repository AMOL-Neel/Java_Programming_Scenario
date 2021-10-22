package stringex;

public class Test4 
{
	Test4(String str)
	{
		
	}
	public static void main(String[] args)
	{
		Test4 t = new Test4("amol");
		
		Test4 t1 = new Test4("amol");
		
		System.out.println(t==t1);
		System.out.println(t.equals(t1));
		
		String str = "amol";
		String str1 = "amol";
		System.out.println(str.equals(str1));
		System.out.println();
		
		String str2 = new String("amol");
		String str3 = new String("amol");
		System.out.println(str2.equals(str3));
		
		StringBuffer sb = new StringBuffer("amol");
		StringBuffer sb1 = new StringBuffer("amol");
		
		System.out.println(sb==sb1);
		System.out.println(sb.equals(sb1));

	}

}
