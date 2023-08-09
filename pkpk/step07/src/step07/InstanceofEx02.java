package step07;

abstract class Employee{
	private String name;
	int salary;
	
	public Employee() {
		super();
	}	
	public Employee(String name, int salary) {
		super();
		this.name=name;
		this.salary=salary;
	}
	abstract public int getBonus();
	
	public String toString() {
		return name+"\t"+salary;
	}
}

//엔지니어---------------------------------------
class Engineer extends Employee {
	public Engineer() {
		super();
	}
	
	public Engineer(String name, int salary) {
		super(name, salary);
	}
	
	public int getBonus() { // 정규보너스
		return 150000;
	}
}

//개발자-----------------------------
class Developer extends Employee {
	public Developer() {
		super();
	}
	
	public Developer(String name, int salary) {
		super(name, salary);
	}
	
	public int getBonus() { // 정규보너스
		return 100000;
	}
	public String toString() {
		return super.toString()+"\t"+getBonus();
	}
}

public class InstanceofEx02 {

	public static void main(String[] args) {
		Employee[] em = {new Engineer("김", 1200000),
				new Engineer("이정화", 7000000),
				new Engineer("홍길동", 1200000),
				new Engineer("최영", 1200000),
				new Engineer("박", 1200000),
				new Engineer("윤", 1200000),
				new Engineer("최", 1200000)				
		};
		
		//Engineer는 급여의 13%
		//Developer는 급여의 15%를 특별보너스로 지급
		System.out.println("이름\t급여\t정규보너스\t특별보너스");
		System.out.println("===============================");
		
		for(Employee ob : em) {
			if(ob instanceof Engineer)
				System.out.println(ob.toString() + "\t" + (int) ob.salary*+0.13);
			if(ob instanceof Developer)
				System.out.println(ob.toString() + "\t" + (int) ob.salary*+0.15);
		}
	}

}
