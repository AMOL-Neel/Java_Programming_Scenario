package javaTrickyScenario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*How to find length of string in java without using length method?
 */

public class StringLength {

	public static int getLength(String str) {
		int i = 0;
		try {
			while (true) {
				str.charAt(i);
				i++;
			}
		} catch (IndexOutOfBoundsException e) {
			return i;
		}
	}

	public static int getStringLength(String str) {
		String st[] = str.split("");

		int count = 0;
		for (String s : st) {
			count += s.toCharArray().length;
		}
		return count;

	}

	public static void main(String[] args) {
		String str = "testing";

		// 1.
		System.out.println(str.toCharArray().length);

		// 2.
		System.out.println(str.lastIndexOf(""));

		// 3.
		Matcher m = Pattern.compile("$").matcher(str);
		m.find();
		int length = m.end();
		System.out.println(length);

		// 4.
		System.out.println(str.split("").length);

		// 5.
		int l = new StringBuilder(str).length();
		System.out.println(l);

		// 6.
		int count = 0;
		for (char c : str.toCharArray()) {
			count++;
		}
		System.out.println(count);

		// 7.
		System.out.println(getLength("Automation testing"));

		// 8.
		int l1 = 0;
		String st = "123testing";
		try {
			l1 = st.getBytes("UTF-16BE").length / 2;
		} catch (Exception e) {

		}
		System.out.println(l1);

		// 9.
		System.out.println(getStringLength("Selenium with testNg and Cucumber"));

	}

}
