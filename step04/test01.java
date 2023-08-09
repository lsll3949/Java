package step04;

class Game{ // 게임 클래스	
	//멤버 변수 선언
	String irum;
	int ability;
	
	//메서드
	int upAbility() {
		return ability++;
	}
	
	int downAbility() {
		return ability--;
	}
	
	void setGame(String irum, int ability){
		this.irum = irum;
		this.ability = ability;
	}
	
	String getString() {
		return irum + "의 능력치 " + ability;
	}
}

public class test01 {
	

	public static void main(String[] args) {
		
		Game ob1 = new Game();
		ob1.setGame("홍길동", 50);
		System.out.println(ob1.getString());
		
		
		ob1.irum = "김유신";
		ob1.ability = 100;
		System.out.println(ob1.getString());
		
		ob1.downAbility();
		System.out.println(ob1.getString());
	}

}
