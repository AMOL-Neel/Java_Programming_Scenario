package javaTrickyScenario;

public class LeaderElement {
	public static void findLeaders(int num[]) {
		
		if(num.length ==0){
			return;
		}
		if(num.length==1){
			System.out.println(num[0]);
			return;
		}
		
		int max = num[num.length - 1];
		System.out.print(max + " ");

		for (int i = num.length - 2; i >= 0; i--) {
			if (num[i] > max) {
				System.out.print(num[i] + " ");
				max = num[i];
			}
		}
	}

	public static void main(String[] args) {
		int num[] = { 92, 7, 12, 9, 8, 3 };
		findLeaders(num);
		System.out.println();

		int Num1[] = { 92, 11, 10, 9, 8, 14 };
		findLeaders(Num1);
		System.out.println();

		int Num2[] = { 92, 11, 10, 9, 8, 14, 3, 3 };
		findLeaders(Num2);
		System.out.println();

		int Num3[] = { 9, 11, 10, 9, 8, 14, 3, 3 };
		findLeaders(Num3);
		System.out.println();

		int Num4[] = {  };
		findLeaders(Num4);
		System.out.println();

		int Num5[] = { 92 };
		findLeaders(Num5);
		System.out.println();
	}

}
