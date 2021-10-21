package javaTrickyScenario;

import java.util.function.IntPredicate;

import com.google.common.base.CharMatcher;

/*total number of vowels within a java string using :
 * java,
 * java 8 and 
 * google guava lib
 */

public class VowelsCount {

	// java :

	public static boolean isVowel(char t) {
		return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' || t == 'A' || t == 'E' || t == 'I' || t == 'O'
				|| t == 'U';
	}
	

	public static void main(String[] args) {

		String str = "this is amol babasaheb neel Neel";
		int vCount = 0;
		for (int x = 0; x < str.length(); x++) {
			if (isVowel(str.charAt(x))) {
				vCount++;
			}
		}
		System.out.println(vCount);
		
		// java 8 streams:
		System.out.println("using java 8 streams : ");
		IntPredicate vowel = new IntPredicate(){
			@Override
			public boolean test(int t) {
				return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' || t == 'A' || t == 'E' || t == 'I' || t == 'O'
						|| t == 'U';
			}
		};
		String test = "Naveen AutomationLabs";
		long count = test.chars().filter(vowel).count();
		System.out.println(count);
		
		// using google guava : 
		String st = "Naveen AutomationsLabs";
		int voCount = CharMatcher.anyOf("aeiouAEIOU").countIn(st);
		System.out.println(voCount);

	}

}
