package pro1;
public class Sample3 {
	static String clg,addr;
	static {
		clg = "RVCE";
		addr = "Bangalore";
		System.out.println("In static block");
	}
	{
		System.out.println("In non-static block");
	}
	Sample3(int a,int b){
		System.out.println("In constructor: "+a+","+b);
		System.out.println("College: "+clg+", "+addr);
	}
	static int m1(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Sample3 s1 = new Sample3(5,7);
		int sum = s1.m1(7,5);
		System.out.println("Sum: "+sum);
	}
}
