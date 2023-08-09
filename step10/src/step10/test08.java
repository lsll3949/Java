package step10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class test08 {

	public static void main(String[] args) throws IOException {
		// BufferedReader(new InputStreamReader(System.in)):표준 입력
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		//출력스트림
		BufferedWriter bw = new BufferedWriter(new FileWriter("emp.txt"));
		
		String name, dept; //이름, 부서
		int salary; //급여
		
		System.out.println("입력을 종료하려면 Ctrl+Z를 누름\n");
		do {
			
			System.out.print("이름 입력 : "); name = br.readLine();
			System.out.print("부서 입력 : "); dept = br.readLine();
			System.out.print("급여 입력 : "); salary = Integer.parseInt(br.readLine());
			
			bw.write(name + "\t" + dept + "\t" + salary + "\n");
			System.out.println("계속 하려면 Enter를 누르시오");
			System.in.read();			
		}while(System.in.read() != -1);
		
		bw.close();
		br.close();
		isr.close();
		System.out.println("파일 저장 성공");
		
	}

}
