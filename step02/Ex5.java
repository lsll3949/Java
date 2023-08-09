package step02;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int flag;
		
		do {
			System.out.println("10보다 큰 숫자를 입력하세요.");
			int x = s.nextInt();
			int sum = 0;
			
			do {
				sum += x;
				x--;
			} while(x>=10);
			System.out.println("합계: " + sum);
			System.out.println("계속 ? (1|0)");
			flag=s.nextInt();
		} while(flag == 1);
	}

}
