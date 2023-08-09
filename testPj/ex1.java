package testPj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String finger;
		char type;
		int width, height;
		double area;
		
		System.out.print("도형 : ");
		finger = br.readLine();
		
		System.out.print("유형 : ");
		type = br.readLine().charAt(0); //'A\r\n'
		
		System.out.print("가로길이 : ");
		width = Integer.parseInt(br.readLine());
		
		System.out.print("세로길이 : ");
		height = Integer.parseInt(br.readLine());
		
		area = (double)width * height;
		
		System.out.println("도형은 " + finger + "입니다.");
		System.out.println("유형은 " + type + "입니다.");
		System.out.printf("넓이는 %.2f 입니다.", area);
		
	}

}
