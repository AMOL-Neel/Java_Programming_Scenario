package javaTrickyScenario;

import org.apache.commons.lang3.StringUtils;

/*count occurrences of a character in string
 *CharArray -- for loops
 *str.length() --charA(i)
 *Apache Common StringUtils
 *Streams
 *
 */

public class CharacterOccurrence {
	static String str = "aurangabad khulatabad";

	public static void getCharOccurrences(String str, char val) {
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (ch == 'a') {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void getCharCount(String str, char val) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == val) {
				count++;
			}
		}
		System.out.println(val + " : " + count);
	}

	public static void getCharcountUsingStreams(String str, String val) {
		long count = str.chars().mapToObj(e -> String.valueOf((char) e)).filter(e -> e.equals(val)).count();
		System.out.println("by using streams:" + count);
	}

	public static void main(String[] args) {
		// by using toCharArray() for loop
		getCharOccurrences(str, 'a');
		// charAt()
		getCharCount(str, 'a');
		getCharCount(str, ' ');

		// streams
		getCharcountUsingStreams(str, "a");

		// StringUtils Class

		int Count = StringUtils.countMatches(str, "a");
		System.out.println("By using String Utils::" + Count);

	}
}
