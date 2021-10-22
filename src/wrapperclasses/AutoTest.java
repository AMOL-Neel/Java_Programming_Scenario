package wrapperclasses;

public class AutoTest {
	public static void main(String[] args) {
		Integer i = 10;
		System.out.println(i);
		System.out.println(i.toString());

		String str = i.toString();
		System.out.println(str);

		// autounboxing
		int x = new Integer(10);
		System.out.println(x);

	}

}
