package step10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test07 {

	public static void main(String[] args) throws IOException {
		try {
			String name;
			int k, e, m;
			int sum = 0;
			double avg;
			
			BufferedReader br = new BufferedReader(new FileReader("score.txt"));
			
			while ((name= br.readLine()) != null) {

				k = Integer.parseInt(br.readLine());
				e = Integer.parseInt(br.readLine());
				m = Integer.parseInt(br.readLine());
			
				sum = k+e+m;
				avg = sum/3.0;
				System.out.println("이름 : " + name + " 총점 : " + sum + " 평균 : " + avg);
			
			}			
			br.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}

}
