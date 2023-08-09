package step10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test10 {
	// 도서명, 저자, 출판사, 출판일
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("0807project.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String book, author, ch;
		int date;
		
		System.out.println("도서명 :" + book);
		System.out.println("저자 :" + author);
		System.out.print("\t출판사 : " + age);
		System.out.println("\t출판일 : " + date);
		// TODO Auto-generated method stub

	}

}
