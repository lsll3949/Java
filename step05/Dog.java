package step05;

public class Dog {
	String breed; //디폴트 접근
	public String color;
	public String name;
	protected int age;
	
	public Dog(String breed, String color, String name, int age) {
		super();
		this.breed = breed;
		this.color = color;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", color=" + color + "]";
	}

	public Dog() {
		super();
	}
	
	public void bowwow() {
		name = "홍길동";
		System.out.println("멍멍 짖다");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
