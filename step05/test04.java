package step05;

class Ctest{
	void method() {
		System.out.println("메서드 출력");
	}
	
	public String toString() {
		return "홍길동";
	}
}
public class test04 {

	public static void main(String[] args) {
		
		Ctest ob = new Ctest();
		ob.method();
		System.out.println(ob);
		System.out.println(ob.toString());
	}

}
