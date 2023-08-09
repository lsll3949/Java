package step10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class test01 {
	
	public static void main(String[] args) throws IOException {
		String name = "홍길동";
		int age = 25;
		double tall = 183.4;
		
		
		// 1. FileOutputStream 이용 파일 출력, data1.txt
		
		FileOutputStream fos = new FileOutputStream("data1.txt");
		
		fos.write(name.getBytes());
		fos.write(Integer.toString(age).getBytes());
		fos.write(Double.toString(tall).getBytes());
		
		System.out.println("저장 성공");
		
		
		// 2. PrintStream으로 출력형식 지정하여 파일에 저장
		
		File file = new File("data2.txt");
		PrintStream ps = new PrintStream(System.out);
		ps.printf("이름 : %s	 나이 : %d   키 : %.2f\n", name, age, tall);
		
		
		// 3. PrintWriter으로 출력형식 지정하여 저장
		
		PrintWriter pw = new PrintWriter("data3.txt");
		pw.printf("이름 : %s	 나이 : %-5d   키 : %.3f\n", name, age, tall); // %.3f, 소수점 셋째자리까지 저장.
		
		
		
		// close();를 적어놔야 파일이 저장됨.
		fos.close();		
		ps.close();
		pw.close();
	}
	
}
