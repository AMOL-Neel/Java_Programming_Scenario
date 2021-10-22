package collection_example;

import java.util.ArrayList;

public class Test3 {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		for (int aa : a) {
			System.out.println(aa);

		}

		ArrayList al = new ArrayList();
		al.add(new Emp(100, "amol", "capjemini"));
		al.add(new Student(10, "suyog", "godavari high school", 5400.00f));

		for (Object oo : al) {
			if (oo instanceof Emp) {
				Emp e = (Emp) oo;
				System.out.println(e.empid + " " + e.empname + " " + e.empcompany);

			}
			if (oo instanceof Student) {
				Student s = (Student) oo;
				System.out.println(s.sid + " " + s.sname + " " + s.schname + " " + s.fees);

			}

		}
		System.out.println();

		Object oo1 = al.get(0);

		if (oo1 instanceof Emp) {
			Emp e = (Emp) oo1;
			System.out.println(e.empid + " " + e.empname + " " + e.empcompany);

		}
		if (oo1 instanceof Student) {
			Student s = (Student) oo1;
			System.out.println(s.sid + " " + s.sname + " " + s.schname + " " + s.fees);

		}

		ArrayList<Emp> ali = new ArrayList<Emp>();
		ali.add(new Emp(200, "ashish", "wockhardth"));
		ali.add(new Emp(300, "yogesh", "mylan"));
		ali.add(new Emp(400, "sameer", "videocon"));

		for (Emp ee : ali) {
			System.out.println(ee.empid + " " + ee.empname + " " + ee.empcompany);
		}

		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(new Student(10, "amol", "visionit", 23000.00f));
		al1.add(new Student(20, "vinod", "visionit", 34000.55f));
		al1.add(new Student(30, "yash", "sent_lawrance", 34444.00f));
		al1.add(new Student(40, "ashish", "maharashtra public school", 334432.00f));
		al1.add(new Student(50, "vinay", "government_school", 34334.432f));

		for (Student st : al1) {
			System.out.println(st.sid + " " + st.sname + " " + st.schname + " " + st.fees);
		}

	}

}
