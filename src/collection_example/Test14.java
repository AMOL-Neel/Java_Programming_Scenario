package collection_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Test14
{
	public static void main(String[] args) 
	{
		String[] str = {"amol","gitesh","sagar","suyog","sameer"};
		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(str));
		
		ListIterator litr = al.listIterator();
		litr.add("yash");
		while(litr.hasNext())
		{
			String st =(String)litr.next();
			if(st.equals("sameer"))
				litr.remove();
			if(st.equals("amol"))
				litr.set("hemant");
			
		}

		System.out.println(al);
		
	}

	
}
