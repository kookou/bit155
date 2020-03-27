package kr.or.bit;
import java.util.ArrayList;
import java.util.Scanner;
public class BoardUI {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<BoardVO> list;
	private int no;
	
	public BoardUI(){
		list = new ArrayList<>();
	}
	
	public void service() {
		while(true) {
			switch(menu()) {
				case 1: selectAll();
					break;
				case 2: selectOne(); 
					break;
				case 3: add();
					break;
				case 4: update();
					break;
				case 5: delete();
					break;
				case 0: quit();
					break;
			}
		}
	}
	
	//게시글 수정
	public void update() {
		System.out.print("수정할 글 번호를 입력하세요: ");
		int inputNum = Integer.parseInt(sc.nextLine());
		
		//flag변수의 역할은? //
		boolean flag = false;
		for(int i = 0; i < list.size(); i++) {
			if(inputNum == list.get(i).getNo()) {
				flag = true;
				System.out.print("수정할 제목을 입력하세요: ");
				list.get(i).setTitle(sc.nextLine());
				System.out.print("수정할 내용을 입력하세요: ");
				list.get(i).setContent(sc.nextLine());
				return;
			}
		}
		
		if(flag == false) {
			System.out.println("입력한 글번호는 존재하지 않습니다.");
		} else {
			System.out.println("수정이 완료되었습니다.");
		}
		
	}
	
	//게시글 삭제
	public void delete() {
		System.out.print("삭제할 글 번호를 입력하세요: ");
		int inputNum = Integer.parseInt(sc.nextLine());
		boolean flag = false;
		
		for(int i = 0; i < list.size(); i++) {
			if(inputNum == list.get(i).getNo()) {
				flag = true;
				list.remove(i);
				break;
			}
		}
		if(flag == false) {
			System.out.println("입력하신 번호는 존재하지 않습니다.");
			return;
		}

		System.out.println("게시글이 삭제되었습니다.");
	}
	
	//상세글 조회
	public void selectOne() {
		System.out.print("조회할 글 번호를 입력하세요: ");
		int inputNum = Integer.parseInt(sc.nextLine());
		System.out.println("----------------------");
		boolean flag = false;
		for(int i = 0; i < list.size(); i++) {
			BoardVO vo = list.get(i);
			if(inputNum == vo.getNo()) {
				flag = true;
				System.out.println("글번호: " + vo.getNo());
				System.out.println("글쓴이: " + vo.getWriter());
				System.out.println("글제목: " + vo.getTitle());
				System.out.println("글내용: " + vo.getContent());
				return;
			}
		}
		if(flag == false) {
			System.out.println("입력된 번호는 존재하지 않습니다.");
		}
		System.out.println("----------------------");
	}
	
	//전체글 조회
	public void selectAll() {
		System.out.printf("전체 %d개\n", list.size());
		System.out.println("---------------------");
		System.out.println("번호\t글쓴이\t제목");
		System.out.println("---------------------");
		for(int i = list.size()-1; i >= 0; i--) {
			System.out.printf("%d\t%s\t%s\n", list.get(i).getNo(), list.get(i).getWriter(), list.get(i).getTitle());
		}
		if(list.isEmpty()) {
			System.out.println("등록된 게시물이 없습니다.");
		}
		System.out.println("---------------------");
	}
	
	//글등록 - 글번호,글쓴이,글제목,글내용 한셋트 = BoardVO
	public void add() {
		//BoardVo객체 생성을 해서 
		BoardVO vo = new BoardVO();
		
		//글쓴이, 제목, 내용, 번호를 셋팅해준다.
		System.out.print("글쓴이를 입력하세요: ");
		vo.setWriter(sc.nextLine());
		System.out.print("제목을 입력하세요: ");
		vo.setTitle(sc.nextLine());
		System.out.print("내용을 입력하세요: ");
		vo.setContent(sc.nextLine());
		vo.setNo(++no);
		
		//셋팅해준 내용을 배열에 담는다.
		list.add(vo);
		System.out.println("게시글 등록이 완료되었습니다.");
	}
	
	public void quit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
	
	public int menu() {
		System.out.println("-------------");
		System.out.println("1. 전체 글 조회");
		System.out.println("2. 상세 글 조회");
		System.out.println("3. 글 등록");
		System.out.println("4. 글 수정");
		System.out.println("5. 글 삭제");
		System.out.println("0. 종료");
		System.out.println("-------------");
		
		System.out.print("실행할 메뉴 번호를 입력하세요: ");
		return Integer.parseInt(sc.nextLine());
	}
}