package javaTrickyScenario;

/*/"Hello"/
 /'Hello'/ 
 '/'Hello'/'
 "/'Hello'/" 
 * "Hello"
 * I love "java" and "programming" and "movies"
 * 'I love "java" and "programming" and "movies"'
 * 
 * 
 * */


public class StringQuotes {
	
	public static String getXpath(String name){
		String xpath = "//input[@id='"+name+"']";
		return xpath;	
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("/\"Hello\"/");
		System.out.println("\"/'Hello'/\"");
		System.out.println("\"Hello\"");
		System.out.println("I love \"java\" and \"programming\" and \"movies\"");
		System.out.println("'I love \"java\" and \"programming\" and \"movies\"'");
		
		System.out.println(getXpath("amol"));
		System.out.println(getXpath("sameer"));
		System.out.println(getXpath("vinod"));
		
	}

}
