package step05;

public class Test32 {
	
	public final double PI = 3.141592;
	
	public double area(int a) {
		return(a*a*PI);
	}
	
	public double area(int a, int b) {
		return(a*b);
	}
	
	public double area(int a, int b, int c) {
		return((a*b)*c/2);
	}

	public static void main(String[] args) {
		Test32 f = new Test32();
		// TODO Auto-generated method stub
		System.out.println("원의 넓이 : " + f.area(3));
		System.out.println("사각형의 넓이 : " + f.area(4,5));
		System.out.println("사다리꼴의 넓이 : " + f.area(3,4,7));
	}

}
