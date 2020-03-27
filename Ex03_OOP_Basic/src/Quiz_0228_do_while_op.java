import kr.or.bit.Officetel;


public class Quiz_0228_do_while_op {

public static void main(String[] args) {
	    Officetel op = new Officetel();
		while(true){
			switch(op.displayOption()){
			case 1: 
				System.out.println("기본 옵션을 선택 하셨습니다.");
			    op.print();
				break;
			case 2 :
				System.out.println("가구 추가를 선택 하셨습니다.");
				op.furniture();				
				break; 
			case 3:
				System.out.println("보안장비 추가를 선택 하셨습니다.");
				op.security();
				break;
			case 4: System.out.println("프로그램종료");
			    op.print();
			        System.exit(0);
				
			}
		}
	}

}



