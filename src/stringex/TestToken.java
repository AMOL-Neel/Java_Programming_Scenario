package stringex;

import java.util.StringTokenizer;

public class TestToken
{
	public static void main(String[] args) 
	{
		StringTokenizer st = new StringTokenizer("the string is completed");
		
		while(st.hasMoreElements())
		{
			String str = (String)st.nextElement();
			System.out.println(str);
		}
		
		StringTokenizer st2 = new StringTokenizer("the. string. is. int.restin.g .cha.p.t.e.r", ".");
		
		while(st2.hasMoreTokens())
		{
			String str2 =st2.nextToken();
			System.out.println(str2);
		}
		
	}

}
