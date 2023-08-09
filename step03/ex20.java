package step03;

public class ex20 {

	public static void main(String[] args) {
		int[][] myArr = new int[2][4];
		myArr[0][0] = 2;
		myArr[0][1] = 5;
		myArr[0][2] = 7;
		myArr[0][3] = 4;
		myArr[1][0] = 9;
		myArr[1][1] = 3;
		myArr[1][2] = 2;
		myArr[1][3] = 8;
		
		int sum1 = 0, sum2 = 0;
		
		for (int i = 0; i < myArr.length; i++) {
			sum1 += myArr[0][i];
		}
		System.out.println("첫번째 행의 합계: " + sum1);
		
		for (int i = 0; i < myArr[0].length; i++) {
			sum2 += myArr[0][i];
		}
		System.out.println("두번째 행의 합계: " + sum1);
		
		// for-each 문으로 행별 데이터 출력
	
		for(int ar : myArr[0])
			System.out.println(ar + " ");
		
		for(int ar : myArr[1])
			System.out.println(ar + " ");
		
		for(int ar : myArr[2])
			System.out.println(ar + " ");
		
	}
	
	
}
