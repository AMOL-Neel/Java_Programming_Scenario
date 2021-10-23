package Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class Test3 
{
	public static void main(String[] args) 
	{
		TreeSet<Book> ts = new TreeSet<Book>(new MyComp09());
		ts.add(new Book(11, "Java", 45.55f));
		ts.add(new Book(22, "Selenium", 45.56f));
		ts.add(new Book(33, "Python", 45.57f));
		ts.add(new Book(44, "Cucumber", 45.58f));
		ts.add(new Book(55, "API", 45.59f));

		for(Book b:ts)
		{
			System.out.println(b.id+" "+b.name+" "+b.value);

		}

	}

}

class MyComp09 implements Comparator<Book>
{

	@Override
	public int compare(Book o1, Book o2) {

		return -o1.name.compareTo(o2.name);
	}

}

// i want to learn that thing if possible 

/*class MyComp00 implements Comparator<Book>
{

	@Override
	public int compare(Book o1, Book o2)
	{
		
		return ;
	}
	
}
*/