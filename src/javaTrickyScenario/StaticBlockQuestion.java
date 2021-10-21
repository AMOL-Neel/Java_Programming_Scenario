package javaTrickyScenario;

/*is it possible to compile and run a java program without writing main method?
 * ANS: in same class this is not possible.
 *      in different class this is possible.*/
public class StaticBlockQuestion {
	
	static int age = 20;
	
	
	static{
		System.out.println("static block1");
	}
	
	static{
		System.out.println("static block1");
	}
	
	static{
		System.out.println("static block1");
	}
}

class TestingBlock{
	
	public static void main(String[] args) {
		StaticBlockQuestion sbq = new StaticBlockQuestion();
		System.out.println(StaticBlockQuestion.age);
		
	}
}
