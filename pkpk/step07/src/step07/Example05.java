package step07;

class Father implements Parent{
	public void printInfo() {
		System.out.println("아버지입니다");

	}
}
public class Example05 {

	public static void main(String[] args) {
		Father myFather = new Father();
		myFather.printInfo();

	}

}
