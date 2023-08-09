package step05;

public class AccessModifier01 {

	public static void main(String[] args) {
		
		Dog dogObj = new Dog();
		
		dogObj.breed = "포메라니안";
		dogObj.color = "갈색";
		
		System.out.println("강아지 품종: " + dogObj.breed);
		System.out.println("강아지 색상: " + dogObj.color);
		
		dogObj.bowwow();
//		dogObj.name="홍길동";
		dogObj.setName("김유신");
		System.out.println(dogObj.getName());
		dogObj.age=10;
	}

}