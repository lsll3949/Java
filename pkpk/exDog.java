package pkpk;

import step05.Dog;

public class exDog {

	public static void main(String[] args) {
		Dog ob = new Dog();
		ob.bowwow();
		
//		ob.breed = "요크셔테리어";
		ob.setBreed("요크셔테리어");
		System.out.println(ob.getBreed());
	}

}
