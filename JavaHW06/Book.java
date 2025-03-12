
public class Book {
	private String title;
	private String author;
	private int prize;
	private static int Count = 0;
	
	public Book(String title, String author, int prize) {
		this.title = title;
		this.author = author;
		this.prize = prize;
		Count++;
	}
	
	public void discountBy(int discount) {
		prize = (int)(prize * ((double)(100-discount)/100));
	}	
			
	public static int getCount() {
		return Count;
	}
		
	public void writeInfo() {
		System.out.println("제목: " + title + ", 저자: " + author + ", 가격: " + prize);
		}
	
	
}
