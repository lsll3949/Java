package step04;

public class Cat {
	String breed;
	String color;
	
	public Cat(){
		System.out.println("Cat() 생성자 호출");
	}
	
	public Cat(String pBreed){
		System.out.println("Cat(...) 생성자 호출");
		breed = pBreed;
	}
	
	public Cat(String pBreed, String pColor){
		System.out.println("Cat(...) 생성자 호출");
		breed = pBreed;
		color = pColor;
	}
	
	void eat() {
		System.out.println("먹이를 먹다");
	}
	
	void scratch() {
		System.out.println("발톱으로 할퀴다");
	}
	
	void meow() {
		System.out.println("야옹하고 울다");
	}
	
	public String toString() {
		return "고양이 품종 : " + breed + ", 색상 : " + color;
	}

}
