package step05;

class chain {
	chain(){
		this(10);
		System.out.println("기본 생성자 Chain() 호출");
	}
	
	chain(int x){
		this(5, 6);
		System.out.println("일반 생성자 Chain(int x) 호출");
		System.out.println("x의 값 : " + x);
	}
	
	chain(int x, int y){
		System.out.println("일반 생성자 Chain(int x, int y) 호출");
		System.out.println("x의 값 : " + x + "y의 값 : " + y);
	}

}
