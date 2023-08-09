package step07;

import java.util.Scanner;

public class TvUser {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String com = sc.next();
		TV ob = null;
		
		if(com.equals("Lg")||com.equals("lg")||com.equals("LG")) {
			ob = new Lg();
		} else {
			ob = new Samsung();
		}
		ob.powerOn();
		ob.powerOff();
		ob.VolumeUP();
		ob.VolumeDown();
		
	}

}
