package pro1;
import java.util.Scanner;
public class LabEx1 {
	public static void main(String[] args) {
		int n,i;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = s.nextInt();
		for(i=n;i>=0;i--){
			System.out.print(i*i+" ");
		}
		for(i=1;i<=n;i++) {
			System.out.print(i*i+" ");
		}
	}
}
