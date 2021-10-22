package Map_example;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test_linkedhahMap {
	public static void main(String[] args) {
		LinkedHashMap<Emp, Student> lhm = new LinkedHashMap<Emp, Student>();
		lhm.put(new Emp(111, "amol"), new Student(222, "neel"));
		lhm.put(new Emp(333, "sujit"), new Student(444, "vaidya"));
		lhm.put(new Emp(555, "kiran"), new Student(666, "baviskar"));

		// keyset()
		Set<Emp> s = lhm.keySet();
		for (Emp e : s) {
			System.out.println(e.eid + " " + e.ename);

		}
		System.out.println();

		for (Emp ee : lhm.keySet()) {
			System.out.println(ee.eid + " " + ee.ename);
		}
		System.out.println();

		// print the values
		for (Student st : lhm.values()) {
			System.out.println(st.sid + " " + st.sname);
		}
		System.out.println( );

		// entryset
		Set<Entry<Emp, Student>> e = lhm.entrySet();
		Iterator<Entry<Emp, Student>> itr = e.iterator();
		while(itr.hasNext())
		{
			Entry<Emp,Student> en =itr.next();
			Emp en1 =en.getKey();
			System.out.println(en1.eid+" "+en1.ename);
			
			Student st1 = en.getValue();
			System.out.println(st1.sid+" "+st1.sname);

		}

		
	}

}
