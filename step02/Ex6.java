package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		int kor, eng, mat, sum = 0;
		double avg;
		char flag;
		
		 do {
			System.out.print("name 변수 : ");
			name = br.readLine();
			
			System.out.print("kor 변수 : ");
			kor = Integer.parseInt(br.readLine()); 
			System.out.print("eng 변수 : ");
			eng = Integer.parseInt(br.readLine()); 			
			System.out.print("mat 변수 : ");
			mat = Integer.parseInt(br.readLine());
			
			sum = kor + eng + mat;
			System.out.println("이름 " + name);
			System.out.println("합계점수 :" + sum);
			System.out.printf("평균점수 : %.1f", sum/3.0);
					
			System.out.println();
			System.out.println("계속 ? (y/n)");
			flag = br.readLine().charAt(0);
			
		} while(flag != 'n');
		 	System.out.println("수고하셨습니다");
		
		
	}
}
/*public static void main(String[] args) {
		
		for (int i = 1; i<=5; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}*/

/*
 * public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j>=i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
			
	}
*/