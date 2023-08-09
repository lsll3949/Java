package step03;

import java.util.Random;

public class ex14 {

	public static void main(String[] args) {
		
		// 1. Math.random() : 0~1미만의 실수 난수 발생
		//
		
		for(int i = 0; i < 5; i++) {
			double d = Math.random();
			System.out.println(d);
		}
		
		//0~9
		for(int i = 0; i<5; i++) {
			int n = (int)(Math.random()*10);
			System.out.println(n+" ");
		}
		System.out.println();
		
		//1~10
		for(int i = 1; i<10; i++) {
			int n = (int)(Math.random()*10);
			System.out.println(n+" ");
		}
		System.out.println();
		
		//Random 클래스를 이용
		Random rd = new Random();
		//nextInt() :
		//nextInt():0~n-1
		
		System.out.println("-----------랜덤 클래스 이용 난수------------");
		for (int i = 0; i<5; i++) {
			int m=rd.nextInt(10);
			System.out.println(m+" ");
		}
		
		System.out.println(" ");
		for (int i = 0; i<5; i++) {
			Boolean mm = rd.nextBoolean();
			System.out.println(mm+" ");
		}
		
	}
}