import kr.or.bit.Book;

public class Quiz_0227_Book {

	public static void main(String[] args) {
		
		Book b = new Book ("자바는 어려워", "정가 30,000원");
		Book b2 = new Book ("머리가 아파요", "정가 35,000원");
		
		System.out.println(b.getName());
		
		b.BookPname();
		b.BookPprice();
		b2.BookPname();
		b2.BookPprice();
		
		b.BookInfo();

	}

}
