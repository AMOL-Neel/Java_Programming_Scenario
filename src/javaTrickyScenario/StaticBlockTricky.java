package javaTrickyScenario;

public class StaticBlockTricky {

	/* will static block be executed with final variable? */

	public static void main(String[] args) {
		System.out.println(Main.x);

	}

}

class Main {
	public static final int x = 100;

	static {
		System.out.println("main -- class static block");
	}

	/*
	 * it will take Main.x as a 100 directly inside the bytecode. in the case of
	 * final this particular is not loaded. that's why in case of final static
	 * block will never executed.
	 */
}
