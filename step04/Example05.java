package step04;

public class Example05 {

	public static void main(String[] args) {
		String s = " Java Programming ";
		String t = "홍길동";
		String str1;
		String str2;
		
		// 공백 제거
		str1 = s.trim();
		System.out.println(s);
		System.out.println(str1);
		
		str2 = s.concat(t);
		System.out.println(str2);
		
		
		
		
//		System.out.println("s.length() : " + s.length());
//		System.out.println("s.charAt(1) : " + s.charAt(1));
//		System.out.println("s.substring(6) : " + s.substring(6));
//		System.out.println("s.substring(5,13) : " + s.substring(5,13)); //
//		System.out.println("s.indexOf('P') : " + s.indexOf('P')); // 특정 글자 지정
//		System.out.println("s.toLowerCase() : " + s.toLowerCase()); // 소문자 변경
//		System.out.println("s.toUpperCase() : " + s.toUpperCase()); // 대문자 변경

	}

}
