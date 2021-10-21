package javaTrickyScenario;

public class BinaryNumber {
	public static void isBinarynumber(int num) {
		boolean isBinary = true;

		int copyNumber = num;
		while (copyNumber != 0) {
			int rem = copyNumber % 10;
			if (rem > 1) {
				isBinary = false;
				break;
			} else {
				copyNumber = copyNumber / 10;
			}
		}
		if (isBinary) {
			System.out.println(num + " is a binary number");
		} else {
			System.out.println(num + " is not a binary number");
		}
	}
	
	// regular expression :
	
	public static void isBin(int number){
		if(String.valueOf(number).matches("[0-1]+")){
			System.out.println(number+" is a binary number");
		}else{
			System.out.println(number+" is not a binary number");
		}
	}
	
	// with the help of wrapper class  :
	
		public static void isBinNum(int number){
			try{
			Integer.parseInt(String.valueOf(number),2);
			System.out.println(number +" is a binary number");
			}catch(Exception e){
				System.out.println(number +" is not a binary number.");
			}
		}


	public static void main(String[] args) {
		isBinarynumber(100);
		isBinarynumber(5555);
		System.out.println("-----------------------");
		isBin(10100);
		isBin(1);
		isBin(0);
		isBin(23531);
		isBin(101);
		System.out.println("-----------------------");
		isBinNum(1011);
		isBinNum(1);
		isBinNum(0);
		isBinNum(12356);
		isBinNum(1010100000);
	}

}
