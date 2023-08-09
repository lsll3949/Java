package step02;

public class If01 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		int sum = num1 + num2;
		
		System.out.printf("%d + %d = %d\n", num1, num2, sum);
	}
}

/*
 * throws NumberFormatException, IOException {
 * 
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
 * int age = Integer.parseInt(br.readLine());
 * 
 * if(age >= 19) { if(age < 30) { System.out.println("입장가능합니다"); } else {
 * System.out.println("국빈관으로 가세요"); } } else { System.out.println("더 크고 오세요"); }
 * }
 */

/*
 * System.out.println("3개의 숫자를 입력하세요.");
 * 
 * //Scanner s = new Scanner(System.in); //int x = s.nextInt(); //int y =
 * s.nextInt(); //int z = s.nextInt();
 * 
 * //if(x > y) { //if (x > z) { //System.out.println(x + "는 가장 큰 정수입니다."); //}
 * //else { //System.out.println(x + "는 가장 큰 정수가 아닙니다."); //} //} //1.if //else
 * { //System.out.println(x + "는 가장 큰 정수가 아닙니다."); //}
 */

/*
 * System.out.println("점수를 입력하세요.");
 * 
 * Scanner s = new Scanner(System.in); int num = s.nextInt();
 * 
 * switch(num/10) { case 10: case 9: System.out.println("A학점"); break; case 8:
 * System.out.println("B학점"); break; case 7: System.out.println("C학점"); break;
 * case 6: System.out.println("D학점"); break; default: System.out.println("F학점");
 * break; }
 */

/*public static void main(String[] args) throws NumberFormatException, IOException {

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int month = Integer.parseInt(br.readLine());

switch (month) {
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
	System.out.println("31일");
	break;
case 2:
	System.out.println("28일");
	break;
case 4:
case 6:
case 9:
case 11:
	System.out.println("30일");
	break;
default:
	System.out.println("1에서 12까지 입력하세요");
	break;
}
}*/

/*
 * public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());

		switch (number%2) {
		case 0:
			System.out.println(number + "짝수입니다.");
		case 1:
			System.out.println(number + "홀수입니다.");
		}
	}
	*/

/*//100, 97, 94, ....82
for(int i=100; i>80; i-=3)
	System.out.println(i + " ");

System.out.println();

//for문으로 알파벳을 출력
for(char ch = 'A'; ch<='Z'; ch++)
	System.out.println(ch + " ");

//for , switch 같이
//1-100 까지 합 출력
//1-100 가지 홀수 합출력
//1-100 가지 짝수 합출력
//for문은 1개만 사용

int sum = 0;
for(int i=1; i <= 100; i++) {
	sum += i;			
}
System.out.println(sum);*/

/*throws IOException {
int sum = 0;
int oddsum = 0;
int evensum = 0;

for (int i = 1; i <= 100; i++) {
	sum += i;
	switch (i % 2) {
	case 0: // 짝수 합
		evensum += i;
		break;
	case 1: //홀수 합
		oddsum += i;
		break;
	}
}
System.out.println(sum +" ");
System.out.println("짝수 합 = " + evensum);
System.out.println("홀수 합 = " + oddsum);
}*/