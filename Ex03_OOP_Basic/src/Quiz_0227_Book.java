import kr.or.bit.Book;

public class Quiz_0227_Book {

	public static void main(String[] args) {
		
		Book b = new Book ("�ڹٴ� �����", "���� 30,000��");
		Book b2 = new Book ("�Ӹ��� ���Ŀ�", "���� 35,000��");
		
		System.out.println(b.getName());
		
		b.BookPname();
		b.BookPprice();
		b2.BookPname();
		b2.BookPprice();
		
		b.BookInfo();

	}

}
