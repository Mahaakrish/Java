package pro1;
public class Sample5B implements Sample5A1,Sample5A2{
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int mul(int a, int b) {
		return a*b;
	}
	@Override
	public int div(int a, int b) {
		return a/b;
	}
	public static void main(String[] args) {
		Sample5A1 sa1;
		Sample5B sb1 = new Sample5B();
		sa1 = sb1;
		System.out.println(sa1.add(20, 10));
		System.out.println(sa1.mul(20, 10));
		System.out.println(sa1.div(20, 10));
	}
	@Override
	public float add(float a, float b) {
		return a+b;
	}
	@Override
	public float mul(float a, float b) {
		return a*b;
	}
	@Override
	public float div(float a, float b) {
		return a/b;
	}
}