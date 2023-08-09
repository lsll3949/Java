package step05;

class pizza{
	// 멤버 변수
	int r; // 반지름
	String name; // 피자이름 
	double area; // 면적
	
	// 메서드
	void setPizza(int radius, String name) {
		this.r = radius;
		this.name = name;
	}
	
	double getArea() { // 원의 면적
		return this.area = r*r*3.14;
	}
	
	String getName() { // 피자이름 반환
		return this.name; 
	}
	
	int getRadius(){ // 반지름 반환
		return this.r;
	}
	
	String getString() {
		return name; //"ㅇㅇㅇ의 면적은 xx.xx 이다 " 를 반환하는 메서드
		
	}
}
	
	public class exPizza {

		public static void main(String[] args) {
			pizza pz1 = new pizza();
			pz1.setPizza(0, null);
	
			int name = 0;
			System.out.println(getName() + " 피자명 : " + name); // 피자명 출력
			System.out.println(getArea()); // 반지름 출력
			System.out.println(getRadius()); // 면적 출력

		}

		private static char[] getRadius() {
			// TODO Auto-generated method stub
			return null;
		}

		private static char[] getArea() {
			// TODO Auto-generated method stub
			return null;
		}

		private static String getName() {
			// TODO Auto-generated method stub
			return null;
		}
	}
