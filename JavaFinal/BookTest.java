class Book {
	private String title;
	
	public Book(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "제목=" + title;
	}
}
class Novel extends Book {
	private String author;
	private String genre;
		
	public Novel(String title, String author, String genre) {
		super(title);
		this.author = author;
		this.genre = genre;
	}
	public String toString() {
		return "소설: " + super.toString() + ", 저자=" + author + ", 장르=" + genre;
	}
}

class Magazine extends Book {
	private String publisher;
	private String volumeNumber;
	
	public Magazine(String title, String publisher, String volumeNumber) {
		super(title);
		this.publisher = publisher;
		this.volumeNumber = volumeNumber;
	}
	public String toString() {
		return "정기간행물: " + super.toString() + ", 출판사=" + publisher + ", 권호=" + volumeNumber;
	}
}
	
public class BookTest{
	public static void main(String[] args) {
		Book[] list = new Book[4];
		list[0] = new Novel("프로젝트 헤일메리", "앤디 위어", "SF"); //제목, 저자, 장르
		list[1] = new Novel("반지의 제왕", "존 톨킨", "판타지");
		list[2] = new Magazine("창작과 비평", "창비", "2021.여름"); //제목, 출판사, 권호수
		list[3] = new Novel("기타기타 사건부", "미야베 미유키", "추리");
			
		for (Book b: list)
			System.out.println(b);
		}
}

