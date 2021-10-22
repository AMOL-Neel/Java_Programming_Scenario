package stringex;

public class Emp1 {
	int empid;
	String empcompany;
	float empsal;
	String empname;

	Emp1(int id, String company, float salary, String name) {
		this.empid = id;
		this.empcompany = company;
		this.empsal = salary;
		this.empname = name;
	}

	public String toString() {
		return "id : " + empid + " Empname : " + empname + " Empsalary :" + empsal + " Empcompany :" + empcompany;
	}

	public static void main(String[] args) {
		Emp1 e = new Emp1(100, "visionit", 42346.00f, "amol");
		Emp1 e1 = new Emp1(200, "visionit", 44346.00f, "ketan");
		System.out.println(e);
		System.out.println(e1);
		System.out.println();
		System.out.println(e.toString());
		System.out.println(e1.toString());

	}

}
