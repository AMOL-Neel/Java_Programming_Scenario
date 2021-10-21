package javaTrickyScenario;

import java.util.StringJoiner;

/*What is StringJoiner? -- in JDK  8
 * */

public class StringJoinerConcept {
	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner(",","[","]");
		
		joiner.add("Amol").add("Babasaheb").add("Neel");
		
		System.out.println(joiner.toString());
		
		
		
		String str = "my name is amol";
		StringJoiner join = new StringJoiner(",","(",")");
		join.add(str).add("suyog");
		System.out.println(join.toString());
	}

}
