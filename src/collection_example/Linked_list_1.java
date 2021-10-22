package collection_example;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_list_1 {
	public static void main(String[] args) {
		LinkedList<Book> ll = new LinkedList<Book>();
		ll.add(new Book(111, "c", "danish_riche"));
		ll.add(new Book(222, "cpp", "will_smith"));
		ll.add(new Book(333, "java", "ratan_sir"));
		ll.add(new Book(444, "java 1st edi.", "ravi_sir"));

		ListIterator llist = ll.listIterator();

		while (llist.hasNext()) {
			Book b = (Book) llist.next();

			if (b.name.equals("c"))

				llist.remove();

		}

		for (Book bb : ll) {
			System.out.println(bb.id + " " + bb.name + " " + bb.auther);
		}

	}

}
