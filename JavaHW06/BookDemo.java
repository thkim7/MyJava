
public class BookDemo {
	public static void main(String[] args) {
		Book b1 = new Book("왕이 된 남자", "김선덕", 25000);
		Book b2 = new Book("자바프로그래밍", "양재형", 35000);
		b2.discountBy(15);
		
		System.out.println("책의 수: " + Book.getCount());
		b1.writeInfo();
		b2.writeInfo();
	}
}
