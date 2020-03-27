package kr.or.bit;

public class BoardVO{
	private int no; //게시글 생성 번호를 담는 변수
	private String writer;  //글쓴이
	private String title;   //글제목
	private String content; //글내용
	
	public int getNo(){    //글번호를 불러오는 함수
		return no;         //return type int 
	}
	public void setNo(int no){  // 글번호를 setting 하는 함수
		this.no = no;           //parameter로 받은 no 값을 class no에 할당
	}
	public String getWriter(){  //글쓴이를 불러오는 함수
		return writer;          //return type String
	}
	public void setWriter(String writer){ //글쓴이를 setting 하는 함수
		this.writer = writer;             //parameter 로 받은 writer 값을 class writer에 할당
	}
	public String getTitle(){   //글제목을 불러오는 함수
		return title;           //return type String
	}
	public void setTitle(String title){ //글제목을 setting 하는 함수
		this.title = title;             //parameter로 받은 title 값을 class title에 할당
	}
	public String getContent(){ //글내용을 불러오는 함수
		return content;         //return type String
	}
	public void setContent(String content){ //글내용을 setting 하는 함수
		this.content = content;             //parameter로 받은 content 값을 class content에 할당
	}
	
	
	
}