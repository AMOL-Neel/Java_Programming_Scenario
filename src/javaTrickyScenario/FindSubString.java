package javaTrickyScenario;

/*Check substring is present in a given string
 */

public class FindSubString {
	
	// 1.
	public static boolean isSubstring(String mainString, String subString){
//		boolean b =mainString.contains(subString);
//		return b;
		return mainString.matches("(.*)"+subString+"(.*)");
	}
	
	// 2.
	public static boolean isSubstring1(String mainString, String subString){
		return mainString.contains(subString);
	}
	
	// 3.
	public static boolean isSubstring2(String mainString, String subString){
		return mainString.indexOf(subString) !=1;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(isSubstring("my name is amol babasaheb neel.","amol"));
		System.out.println(isSubstring("automationTesting","Test"));
		System.out.println(isSubstring("automation Testing"," "));
		System.out.println(isSubstring("automation Testing","  "));
		System.out.println(isSubstring2("automation Testing11","11"));
		System.out.println(isSubstring("automation Testing",null));
	}

}
