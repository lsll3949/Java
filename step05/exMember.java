package step05;

import java.util.Scanner;

class Member{
	private String name;
	private int count = 0;
	
	public Member(String name) {
		super();
		this.name = name;
		setCount();
	}
	
	public void setCount(){
		count++;
	}
	
	public void pln() {
		System.out.println(name + " 고객의 방문 횟수 : " + count);
	}

	public String getName() {
		return name;
	}
	
	public int getCount() {
		return count;
	}
	
}

public class exMember {

	static int mCnt = 0;
	
	public static void main(String[] args) {
		Member[] cus = new Member[3];
		
		cus[mCnt++] = new Member("송동근");
		cus[0].pln();
		
		cus[mCnt++] = new Member("이정화");
		cus[1].pln();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("방문고객 이름은 ? ");
		String ir = sc.nextLine();
		
		int idx = -1;		
		boolean flag = false;
		
		for(int i = 0; i<mCnt; i++) {
			if(ir.equals(cus[i].getName())) {
				cus[i].setCount();
				idx=i;
				flag = true;
				break;
			}
		}		
		
		if(flag) {
			cus[idx].pln();
		}
		else {
			System.out.println("등록 하겠습니다");
			cus[mCnt++] = new Member(ir);
			cus[mCnt-1].pln();
		}
		
	}

}
