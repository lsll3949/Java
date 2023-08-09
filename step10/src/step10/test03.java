package step10;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class test03 {

	public static void main(String[] args) throws IOException {
		// FileInputStream
		 FileInputStream fis = new FileInputStream("ndata1.txt");
		 int dt = fis.read();
		 System.out.println(dt);
		 System.out.println((char)dt);
		 
		 int dt2 = fis.read();
		 System.out.println(dt);
		 System.out.println((char)dt);
		 
		 // 문자스트림 FileReader
		 FileReader fr = new FileReader("ndata1.txt");
		 int dr = fis.read();
		 System.out.println(dt);
		 System.out.println((char)dt);
		 
		 dt2 = fis.read();
		 System.out.println(dt);
		 System.out.println((char)dt);
		 }

}
