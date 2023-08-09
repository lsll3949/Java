package step10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;

public class User implements Serializable{
	
	private static String name;
	private static int age;
	private static double tall;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String string = toString("이정화", 24, 155);
		
		
		//직렬화
		
		try {FileOutputStream fos = new FileOutputStream("user.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		
			ObjectOutputStream objectOutputStream;
		
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
	
	private static String toString(String string, int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void pln() throws FileNotFoundException {
		PrintStream printStream = new PrintStream("이정화");
		try {
			printStream.print("이름 : " + name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.print("\t나이 : " + age);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("\t키 : " + tall);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
