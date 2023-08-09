package step03;

/*
 * 전체 args 길이 출력
 * 각 문자열의 길이 출력
 * 
 */

public class ex19 {

	public static void main(String[] args) {
		//배열 전체 길이 출력
		System.out.println("args의 길이 : " + args.length);
		
		//배열요소내 문자열의 길이 출력
		for(int i=0; i<args.length ; i++) {
			System.out.println("args["+i+"]=" + args[i]);
			System.out.println("길이 : " + args[i].length());
		}
	}

}
