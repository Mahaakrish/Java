package pro1;
import java.util.Scanner;
public class LabEx4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String st1 = s.nextLine();
		System.out.println("The length of string "+st1+" is "+st1.length());
		System.out.println("The substring of string is "+st1.substring(0,5));
		String st2 = "rvce";
		String st3 = st1+st2.toUpperCase();
		System.out.println(st3);
		st3=st3.toUpperCase();
		System.out.println(st3);
		String st4="";
		int i=st3.length()-1;
		while(i>=0) {
			st4+=st3.charAt(i);
			i--;
		}
		st4+='\0';
		System.out.println(st4);
	}
}
