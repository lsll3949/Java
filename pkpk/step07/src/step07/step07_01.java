package step07;

// 오버라이딩

class Ain{
	//메서드
	public void methodAin() {
		System.out.println("Ain 클래스");
	}
}

//Ain 상속받음
class Bin extends Ain{
	public void methodAin() { //오버라이딩
		System.out.println("******************");
	}
}

public class step07_01 {

	public static void main(String[] args) {
		Bin ob = new Bin();
		ob.methodAin();

	}

}
