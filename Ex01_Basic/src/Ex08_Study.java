import java.util.Scanner;

public class Ex08_Study {
	
public static void main(String [] args){
	String o = "";
	int num1 = 0;
	int num2 = 0;
	int fin = 0;
	Scanner s = new Scanner(System.in);
	
	System.out.println("숫자를 입력하세요");
	num1 = Integer.parseInt(s.nextLine());
	
	System.out.println("사칙연산을 입력하세요");
	o = s.nextLine();
	
	System.out.println("숫자를 입력하세요");
	num2 = Integer.parseInt(s.nextLine());
	
	if(o.equals("+")){
	   fin = num1+num2;		
	}else if (o.equals("-")){
		fin = num1-num2;
	}else if (o.equals("*")){
		fin = num1*num2;
	}else if (o.equals("/")){
		fin = num1/num2;
	}else {  //else에는 조건을 못 넣는다
		System.out.println("잘못된 연산자를 입력하셨습니다.");
		return;
	}
	System.out.printf ("[%d %s %d = %d]", num1,o,num2,fin);
	
	
	
   }	
}
