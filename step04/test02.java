package step04;

class Game2{
	String irum;
	int ability;
	
	int upAbility() {
		return ability++;
	}
	
	int upAbility(int n) {
		return ability+=n;
	}
	
	int downAbility() {
		return ability--;
	}
	
	int downAbility(int n) {
		return ability-=n;
	}
	
	void setGame(String irum, int ability){
		this.irum = irum;
		this.ability = ability;
	}
	
	String getString() {
		return irum + "의 능력치 " + ability;
	}
}

public class test02 {

	public static void main(String[] args) {

		Game2 a1 = new Game2();
		a1.setGame("강감찬", 500);
		System.out.println(a1.getString());

		a1.upAbility(5);
		System.out.println(a1.getString());
		
//		a1.irum = "강감찬";
//		a1.ability = 500;
//		System.out.println(a1.getString());
		
		a1.upAbility();
		System.out.println(a1.getString());
		
		a1.downAbility(6);
		System.out.println(a1.getString());
		
	}

}
