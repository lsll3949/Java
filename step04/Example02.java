package step04;

public class Example02 {
	
	static void myMethod1() {
		System.out.println("정적 메서드 호출");
	}
	
	void myMethod2() {
		System.out.println("인스턴트 메서드 호출");
	}

	public static void main(String[] args) {
		
		Example02.myMethod1();
		
//		myMethod2();
		//객체화
		Example02 myObj = new Example02();
		myObj.myMethod2();
	}

}
