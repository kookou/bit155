import java.util.Scanner;

public class Ex08_Study {
	
public static void main(String [] args){
	String o = "";
	int num1 = 0;
	int num2 = 0;
	int fin = 0;
	Scanner s = new Scanner(System.in);
	
	System.out.println("���ڸ� �Է��ϼ���");
	num1 = Integer.parseInt(s.nextLine());
	
	System.out.println("��Ģ������ �Է��ϼ���");
	o = s.nextLine();
	
	System.out.println("���ڸ� �Է��ϼ���");
	num2 = Integer.parseInt(s.nextLine());
	
	if(o.equals("+")){
	   fin = num1+num2;		
	}else if (o.equals("-")){
		fin = num1-num2;
	}else if (o.equals("*")){
		fin = num1*num2;
	}else if (o.equals("/")){
		fin = num1/num2;
	}else {  //else���� ������ �� �ִ´�
		System.out.println("�߸��� �����ڸ� �Է��ϼ̽��ϴ�.");
		return;
	}
	System.out.printf ("[%d %s %d = %d]", num1,o,num2,fin);
	
	
	
   }	
}
