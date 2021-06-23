package pro1;
import java.util.Scanner;
class A{
	String name,addr,phno,email,branch;
	static String clg_name,clg_addr,clg_phno;
	static {
		clg_name = "RVCE";
		clg_addr = "Bangalore";
		clg_phno = "0816-225588";
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
}
public class Sample4 extends A{
	Sample4(){
		System.out.println("Inside default constructor");
	}
	Sample4(String name,String phno,String branch){
		this.name = name;
		this.phno = phno;
		this.branch = branch;
	}
	Sample4(String name,String addr,String phno,String email,String branch){
		this.name = name;
		this.addr = addr;
		this.phno = phno;
		this.email = email;
		this.branch = branch;
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
		
		Sample4 s1 = new Sample4();
		Sample4 s2 = new Sample4(name,phno,branch);
		Sample4 s3 = new Sample4(name,addr,phno,email,branch);
		
		s1.disp();
		s2.disp();
		s3.disp();
		
		System.out.println("Enter the no of fields: ");
		int n = sc.nextInt();
		s3.disp(n);
	}
}
