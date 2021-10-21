package javaTrickyScenario;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student("Amol",1,60,20);
		Student s2 = new Student("Suyog",2,50,21);
		Student s3 = new Student("Kedar",3,70,22);
		Student s4 = new Student("Vinod",4,50,23);
		Student s5 = new Student("ganesh",5,89,24);
		Student s6 = new Student("Bablu",6,99,25);
		Student s7 = new Student("hemant",7,100,26);
		
		// add all the student objects to the arraylist;
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		studentList.add(s7);
		
		System.out.println("total Students : "+studentList.size());
		
		for(Student st:studentList){
			System.out.println(st);
		}
		System.out.println("--------By using stream ----------");
		
		// streams :
		studentList.stream().forEach(e ->System.out.println(e));
		
		// names where marks> 80
		studentList.stream().filter(e ->e.getMarks()>80).forEach(e -> System.out.println(e.getName()+" : "+ e.getMarks()));
		
		// name who got the highest marks :
		int hm = studentList.stream().map(e -> e.getMarks()).max(Integer :: compare).get();
		System.out.println("highest marks : "+hm);
		
		// out of them who exact got highest marks
		studentList.stream().filter(e -> e.getMarks() == hm).forEach(e -> System.out.println(e));
		
	}

}
