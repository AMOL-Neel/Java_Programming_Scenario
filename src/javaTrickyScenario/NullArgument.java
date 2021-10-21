package javaTrickyScenario;

public class NullArgument {
	/*pass null argument with method overloading with string and object types
	 */
	
	public static void test(Object o){
		System.out.println("object argument");
	}
	
	public static void test(String s){
		System.out.println("String argument");
	}
	
	public static void main(String[] args) {
		test(null);
		
	}
	
	//String argument : it will take quite data type

}
