import kr.or.bit.Officetel;


public class Quiz_0228_do_while_op {

public static void main(String[] args) {
	    Officetel op = new Officetel();
		while(true){
			switch(op.displayOption()){
			case 1: 
				System.out.println("�⺻ �ɼ��� ���� �ϼ̽��ϴ�.");
			    op.print();
				break;
			case 2 :
				System.out.println("���� �߰��� ���� �ϼ̽��ϴ�.");
				op.furniture();				
				break; 
			case 3:
				System.out.println("������� �߰��� ���� �ϼ̽��ϴ�.");
				op.security();
				break;
			case 4: System.out.println("���α׷�����");
			    op.print();
			        System.exit(0);
				
			}
		}
	}

}



