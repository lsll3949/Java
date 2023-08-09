package step03;

public class ex4 {

	public static void main(String[] args) {
		for(int i = 0; i <= 100; i++) {
			if (i % 7 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}

}
