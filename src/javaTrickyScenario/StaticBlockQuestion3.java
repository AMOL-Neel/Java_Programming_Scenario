package javaTrickyScenario;

public class StaticBlockQuestion3 {
	
	static{
		System.out.println("static block");
	}
	
	{
		System.out.println("instance block");
	}
	
	StaticBlockQuestion3(){
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
	}
	

}
