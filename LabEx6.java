package pro1;
import java.util.Scanner;
public class LabEx6 {
	String name,addr,phno,email,branch;
	static String clg_name,clg_addr,clg_phno;
	static {
		clg_name = "RVCE";
		clg_addr = "Bangalore";
		clg_phno = "0816-225588";
	}
	LabEx6(){
		System.out.println("Inside default constructor");
	}
	LabEx6(String name,String phno,String branch){
		this.name = name;
		this.phno = phno;
		this.branch = branch;
	}
	LabEx6(String name,String addr,String phno,String email,String branch){
		this.name = name;
		this.addr = addr;
		this.phno = phno;
		this.email = email;
		this.branch = branch;
	}
	void disp() {
		System.out.println("**********************");
		System.out.println("Name: "+this.name);
		System.out.println("Address: "+this.addr);
		System.out.println("Ph. No.: "+this.phno);
		System.out.println("Mail id: "+this.email);
		System.out.println("Branch: "+this.branch);
		System.out.println("College Name: "+clg_name);
		System.out.println("College Address: "+clg_addr);
		System.out.println("College Contact: "+clg_phno);
		System.out.println("**********************");
	}
	void disp(int n) {
		switch(n) {
		case 1:
			System.out.println(this.name);
			break;
		case 2:
			System.out.println(this.name);
			System.out.println(this.addr);
			break;
		case 3:
			System.out.println(this.name);
			System.out.println(this.addr);
			System.out.println(this.phno);
			break;
		case 4:
			System.out.println(this.name);
			System.out.println(this.addr);
			System.out.println(this.phno);
			System.out.println(this.email);
			break;
		case 5:
			System.out.println(this.name);
			System.out.println(this.addr);
			System.out.println(this.phno);
			System.out.println(this.email);
			System.out.println(this.branch);
			break;
		default:
			System.out.println("Wrong input");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student name: ");
		String name = sc.nextLine();
		System.out.println("Enter student address: ");
		String addr = sc.nextLine();
		System.out.println("Enter student phone number: ");
		String phno = sc.nextLine();
		System.out.println("Enter student mail-id: ");
		String email = sc.nextLine();
		System.out.println("Enter student branch: ");
		String branch = sc.nextLine();
		
		LabEx6 o1 = new LabEx6();
		
		LabEx6 o2 = new LabEx6(name, phno, branch);
		
		LabEx6 o3 = new LabEx6(name, addr, phno, email, branch);
		
		o2.disp();
		
		System.out.println("Enter the no of fields: ");
		int n = sc.nextInt();
		o3.disp(n);
	}
}
