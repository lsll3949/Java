package step03;

import java.lang.ArrayIndexOutOfBoundsException;

public class ex1 {

	public static void main(String[] args) {
		int eno;
		String ename;
		char dept;
		double score;
		
		eno = Integer.parseInt(args[0]);
		ename = args[1];
		dept = args[2].charAt(0);
		score = Double.parseDouble(args[3]);
		
		System.out.printf("사원번호 : %d\n사원이름 : %s\n부서코드 : %c\n입사성적 :%.1f\n",
				eno, ename, dept, score);
		
	}

}
