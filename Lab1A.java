package pro1;
import java.util.Scanner;
public class Lab1A {
	String name;
	String addr;
	String phno;
	String email;
	String branch;
	double ad_fee = 15000;
	double tut_fee = 10000;
	double br_fee;
	double tot_fee;
	Lab1A(){
		
	}
	void st_details(String name, String addr, String phno, String email, String branch) {
		this.name = name;
		this.addr = addr;
		this.phno = phno;
		this.email = email;
		this.branch = branch;
	}
	double feetopay() {
		switch(this.branch) {
		case "cs":
			this.br_fee = 50000;
			break;
		case "mca":
			this.br_fee = 40000;
			break;
		case "civil":
			this.br_fee = 35000;
			break;
		case "mech":
			this.br_fee = 25000;
			break;
		case "arch":
			this.br_fee = 65000;
			break;
		}
		this.tot_fee = this.ad_fee+this.tut_fee+this.br_fee;
		return tot_fee;
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
		Lab1A s1 = new Lab1A();
		s1.st_details(name,addr,phno,email,branch);
		System.out.println("The fee "+s1.name+" has to pay the "+s1.branch+" branch is: "+s1.feetopay());
	}
}
