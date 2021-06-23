package pro1;
//import java.util.Scanner;
public class Sample1 {
	static int a=20;
	int b,c;
	public void method1() {
		System.out.println("a in method1() before declaration: "+a);
		int a=9;
		System.out.println("a in method1() after declaration: "+a);
	}
	public static void main(String[] args) {
		System.out.println("Hello");
		int x;//declare
		int a = 5;//intialize
		System.out.println("a in main(): "+a);
		System.out.println("a in class Sample: "+Sample1.a);
		Sample1 s1 = new Sample1();
		s1.method1();
		s1.b = 29;
		System.out.println("s1.b= "+s1.b);
		Sample1 s2 = new Sample1();
		System.out.println("s2.b= "+s2.b);
		Sample1 s3;//declare
		s3 = s2;
		//s3 = new Sample1();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
