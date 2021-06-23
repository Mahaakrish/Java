package pro1;
import java.util.Scanner;
public class LabEx2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int ch,st,end;
		String s1="",s2="";
		while(true) {
			System.out.println("1. First & last character\n2. Compare\n3. Length of string\n4. Substring\n5. Remove spaces");
			System.out.println("Enter the choice: ");
			ch = s.nextInt();
			switch(ch) {
			case 1:
				System.out.print("Enter a string: ");
				s1 = s.next();
				System.out.println("First char: "+s1.charAt(0));
				System.out.println("Last char: "+s1.charAt(s1.length()-1));
				break;
			case 2:
				System.out.println("Enter string1: ");
				s1 = s.next();
				System.out.println("Enter string2: ");
				s2 = s.next();
				if(s1==s2)
					System.out.println("String s1 and s2 is equal");
				else
					System.out.println("String s1 and s2 is equal");
				break;
			case 3:
				System.out.println("Enter a string: ");
				s1 = s.next();
				System.out.println("The length of string is "+s1.length());
				break;
			case 4:
				System.out.println("Enter a string: ");
				s1 = s.next();
				System.out.println("Enter start and end point: ");
				st=s.nextInt();
				end=s.nextInt();
				System.out.println("Substring is "+s1.substring(st,end));
				break;
			case 5:
				s.nextLine();
				System.out.println("Enter a string: ");
				s1 = s.nextLine();
				s1=s1.replaceAll(" ","");
				System.out.println(s1);
				break;
			default:
				System.out.println("Invalid choice..");
				break;
			}
		}
	}
}