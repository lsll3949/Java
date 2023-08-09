package step03;

public class ex16 {
	// 오버로딩을 이용해서 max 메서드 3개 생성하여 따른 가장 큰 값을 반환하여 출력
	public static int max(int x, int y){
		if (x  < y) {
			return y;
		}
		else if(x > y){
			return x;
		}
		else{
			return x;
		}
	}
	
	public static double max(double x, double y){
		if (x < y) {
			return y;
		}
		else if(x > y) {
			return x;
		}
		else {
			return y;	
		}
	}
	
	public static char max(char x, char y){
		if(x>y) {
			return x;
		}
		else if(x<y) {
			return y;
		}
		else {
			return x;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(max(6,3));
		System.out.println(max('v','s'));
		System.out.print(max(9.3, 7.1));
	}

}
