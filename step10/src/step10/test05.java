package step10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class test05 {
	public static void main(String[] args) throws IOException, Exception {
		
		//FileInputStream 사용
//		FileInputStream fis = new FileInputStream("nData1.txt");
//		InputStream is  = new FileInputStream("ndata1.txt");
		
//		int readData;
		
/*		while(true) {
			readData = fis.read();
			if(readData == -1)
				break;
			System.out.print((char)readData);
		}
		fis.close();
	
	
		// 2. InputStreamReader 사용
		FileInputStream fis2 = new FileInputStream("ndata1.txt");
		InputStreamReader isr = new InputStreamReader(null);
		
		// InputStreamReader isr = new InputStreamReader(new FileInputStream("nData1.txt"););
		
		int rd;
		while(true) {
			rd = isr.read();
			if(rd == -1)
				break;
			System.out.println(rd);
		}
		
		System.out.println("-----------------------------------------------");*/
		
		
		// 3. BufferedReader 사용
		FileInputStream fis = new FileInputStream("ndata1.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
/*		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream("ndata1.txt")));*/
		
		
		String str;
		
		while((str=br.readLine()) != null) {
			System.out.println(str);
			Thread.sleep(500);
		}
		br.close();
		isr.close();
		fis.close();
		
		
	}
	
}
