package step10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExUserInfo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		UserInfo ob1 = new UserInfo("홍길동", 20, 90);
		UserInfo ob2 = new UserInfo("이정화", 30, 90);
		
		//직렬화
		
		try {FileOutputStream fos = new FileOutputStream("user.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		
			oos.writeObject(ob1);
			oos.writeObject(ob2);
		
			oos.close();
			System.out.println("저장성공");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//역직렬화
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.txt"));
		UserInfo ui1 = (UserInfo)ois.readObject();
		UserInfo ui2 = (UserInfo)ois.readObject();
		
		ui1.pln();
		ui2.pln();
		
		ois.close();
		
	}
	
	

}
