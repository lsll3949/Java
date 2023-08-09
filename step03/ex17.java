package step03;

public class ex17 {

	public static void main(String[] args) {
		int[] myArr = new int[5];
		myArr[0] = 10;
		myArr[1] = 20;
		myArr[2] = 30;
		myArr[3] = 40;
		myArr[4] = 50;
		
		for (int i = 0; i <5; i++) {
			System.out.println(i + " 번째 요소 값 : " + myArr[i]);
			
		//for(자료형 변수명 : 배열명) ==> 변수명 : 배열명(인덱스)
		for(int ar : myArr)
			System.out.println(ar);
		}
	}

}
