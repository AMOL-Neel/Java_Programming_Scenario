package javaTrickyScenario;

import java.lang.reflect.Field;

/*Create a String language translator using reflection api in java
 * auto bots
 * @param args
 */


public class StringTranslator {
	
	static{
		try {
			Field value = String.class.getDeclaredField("value");
			value.setAccessible(true);
			value.set("Hello Amol", value.get("Hola Amol"));
			value.set("good Morning Amol", value.get("buenos días Amol"));
			value.set("How are you?", value.get("¿Cómo estás?"));
			
			value.set("I need Help in java", value.get("please connect with Amol"));
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Hello Amol");
		System.out.println("good Morning Amol");
		System.out.println("How are you?");
		System.out.println("I need Help in java");
		
	}

}
