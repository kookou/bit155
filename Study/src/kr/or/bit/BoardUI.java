package kr.or.bit;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardUI{
	private Scanner sc = new Scanner(System.in);
	private ArrayList<BoardVO> list; // list 라는 이름의 generic <BoardVO> class 타입의 ArrayList 생성
	private int no; //게시글 넘버를 담는 변수
	
	public int menu(){  //실행할 메뉴 번호 입력 받는 함수 
		System.out.println("***************");
		System.out.println("1. 전체 글 조회");
		System.out.println("2. 상세 글 조회");
		System.out.println("3. 글 등록하기 ");
		System.out.println("4. 글 수정하기");
		System.out.println("5. 글 삭제하기");
		System.out.println("0. 프로그램 종료");
		System.out.println("***************");
		
		System.out.println("실행할 메뉴 번호를 입력하세요 : ");
		return Integer.parseInt(sc.nextLine());
	}
	
	public void service(){  //호출할 함수를 담고있는 메소드
		while(true){
			switch(menu()){  
			case 1 : selectAll();
			break;
			case 2 : selectOne();
			break;
			case 3 : add();
			break;
			case 4 : update();
			break;
			case 5 : delete();
			break;
			case 0 : quit();
			break;
			}
		}
	}
	public BoardUI(){
		list = new ArrayList<>(); // 생성자로 arraylist 초기화
	}
	public void selectAll(){ //전체글 조회
		System.out.printf("전체[%d개]\n", list.size());  //list의 size 출력(arraylist는 배열의 갯수를 size로)
		System.out.println("-----------------------");
		System.out.println("번호\t글쓴이\t제목");
		System.out.println("-----------------------");
		for(int i = list.size()-1; i >=0; i--){  //최근에 등록된 게시글이 맨 위로 오게 정렬하기 위한 조건문
			System.out.printf("%d\t%s\t%s\n",list.get(i).getNo(),list.get(i).getWriter(),list.get(i).getTitle());
		}
		if(list.isEmpty()){ //arraylist 함수 (배열이 비어있니?)
			System.out.println("등록된 게시물이 없습니다");
		}
		System.out.println("-----------------------");
	}
	public void selectOne(){ //상세글 조회
		System.out.println("조회할 글 번호를 입력하세요 : ");
		int inputNum = Integer.parseInt(sc.nextLine());
		System.out.println("-----------------------");
		boolean flag = false;  // if 문 switch 역할
		for(int i = 0; i < list.size(); i++){ //배열의 size 만큼 for 문을 돌린다
			BoardVO vo = list.get(i);    // list 로 가져온 i 값을 BoardVO타입의 vo 변수에 할당(예쁜 코드를 위해)
			if(inputNum == vo.getNo()){ //inputNum 으로 입력 받은 값이 list 의 No 값과 같으면 
				flag = true; //flag 값을 true 로 바꿔준다
				System.out.println("글번호 : " + vo.getNo());
				System.out.println("글쓴이 : " + vo.getWriter());
				System.out.println("글제목 : " + vo.getTitle());
				System.out.println("글내용 : " + vo.getContent());
				return;
			}
		}
		if(flag == false){  //만약 for문안의 if 문을 안타면(조건이 맞지 않으면 ) flag 는 그대로 false이기 때문에 if 문 실행 
			System.out.println("입력된 번호는 존재하지 않습니다.");
		}
		System.out.println("-----------------------");
	}
	public void add(){ //글등록
		BoardVO vo = new BoardVO(); //BoardVO type의 vo객체 생성
		System.out.println("글쓴이를 입력하세요 : ");
		vo.setWriter(sc.nextLine());            //vo객체의 setWriter함수로 입력받은 값을 setting
		System.out.println("제목을 입력하세요 : ");
		vo.setTitle(sc.nextLine());
		System.out.println("내용을 입력하세요 : ");
		vo.setContent(sc.nextLine());
		vo.setNo(++no);                        //전치증가 ++ 한뒤에 할당
		
		list.add(vo); //setting 한 값을 arrayList 배열에 담는다. 
		System.out.println("게시글 등록이 완료 되었습니다.");
	}
	public void update(){ //글수정
		System.out.println("수정할 글 번호를 입력하세요");
		int inputNum = Integer.parseInt(sc.nextLine());
		
		boolean flag = false;
		for(int i = 0; i <list.size(); i++){
			if(inputNum == list.get(i).getNo()){
				flag = true;
				System.out.println("수정할 제목을 입력하세요 : ");
				list.get(i).setTitle(sc.nextLine());
				System.out.println("수정할 내용을 입력하세요 : ");
				list.get(i).setContent(sc.nextLine());
				return;
			}
		}
		if(flag == false){
			System.out.println("입력한 글번호는 존재하지 않습니다.");
		}
		System.out.println("수정이 완료 되었습니다.");
	}
	public void delete(){ //글삭제
		System.out.println("삭제할 글 번호를 입력하세요 : ");
		int inputNum = Integer.parseInt(sc.nextLine());
		boolean flag = false;
		
		for(int i = 0; i <list.size(); i++){
			if(inputNum == list.get(i).getNo()){
				flag = true;
				list.remove(i);
				break;
			}
		}if(flag == false){
			System.out.println("입력하신 번호는 존재하지 않습니다.");
			return;
		}
		System.out.println("게시글이 삭제 되었습니다.");
	}
	public void quit(){ //프로그램 종료
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

	
}