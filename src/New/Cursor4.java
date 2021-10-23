package New;

import java.util.ArrayList;
import java.util.Iterator;

public class Cursor4 
{
	public static void main(String[] args) 
	{
		/*ArrayList<String> str = new ArrayList<String>();
		
		str.add("amol");
		str.add("ketan");
		str.add("kedar");
		str.add("rahul");
		str.add("sandeep");
	    System.out.println(str.toString());
	    
	    ListIterator<String> st= str.listIterator();
	    while(st.hasNext())
	    {
	    	String s =st.next();
	    	if(s.equals("sandeep"))
	    		st.remove();
	    }
	    System.out.println(str.toString());
	    */
	    ArrayList<Book> st2 = new ArrayList<Book>(); 
	    st2.add(new Book(111,"india","amol"));
	    st2.add(new Book(222,"Cricket","ketan"));
	    st2.add(new Book(333,"java","neel"));
	    
	    Iterator <Book> stt =  st2.iterator();
	    while(stt.hasNext())
	    {
	    	Book b = stt.next();
	    	if(b.id==111)
	    	stt.remove();
	    	
	    	if(b.name.equals("Cricket"))
	    		stt.remove();
	       
	    }
	    
	    for(Book bb:st2)
	    {
	    	System.out.println(bb.Aname+"  "+bb.id+"  "+bb.name);
	    }
	    
	 
	    
	   
		
	}

}
