package step10;

import java.io.Serializable;

public class UserInfo implements Serializable { // 객체직렬화
	
	private String name;
	private int age;
	private double score;
	
	public UserInfo() {
		super();
	}
	
	public UserInfo(String name, int age, double score) {
		super();
		this.age = age;
		this.name = name;
		this.score = score;
		
	}
	
	public void pln() {
		System.out.print("이름 : " + name);
		System.out.print("\t나이 : " + age);
		System.out.println("\t점수 : " + score);
	}

}
