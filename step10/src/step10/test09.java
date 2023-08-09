package step10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test09 {

	public static void main(String[] args) throws IOException {
			FileReader fr = new FileReader("testDat.txt");			
			BufferedReader br = new BufferedReader(fr);
			String pro;
			
			System.out.println("---------------");
			System.out.println("품목       가격");
			System.out.println("---------------");
			while((pro = br.readLine()) != null) {
				int k = Integer.parseInt(br.readLine());
				int g = Integer.parseInt(br.readLine());
			
				System.out.println(pro + "\t" + (k*g));
			}
			br.close();
			fr.close();
			System.out.println("----------------");
		}

}