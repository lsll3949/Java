package step05;

class UserInfo{
	private String name;
	private String addr;	
	
	public UserInfo() {
		System.out.println("*****주소록*****");
	}
	
	public UserInfo(String name, String addr) {
		 this.name = name;
		 this.addr = addr;
	}
	
	public String getName() {
		return name;		
	}

	public String getAddr() {
		return addr;
	}

}

public class constructorEx3 {
	public static void main(String[] args) {
		UserInfo uu = new UserInfo("우주소녀", "이대역");
		System.out.println("이름 : "+uu.getName());
		System.out.println("주소 : "+uu.getAddr());
	}
}
