package javaTrickyScenario;

import org.apache.commons.lang3.StringUtils;

/*Remove all white spaces from a string*/

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String newString = "     This          is      a my java code        "
				+"\n java course"
				+"\n core          java            tutorials        "
				+"\t spring boot course \t";

		// 1.
		System.out.println(newString.trim());

		// 2.
		System.out.println(newString.replaceAll("\\s+", ""));

		// 3.
		String remString = StringUtils.deleteWhitespace(newString);
		System.out.println(remString);
		System.out.println("-----------------");

		// 4.
		String noWhiteSpaceString = "";
		System.out.println(newString);
		for (int i = 0; i < newString.length(); i++) {
			if (newString.charAt(i) != ' ' && newString.charAt(i) != '\t') {
				noWhiteSpaceString = noWhiteSpaceString + newString.charAt(i);
			}
		}
		System.out.println("this is by using for loop ::" + noWhiteSpaceString);
		System.out.println("--------------");
		
		// 5.
		String newArr[]  = newString.split("\\s");
		StringBuffer removeWhString = new StringBuffer();
		for(String e : newArr){
			removeWhString.append(e);
		}
		System.out.println(removeWhString);
	}
}
