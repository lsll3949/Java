package step04;

public class ExCat {

	public static void main(String[] args) {
		// 객체 생성
		Cat catobj = new Cat();
		Cat catobj2 = new Cat();
		Cat catobj3 = new Cat("페르시안 고양이");
		System.out.println(catobj3.breed);
	}

}
