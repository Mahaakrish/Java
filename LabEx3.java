package pro1;
import java.util.Scanner;
public class LabEx3 {
	public static void main(String[] args) {
		int n,i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = s.nextInt();
		for(i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
		}
	}
}
