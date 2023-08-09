package step02;

public class Ex2 {

	public static void main(String[] args) {
		/*String[] color = {"red", "green", "blue"};
		for(int n=0; n > color.length; n++) {
			System.out.println(color[n]);
		}
		System.out.println();
		
		//for each문
		for(String str:color) 
			System.out.println(str);
	
	}*/
	
		// for-each 문 
		int []num = {101,102,103,104,105};
		int sum = 0;
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
		System.out.println("합 = " + sum);
			
		
		//for-each
		for(int a:num)
			sum += a;
}
	
}
