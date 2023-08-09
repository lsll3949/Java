package step10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UserOutputTest1 {

	static String name;
	static int age;
	static int tall;
	
	public UserOutputTest1() {
		super();
	}
	
	public UserOutputTest1(String name, int age, int tall) {
		super();
		this.age = age;
		this.name = name;
		this.tall = tall;
	}
	
	public static void main() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		UserInfo ob = new UserInfo("이정화", 30, 90);
		
		//직렬화
		
		try {FileOutputStream fos = new FileOutputStream("user.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		
			oos.writeObject(ob);
		
			oos.close();
			System.out.println("저장성공");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//역직렬화
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.txt"));
		UserInfo ui = (UserInfo)ois.readObject();
		
		ui.pln();
		
		ois.close();
	}

}
