package javaTrickyScenario;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElementArray {
	// 1. brute force
	// 2. HashSet
	// 3. HashMap<k,v>
	// 4. streams

	public static void main(String[] args) {
		String name[] = { "amol", "sameer", "suyog", "vinod", "amol", "kedar", "rahul", "sameer", "ram", "akshay",
				"suyog","hemant","omkar","hemant" };

		System.out.println("***Brute Force***");
		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (name[i].equals(name[j])) {
					System.out.println(name[i]);
				}
			}
		}
		
		System.out.println();

		System.out.println("***hash set***");
		Set<String> data = new HashSet<String>();
		for (String e : name) {
			if (data.add(e) == false) {
				System.out.println(e);
			}
		}

		System.out.println();
		System.out.println("***Hash Map***");
		Map<String, Integer> nameMap = new HashMap<String, Integer>();
		for (String e : name) {
			Integer count = nameMap.get(e);
			if (count == null) {
				nameMap.put(e, 1);
			} else {
				nameMap.put(e, ++count);
			}
		}
		// print all duplicate elements:
		Set<Entry<String, Integer>> entrySet = nameMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
		
		System.out.println();

		System.out.println("***Streams set and filter***");
		Set<String> dataSet = new HashSet<String>();
		Set<String> dupSet = Arrays.asList(name).stream().filter(e -> !dataSet.add(e)).collect(Collectors.toSet());
		System.out.println(dupSet);
		
		System.out.println();
		System.out.println("*** Streams grouping By***");

		Set<String> eleSet = Arrays.asList(name).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());

		System.out.println(eleSet);
		
		System.out.println();
		System.out.println("*** Streams  using frequency***");
		
		List<String> list= Arrays.asList(name);
		Set<String> eleList = list.stream().filter(e-> Collections.frequency(list,e)>1)
				.collect(Collectors.toSet());
		
		System.out.println(eleList);
		

	}

}
