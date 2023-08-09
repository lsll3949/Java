package step05;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		
		// 입력을 받아 문자열을 분해하고 출력하시오
		Scanner s = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String a = s.nextLine();
		String[] arrSt = a.split(" ");
		
		for (String ar : arrSt)
			System.out.println(a);
		
		/*
		String str = "뽀로로/패티/루피/크롱/뽀뽀/삐삐";
		
		String[] arrStr = str.split("/");
		
		for(int i=0; i<arrStr.length; i++) {
			System.out.println(arrStr[i]);
		}
		*/
		
		// split을 이용하여 루피만 뽑아오기
		/*String aa = str.split("/")[2];
		System.out.println(aa);*/

	}

	public static void mth1() {
		// TODO Auto-generated method stub
		
	}

}
