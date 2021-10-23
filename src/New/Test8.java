package New;

import java.util.ArrayList;
import java.util.Collections;

public class Test8 
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("amol");
		al.add("ketan");
		al.add("amit");
		al.add("ravi");
		al.add("sameer");
		al.add("nilesh");
		al.add("sandeep");
		al.add("suyog");
		
		/*System.out.println("before Swapping="+al.toString());
		Collections.swap(al, 2, 4);
		System.out.println("after swapping ="+al.toString());
		*/
		ArrayList<String> al1 = new ArrayList<String>(al.subList(2,7));
		System.out.println(al1);

		
	}

}
