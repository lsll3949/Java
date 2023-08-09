package step05;

class BookShop{
	String bname, author; // 메서드 
	int price;
	
	public void setBook(String bname, String author, int price) {
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
	
	void viewBook() {
		System.out.println("책이름 : " + bname + "\n저자: " + author + "\n가격: " + price);
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
}

public class Test33 {

	public static void main(String[] args) {
		BookShop ob = new BookShop();
		ob.setBook("자바완성", "황완성", 25000);
		ob.viewBook();
		
		ob.setBname("JSP잡기");
		ob.setAuthor("송JP");
		ob.setPrice(3500);
		
		System.out.println("책이름 : " + ob.getBname());
		System.out.println("저자 : " + ob.getAuthor());
		System.out.println("가격 : " + ob.getPrice());
	}

}
