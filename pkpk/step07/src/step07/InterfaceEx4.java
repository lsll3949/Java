package step07;

class User{
	String name;
	public User() {
		super();
	}
	public User(String name) {
		super();
		this.name = name;
	}
	public String tostring() {
		return "이름: " + name;
	}
}

interface Score {
	final int sol = 20;
	abstract int getScore();
}

interface Print {
	abstract String pln(); //void를 String으로 재정의 안 해줬음.
}

public class InterfaceEx4 extends User implements Score, Print{
	int s; // 개수
	
	public InterfaceEx4() {
		super();
	}
	public InterfaceEx4(String name, int s) {
		super(name);
		this.s = s;
	}

	@Override
	public String pln() { //void를 String으로 재정의 안 해줬음.
		return super.tostring() + " 점수 : " + getScore();
	}

	public int getScore() {
		return sol * s; //개수 * 배점
	}
	
	public static void main(String[] args) {
		
		InterfaceEx4 ob = new InterfaceEx4("홍길동", 5);
		System.out.println(ob.pln());
	}

}
