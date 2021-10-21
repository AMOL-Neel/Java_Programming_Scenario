package javaTrickyScenario;

public class PatternProgram {
	public void rightAnglePattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void reverseRightAngPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void upDownCombinedPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void leftSideStarPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void leftSideReverseStarPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = n; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void triangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (int k = 1; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void pyramidPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public void diamondPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = n; k >= i; k--) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public void alphabetPattern1(int n) {
		int alpha = 65;

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				char k = (char) (alpha + j);
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

	public void alphabeticPattern2(int n) {
		int alpha = 97;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) alpha + " ");
			}
			alpha++;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new PatternProgram().rightAnglePattern(5);
		System.out.println();
		new PatternProgram().reverseRightAngPattern(5);
		System.out.println();
		new PatternProgram().upDownCombinedPattern(5);
		System.out.println();
		new PatternProgram().leftSideStarPattern(5);
		System.out.println();
		new PatternProgram().leftSideReverseStarPattern(5);
		System.out.println();
		new PatternProgram().triangle(5);
		System.out.println();
		new PatternProgram().pyramidPattern(5);
		System.out.println();
		new PatternProgram().diamondPattern(5);
		System.out.println();
		new PatternProgram().alphabetPattern1(25);
		System.out.println();
		new PatternProgram().alphabeticPattern2(5);

	}

}
