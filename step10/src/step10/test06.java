package step10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test06 {

	public static void main(String[] args) throws IOException {
		
		//1. 파일 전체 크기의 배열을 생성한 후 그 크기 만큼 읽어와서 배열에 저장
		//FileInputStream 사용
		
			FileInputStream fis = new FileInputStream("ndata1.txt");
			byte[] buf = new byte[fis.available()];
		
			fis.read(buf);
		
			System.out.println(buf);
		
		
		//2. InputStreamReader 사용
		
			System.out.println("--------------------------------------------");
		
			FileInputStream fis2 = new FileInputStream("ndata1.txt");
			InputStreamReader isr = new InputStreamReader(fis2);
			char[] ch = new char[fis2.available()];
			isr.read(ch); //0번 인덱스 위치부터 ch.length 크기만큼
		
			System.out.println(new String(ch));
		
		
		//3. BufferedReader 사용

			System.out.println("--------------------------------------------");
			
			File file = new File("ndata1.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			char[] brch = new char[(int) file.length()];
			
			br.read(brch);
			System.out.println(brch);
			
			
		//4. 
			
			
			br.close();
			fr.close();
			
			isr.close();
		
			fis.close();
			fis2.close();
		
	}

}
