package step06;

class MyException extends Exception{
	String str1;
	MyException(String str2){//3
		str1 = str2;
	}
	public String toString() { //* 예외처리 메세지
		return("Myexception 발생 : " + str1);
	}
}

public class step06 {
	public static void main(String args[]) {
		try {
			System.out.println("try블록입니다."); //1
			throw new MyException("class 호출됩니다."); //2. 강제 예외 발생
			}
		catch(MyException e){
			System.out.println("catch 블록입니다.");//4.
			System.out.println(e);//5. * 부분이 여기에서 예외처리 메세지로 출력됨
		}
}
}
