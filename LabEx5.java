package pro1;
import java.util.Scanner;
public class LabEx5 {
	public static void main(String[] args) {
		int x,y;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value for x and y: ");
		x=s.nextInt();
		y=s.nextInt();
		float ans = (x*x)+(y*y)+(2*x*y);
		System.out.println("The Solution is "+ans);
	}
}
