package javaTrickyScenario;

// check given number is valid or not
// check given phone number is valid --10 digits
// check given CC number is valid -- 16 digits

public class IsNumber {
	
	public static boolean isCorrectNumber(String number){
		return number.matches("^(-?\\d+\\.)?-?\\d+$");
		
	}

	// by using regular expression
	public static boolean isCorrectPhoneNumber(String number){
		
		// 1.
		// return number.matches("[0-9]{10}");
		// 2. 
		return number.matches("\\d{10}");
	}
	
	// verify valid phone number:
	public static boolean isValidPhoneNumber(String number) {
		if (number.length() == 10 && isNumber(number)) {
			System.out.println("valid phone number ::" + number);
			return true;
		}
		System.out.println("not a valid phone number ::" + number);
		return false;
	}

	// verify the given string is number or not:
	public static boolean isNumber(String number) {
		try {
			Long.parseLong(number);
			System.out.println("this is a valid number ::" + number);

		} catch (NumberFormatException e) {
			System.out.println(e);
			System.out.println("not a valid number ::" + number);
			return false;
		}
		return true;
	}

	// verify the given number is valid Credit number or not:
	public static boolean isValidCCardNumber(String number) {
		if (number.length() == 16 && isNumber(number)) {
			System.out.println("valid CCard Number ::" + number);
			return true;
		}
		System.out.println("not a valid CCNumber ::" + number);
		return false;
	}
	

	public static void main(String[] args) {
		System.out.println(isNumber("123456a"));
		System.out.println(isValidPhoneNumber("9049629927"));
		System.out.println(isValidPhoneNumber("12345678912"));
		System.out.println(isValidCCardNumber("1234567891234567"));
		System.out.println();
		System.out.println(isCorrectPhoneNumber("1234567894"));
		System.out.println();
		System.out.println(isCorrectNumber("100"));
		System.out.println(isCorrectNumber("100.0"));
		System.out.println(isCorrectNumber("-100.0"));
		System.out.println(isCorrectNumber("100.0A"));

	}

}
