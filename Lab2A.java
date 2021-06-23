package pro1;
import java.util.Scanner;
class Person{
	String name,addr,phno,email;
	Person(String name,String addr,String phno,String email){
		this.name = name;
		this.addr = addr;
		this.phno = phno;
		this.email = email;
	}
	void disp() {
		System.out.println(this.name);
		System.out.println(this.addr);
		System.out.println(this.phno);
		System.out.println(this.email);
	}
}

class Staff extends Person implements Staff_op{
	String company,eid,designation;
	Staff(String name, String addr, String phno, String email,String company, String eid, String designation) {
		super(name, addr, phno, email);
		this.company = company;
		this.eid = eid;
		this.designation =  designation;
	}
	@Override
	public double calc_sal() {
		return 60000;
	}
	void disp() {
		super.disp();
		System.out.println(this.company);
		System.out.println(this.eid);
		System.out.println(this.designation);
		System.out.println("Salary: "+this.calc_sal());
	}
}

class Student extends Person implements Student_op{
	String usn,branch;
	Student(String name, String addr, String phno, String email, String usn, String branch) {
		super(name, addr, phno, email);
		this.usn = usn;
		this.branch = branch;
	}
	@Override
	public double calc_fees() {
		return 100000;
	}
	void disp() {
		super.disp();
		System.out.println(this.usn);
		System.out.println(this.branch);
		System.out.println("Fees: "+this.calc_fees());
	}
}
public class Lab2A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name1,addr1,phno1,email1,company,eid,designation;
		System.out.println("Enter staff name: ");
		name1 = sc.nextLine();
		System.out.println("Enter staff addr: ");
		addr1 = sc.nextLine();
		System.out.println("Enter staff phno: ");
		phno1 = sc.nextLine();
		System.out.println("Enter staff email: ");
		email1 = sc.nextLine();
		System.out.println("Enter staff company: ");
		company = sc.nextLine();
		System.out.println("Enter staff eid: ");
		eid = sc.nextLine();
		System.out.println("Enter staff designation: ");
		designation = sc.nextLine();
		Staff staff1 = new Staff(name1,addr1,phno1,email1,company,eid,designation);
		System.out.println("Staff created...");
		staff1.disp();
		String name2,addr2,phno2,email2,usn,branch;
		System.out.println("Enter student name: ");
		name2 = sc.nextLine();
		System.out.println("Enter student addr: ");
		addr2 = sc.nextLine();
		System.out.println("Enter student phno: ");
		phno2 = sc.nextLine();
		System.out.println("Enter student email: ");
		email2 = sc.nextLine();
		System.out.println("Enter student usn: ");
		usn = sc.nextLine();
		System.out.println("Enter student branch: ");
		branch = sc.nextLine();
		Student st1 = new Student(name2,addr2,phno2,email2,usn,branch);
		System.out.println("Student created...");
		st1.disp();
	}
}
