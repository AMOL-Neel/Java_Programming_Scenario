package javaTrickyScenario;

import java.util.HashMap;
import java.util.Map;

/*why HashMap key should be immutable in java?
 * why String is popular HashMap key in java?*/

// check TestMapEmp class

public class TestMap {
	public static void main(String[] args) {
		Map<TestMapEmp, String> empMap = new HashMap<TestMapEmp, String>();

		TestMapEmp e1 = new TestMapEmp("Amol", 25);

		empMap.put(e1, "Permanent");

		e1.setEmpAge(27);

		empMap.put(e1, "Temp");

		e1.setEmpName("suyog");

		System.out.println(empMap.get(e1));

		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("kedar", 30);
		System.out.println(m1.get("kedar"));
		
		m1.put("Sameer", 32);
		System.out.println(m1.get("Sameer"));
		System.out.println(m1.get("kedar"));
	}

}
