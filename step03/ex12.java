package step03;

public class ex12 {
	public static int total(int x, int y, int z) {
		return(x+y+z);
	}
	
	public static double avg(int tot) {
		return tot/3.0;		
	}
	
	public static char grade(double av) {

		//점수에 대한 평가 : switch~case
		switch((int)(av/ 10)) {
		case 10:
		case 9:
			return 'A';
		case 8:
			return 'B';
		case 7:
			return 'C';
		case 6:
			return 'D';			
		default:
			return 'F';
		}	
	}
	
	public static String result(char gr) {
		if(gr=='F')
			return "불합격";
		else
			return "합격";
	}
	
	public static void main(String[] args) {
		
		int a=95, b=85, c=73;
		
		System.out.println("합계 : " + total(a, b, c));
		System.out.printf("평균 : %.2f점\n",avg(total(a, b, c)));
		System.out.println("평가 : " + grade(avg(total(a, b, c))));
		System.out.println("결과 : " + result(grade(avg(total(a, b, c)))));
		
		int d = 40, e = 50, f = 40;
		int sum = total(d,e,f);
		double u = avg(sum);
		char i = grade(u);
		String x = result(i);
		
		System.out.println("---------------------------");
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f점\n", u);
		System.out.println("평가 : " + i);
		System.out.println("결과 : " + x);
	}

}
