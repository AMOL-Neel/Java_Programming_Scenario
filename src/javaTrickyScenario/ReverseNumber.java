package javaTrickyScenario;

// Reverse a Number using recursion:
public class ReverseNumber {

	public static void rev(long num) {
		if (num < 10) {
			System.out.println(num);
			return;
		} else {
			System.out.print(num % 10);
			rev(num / 10);
		}
	}

	public static void main(String[] args) {
		
		rev(10000);
		rev(35465);
		rev(4);
		rev(111);
		rev(8656546856546555555L);
		rev(001);
		rev(0);

		// 1.
		int num = 12345;
		while (num > 0) {
			int rev = num % 10;
			System.out.print(rev);
			num = num / 10;
		}

	}

}
