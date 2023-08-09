package testPj;
import java.util.Scanner;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws NumberFormatException, IOException {		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int radius;
		double size;
		double round;
		
		System.out.print("반지름을 입력하시오");
		radius = Integer.parseInt(br.readLine());
		
		size = radius * radius *3.14;
		round = 2 * radius * 3.14;
		
		System.out.printf("원의 넓이: %.1f\n", size);		
		System.out.printf("원의 둘레 : %.1f\n", round);
	}

}
