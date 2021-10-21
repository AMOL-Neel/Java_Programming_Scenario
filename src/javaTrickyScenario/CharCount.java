package javaTrickyScenario;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void getCharCount(String str) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char strArray[] = str.toCharArray();

		for (char ch : strArray) {

			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		System.out.println(str + " " + charMap);
	}

	public static void main(String[] args) {
		getCharCount("aurangabad");
		getCharCount("My name is Amol Babasaheb Neel");
		getCharCount("t ");
		getCharCount("   ");
		getCharCount("sel sel sel");
		getCharCount(" sel sel sel ");
	}
}
