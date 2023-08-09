package step05;

public class test02 {

	public static void main(String[] args) {
		// 복사에 의한 전달
		int a1 = 10;
		int a2 = a1;
		
		a2 = 20;
		
		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);
		
		// 참조에 의한 전달
		String [] str1 = {"뽀로로", "패티", "파이리", "크롱"};
		String [] str2 = str1;
		
		str2[2]="sky";
		
		for(int i=0; i<str1.length; i++)
			System.out.print(str1[i]);
		System.out.println();
		
		for(int i=0; i<str2.length; i++)
			System.out.print(str2[i]);
		
	}

}
