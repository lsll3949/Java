package step04;

public class Example04 {

	public static void main(String[] args) {
		int myArr[][] = {{1, 2, 3, 4, 5},
							{6, 7, 8, 9, 10},
								{11, 12, 13, 14, 15}};
		for(int i=0; i<myArr.length; i++) {
			for(int j=0; j<myArr.length; j++)
				System.out.println(myArr[i][j] + " ");
			System.out.println();
		}
		
		System.out.println("myArr[0][1]값: " + myArr[0][1]);
	}

}
