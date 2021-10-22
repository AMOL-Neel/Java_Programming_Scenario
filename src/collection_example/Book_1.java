package collection_example;

public class Book_1 implements Comparable<Book_1> {
	int id;
	String name;
	String author;

	Book_1(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}

	@Override
	public int compareTo(Book_1 o) {
		return name.compareTo(o.name);
	}

}
