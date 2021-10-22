package stringex;

public class Test3 
{

	public static void main(String[] args) 
	{
		String s1 = "amol";
		String str= s1.concat(" Neel");
		System.out.println(str);
		System.out.println();
		
		StringBuffer sb = new StringBuffer("amol");
		StringBuffer sb1 =sb.append(" neel");
		System.out.println(sb1);
		System.out.println();
		
		System.out.println(sb);
		sb.append("automation world");
		sb.append('a');
		System.out.println(sb);
		
		
		String s2 = "aurangaba";
		s2=s2.concat("ahmadnagar");
		System.out.println(s2);
		
		
		
	}
}
