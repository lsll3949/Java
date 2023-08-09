package step05;

// 두 수를 구해서 출력하는 클래스를 만들어서 이 클래스에 대한 객체 배열
class Sum{
	int x, y;

	public Sum(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void tot() {
		System.out.println("합 = " + (x+y));
	}
}

public class ExSum {

	public static void main(String[] args) {
		
		int[] num = new int[2];
		num[0] = 5;
		
		//Sum 클래스에 대한 객체배열 요소가 2개인 1차원 배열
		
		Sum[] mOb = new Sum[3];
		int n = 10;
		for (int i = 0; i < mOb.length; i++) {
			mOb[i] = new Sum(n, n);
			mOb[i].tot();
			n++;
		}
		
		/*Sum[] mOb = new Sum[2];
		mOb[0] = new Sum(10, 20); 
		mOb[0].tot();*/
		
		
	}

}
