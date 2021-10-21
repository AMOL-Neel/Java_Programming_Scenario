package javaTrickyScenario;

/*Count the Number of Occurrences of a given character in a string
 * using java 8 stream?
 */

public class CharOccurrenceCountStreams {
	
	public static long getCharCount(String str , char ch){
		return str.chars()
				.filter(e->(char)e == ch)
				.count();
		
	}
	
	public static void main(String[] args) {
		String str = "Testing solutions of test cases";
		
		long Count = str.chars().filter(e->(char)e == 's').count();
		System.out.println(Count);
		
		long count = str.chars().filter(e->(char)e == 's'||(char)e == 'i').count();
		System.out.println(count);
		
		// creating method for the solution
		
		long countOfOccu = getCharCount("aurangabad",'a');
		System.out.println("the Count of occurrences is :: "+countOfOccu);
	}
	

}
