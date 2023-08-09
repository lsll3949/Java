package step04;

public class step04_02 {

	public static int total(int toeic, int it) {
		toeic = 100;
		return (toeic +it);
	}
	
	public static String res(int tot) {
		if(tot >= 800)
			return "합격";
		else
			return "불합격";
	}
	
	public static void main(String[] args) {
		int toeic = 750, it =65;
		
		//함수전 toeic 출력
		System.out.println("toeic : " + toeic);
		System.out.println("입사총점 : " + total(toeic, it) + "점");
		System.out.println("입사총점 : " + res(total(toeic, it)) + "입니다.");
		
		//함수전 toeic 출력
		System.out.println("toeic : " + toeic);
	}

}
