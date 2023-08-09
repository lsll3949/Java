package step04;

public class Student {//class student 선언
	String irum; //student의 irum
	int os, java; //student의 os, java
	
	// 메서드
	void setStu(String irum, int os, int java){
		this.irum = irum;
		this.os = os;
		this.java = java;
	}
	
	String getstring(){ // 출력형식을 메서드에 설정하고 메서드를 호출해서 출력
		return irum + "의 점수합 = " + sum();
	}
	
	public String tostring(){ // 출력형식을 메서드에 설정하고 메서드를 호출해서 출력
		return irum + "의 점수합 = " + sum();
	}
	
	int sum() { // sum() 메서드 : java + os 한 값을 반환
		int os = 0;
		return this.os + this.java;
	}
	String getIrum() { // getIrum() 메서드: irum을 반환
		return this.irum;
	}

	public static void main(String[] args) {
		Student hong = new Student(); // 객체 선언
		hong.setStu("홍길동", 80, 90);
		System.out.println(hong);
		System.out.println(hong.tostring());
		
		Student kim = new Student(); // 객체 선언
		kim.setStu("김유신", 40, 30);
		System.out.println(kim);
		System.out.println(kim.tostring());
		
		
	}
	
	// 멤버변수와 지역번수의 차이

}
