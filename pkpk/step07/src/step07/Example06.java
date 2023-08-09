package step07;

interface Papa{
	void genderFather();
}

interface Mama{
	void genderMather();
}

class Baby implements Papa, Mama{
	public void genderMather() {
		System.out.println("우리 엄마입니다.");
	}
	public void genderFather() {
		System.out.println("우리 아빠입니다.");
	}
	void printInfo() {
		System.out.println("우리 엄마입니다.");
	}
}

public class Example06 {
	
	public static void main(String[] args) {
		
		Baby ob = new Baby();
		ob.genderFather();
		ob.genderMather();
		ob.printInfo();
	}
}
