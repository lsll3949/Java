package step10;

import java.io.FileWriter;
import java.io.IOException;

public class test02 {

	public static void main(String[] args) throws IOException {
		
		StringBuilder str = new StringBuilder();
		str.append("동해물과 백두산이 마르고 닳도록\n");
		str.append("하느님이 보우하사 우리나라 만세\n");
		str.append("무궁화 삼천리 화려강산\n");
		str.append("대한사람 대한으로 길이 보전하세............\n");
		
		//FileWriter로 파일에 출력
		FileWriter fw = new FileWriter("data4.txt");
//		File file = new File("data4.txt");
//		FileWriter fw = new FileWriter(file);
		
		fw.write(str.toString());
		System.out.println("저장 성공");
		fw.close();
	}

}
