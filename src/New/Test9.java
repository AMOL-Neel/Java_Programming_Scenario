package New;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test9 
{
	public static void main(String[] args)
	{
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("amol");
		str.add("ketan");
		str.add("kedar");
		System.out.println(str.toString());
		
	    ListIterator<String> stt = str.listIterator();
	    
	    while(stt.hasNext())
	    {
	      String strr= stt.next();
	      if(strr.equals("amol"))
	    	  stt.remove();
	      if(strr.equals("kedar"))
	    	  stt.set("kedarMujumdar");
	      if(strr.equals("ketan"))
	    	  stt.set("suyogNeel");
	    }
	    System.out.println();
	    
	    System.out.println(str);
	    System.out.println();
	    
	    for(String Srt:str)
	    {
	    	System.out.println(Srt);
	    }
		
		
	}

}
