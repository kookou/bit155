package Quiz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//도서 관리자 클래스

import java.util.HashMap;

import java.util.Scanner;
import java.util.Set;

public class BookManager {
	Scanner scan = new Scanner(System.in);
	HashMap<String, Book> book_dic = new HashMap<String, Book>();   //value 값으로 객체(Book) 를 가지고 있다.

	public void Run() {
		int key = 0;
		while ((key = selectMenu()) != 0) {
			switch (key) {
			case 1:
				addBook();
				break;
			case 2:
				removeBook();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				listBook();
				break;
			case 5:
				listISBN();
				break;
			case 6:
				saveBook();
				break;
			case 7:
				loadBook();
				break;
			
			default:
				System.out.println("잘못 선택하였습니다.");
				break;
			}
		}
		System.out.println("종료합니다...");
	}

	int selectMenu() {
		System.out.println("1:추가 2:삭제 3:검색 4:도서 목록 5:ISBN 목록 6:도서목록 저장 7:도서목록 불러오기 0:종료");
		int key = scan.nextInt();
		scan.nextLine();
		return key;
	}

	void addBook() {
		String isbn;
		System.out.print("추가할 도서 ISBN:");
		isbn = scan.nextLine();
		
		if (book_dic.containsKey(isbn)) {
			System.out.println("이미 존재하는 ISBN입니다.");
			return;
		}

		String title;
		int price;
		int no = 1;
		System.out.print("도서 제목:");
		title = scan.nextLine();
		System.out.print("가격:");
		price = scan.nextInt();
		scan.nextLine();
		Book book = new Book(isbn, title, price);
		book_dic.put(book.ISBN(),book);
		System.out.println(book.toString() + " 생성하였습니다.");
		book.setNo(no);
	}

	void removeBook() {
		String isbn;
		System.out.print("삭제할 도서 ISBN:");
		isbn = scan.nextLine();
		if (book_dic.containsKey(isbn)) {
			book_dic.remove(isbn);
			System.out.println("삭제하였습니다.");
		}
		else {
			System.out.println("존재하지 않습니다.");
		}
	}

	void searchBook() {
		String isbn;
		System.out.print("검색할 도서 ISBN:");
		isbn = scan.nextLine();
		if (book_dic.containsKey(isbn)) {
			Book book = book_dic.get(isbn);
			System.out.println("검색 결과>>" + book.toString());
		} else {
			System.out.println("존재하지 않습니다.");
		}
	}

	void listBook() {
		System.out.println("도서 목록");
		int cnt = book_dic.size();
		System.out.println("도서 수:" + cnt);
		for (Book book : book_dic.values()) {
			System.out.println(book.toString());
		}
	}
	void saveBook(){
		File file = new File("booklist.txt");
		FileOutputStream fos = null;
		BufferedOutputStream bis = null;
		ObjectOutputStream oos = null;
		
		
		try{
			fos = new FileOutputStream(file);
			bis = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bis); //map 객체를 직렬화 시켜서 저장
			oos.writeObject(book_dic);  //map 안에는 (key,value 1.new BMI, 2.new BMI, 3.new BMI) 
			
			oos.close();
			fos.close();
		}catch(Exception e){
			System.out.println("에러발생!!!");
			e.printStackTrace();
		}
		System.out.println("저장");
		
	}
	void loadBook(){
		File file = new File("booklist.txt");
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream oos = null;
		
		try{
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			oos = new ObjectInputStream(bis);
			book_dic = (HashMap)oos.readObject(); //map 타입으로 다운 캐스팅
			
			Set<String> set = book_dic.keySet();  //value 값 book_dic 객체 
			System.out.println("번호\tISBN\t도서제목\t가격");
			for (String number : set) {
				String title = book_dic.get(number).getTitle();
				int price = book_dic.get(number).getPrice();
				int no = book_dic.get(number).getNo();
				System.out.printf("[%s]\t%s\t%s\t%d\n",no,number, title, price);
			}
			oos.close();
			fis.close();
			
		}catch(Exception e){
			System.out.println("불러오는데 실패하였습니다.");
			e.printStackTrace();
		}
	}

	void listISBN() {
		System.out.println("ISBN 목록");
		int cnt = book_dic.size();
		System.out.println("도서 수:" + cnt);
		for (String isbn : book_dic.keySet()) {
			System.out.println(isbn);
		}
	}
}