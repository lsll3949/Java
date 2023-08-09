package step05;

public class constructorEx2 {
	
	//생성자 3개
	constructorEx2(){
		System.out.println("기본 생성자");
	}
	
	constructorEx2(int num){
		this(10, 20);
		System.out.println(num + "생성자");
	}
	
	constructorEx2(int num, int mm){
		this();
		System.out.println(num + "," + mm + "생성자");
	}
	
	public static void main(String[] args) {
		new constructorEx2(100);
	}
}
