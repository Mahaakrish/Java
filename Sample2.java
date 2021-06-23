package pro1;
public class Sample2 {
	int a=120;
	Sample2(int a){
		System.out.println("Constructor called");
		this.a=(int)this.m1(10,20);
		//Constructor can't return anything but we can use class variable to use within main()
	}
	float m1(int a,int b) {
		return (this.a+a+b);
		
	}
	public static void main(String[] args) {
		int n=10;
		float x;
		float a;
		String a1 = "Prashanth";
		x=(float)n;
		System.out.println("X value = "+x);
		Sample2 s = new Sample2(n);
		a = s.m1(5,10);
		//Sample2 s = new Sample2();//Default constructor won't work if user define a constructor
		System.out.println("Sum is "+s.m1(2,4));
		//Only static methods and variables can be accessed using class name
		System.out.println(s.a);
	}
}
