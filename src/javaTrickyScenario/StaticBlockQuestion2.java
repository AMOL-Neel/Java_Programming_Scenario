package javaTrickyScenario;
class BlockTest{
	static{
		System.out.println("static block of block test");
	}
	
	public static final int age = 30;
}
public class StaticBlockQuestion2 {
	public static void main(String[] args) {
		System.out.println( BlockTest.age);
	}

}


/*if we remove the static keyword then static block will executed because we need to create object of BlockTest class
 * if we remove the final then also static block will execute.*/
