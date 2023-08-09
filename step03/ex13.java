package step03;

public class ex13 {
	
	public static int cal1(int x, int y, int z){
		return(x+y+z);
	}
	
	public static double cal2(double x, double y, double z){
		return(x+y+z);
	}
	
	public static void cal3(char x, char y, char z){
		System.out.println(x + y + z);
	}

	public static void main(String[] args) {
		int res = cal1(5,6,7);
		System.out.println("정수 합 = " + res);
		
		double res1 = cal2(1.3, 5.6, 3.1);
		System.out.println("실수 합 = " + res1);
		
		cal3('a', 'b', 'c');

	}

}
