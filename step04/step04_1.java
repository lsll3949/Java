package step04;

public class step04_1 {

	public static void main(String[] args) {
		
		int[] num = new int [3];
		
		num[0] = Integer.parseInt(args[0]);
		num[1] = Integer.parseInt(args[1]);
		num[2] = Integer.parseInt(args[2]);
		
		// 최대, 최소값
		int max = num[0];
		int min = num[0];
		
		for(int i = 1; i < num.length; i++) 
		{
			if(num[i] > max) max = num[i];
			if(num[i] < min) min = num[i];
		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}

}
