package step04;

public class Array04 {

	public static void main(String[] args) {
		int rows = 2, columns = 3;
		int[][] firstMatrix = {{2,3,4},{3,2,1}};
		int[][] secondMatrix = {{1,2,3},{-4,-2,1}};
		
		int[][] sum = new int[firstMatrix.length][firstMatrix[0].length];
		for(int i = 0; i < firstMatrix.length; i++) {
			for(int j = 0; j < firstMatrix[0].length; j++) {
					sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
			}
		}
		System.out.println("두 행렬의 합: ");
		for(int i = 0; i < firstMatrix.length; i++) {
			for(int j = 0; j < firstMatrix[0].length; j++) {
				System.out.print(sum[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
