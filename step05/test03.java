package step05;

public class test03 {

	public static void view1(int x) {
		x++;
		System.out.println("view1의 x : " + x);
		
	}
	
	public static void view2(int[] num){
		num[0] = 20;
		for(int aa: num) {
			System.out.println(aa + " ");
		}
	}
	
	public static void main(String[] args) {
		// view2 호출
		int[] num= {1,2,3};
		
		view2(num);
		System.out.println("view2 호출후 배열 출력");
		for(int aa: num)
			System.out.println(aa + " ");
		
		int x = 10;
		System.out.println("main의 x : " + x);
		view1(x);
		System.out.println("main의 x : " + x);

	}

}
