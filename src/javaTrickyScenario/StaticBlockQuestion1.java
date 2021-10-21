package javaTrickyScenario;

/*can we initialize member variables within static block?
 * Ans : Yes*/


public class StaticBlockQuestion1 {
	
	String name;
	
	static{
		System.out.println(new StaticBlockQuestion1().name = "amol Neel");
	}
	public static void main(String[] args) {
		
	}

}
