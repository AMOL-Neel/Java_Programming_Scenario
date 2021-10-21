package javaTrickyScenario;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharFromStr {
	public static void main(String[] args) {

		findDuplicate("KAKASAHEB");
		findDuplicate("");
		findDuplicate(null);
		findDuplicate(" ");
		findDuplicate("pune,solapur,kolhaur,");
		findDuplicate(" Amol Amol Amol Amol ");

	}

	public static void findDuplicate(String str) {
		if (str == null) {
			System.out.println("NULL String");
			return;
		}

		if (str.length() == 1) {
			System.out.println("Single Character String");
			return;
		}

		if (str.isEmpty()) {
			System.out.println("Empty String");
			return;
		}

		char words[] = str.toCharArray();

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character ch : words) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}

		}
		// print map

		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		for (Map.Entry<Character, Integer> set : entrySet) {
			if (set.getValue() > 1) {
				System.out.println(set.getKey() + " : " + set.getValue());
			}

		}
	}

}
