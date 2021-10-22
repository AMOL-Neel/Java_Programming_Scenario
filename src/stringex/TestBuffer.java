package stringex;

public class TestBuffer
{
	public static void main(String[] args)
	{
		// deleteCharAt(), delete()
		StringBuffer sb= new StringBuffer("aurangabad");
		System.out.println(sb.deleteCharAt(5));
		System.out.println(sb.delete(0, 10));
		System.out.println();
		
		// reverse()
		StringBuffer sb1 = new StringBuffer("ahmadnagar");
		System.out.println(sb1.reverse());
		System.out.println();
		
		//append
		StringBuffer sb2 = new StringBuffer("amol");
		System.out.println(sb2.append("neel"));
		System.out.println();
		
		// inset()
		StringBuffer sb3 = new StringBuffer("amol");
		System.out.println(sb3.insert(0, "neel "));
		System.out.println();
		
		// replace()
		StringBuffer sb4 = new StringBuffer("automation world");
		System.out.println(sb4.replace(1, 10, "java"));
		System.out.println();
		
	}

	

}
