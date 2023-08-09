package step06;

import java.util.Scanner;

class ClubException extends Exception{
	String st; //
	ClubException(String st){
		this.st = st;
	}
	public String toString()
	{
		return st;
	}
}

public class step06_1 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int age = sc.nextInt();
			if(age < 20) {
				throw new ClubException("미자는 가라~~");
			}
			else
				System.out.println("내일은 불금. 클럽에 오신 걸 환영!!");
		}
		catch(ClubException c) {
			System.out.println(c.getMessage());
		}

	}

}
