package step04;

public class ArrayEx7 {

	public static void main(String[] args) {
		int [][] num = {
				{10, 20},
				{30, 40, 50, 60},
				{70, 80, 90} };
		for(int i = 0; i <num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
		//for each문의 기본형
		for(int[] a:num) {
			for(int len:a)
				System.out.print(len + " ");
			System.out.println();
		}
	}
}
