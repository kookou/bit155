import java.util.Scanner;

/*
 *간단한 사칙 연산기(+ , - , * , /)
입력값 3개 (입력값은 nextLine() 받아서 필요하다면 숫자 변환)
목적: Integer.parseInt(), **equals()활용**
화면

>입력값 : 숫자
>입력값(기호) : +
>입력값 : 숫자
>연산결과 : 200
 
 */
public class Ex08_Operation_Quiz {

	public static void main(String[] args) {
/*		Scanner s = new Scanner(System.in);
		System.out.println("*사칙연산기*");
		System.out.println("숫자를 입력하세요");
		int num1 = Integer.parseInt(s.nextLine());
		
		System.out.println("사칙 기호를 입력하세요");
		String nums = s.nextLine();
		if (!nums.equals("+") && !nums.equals("-") && !nums.equals("*") && !nums.equals("/")){
			
		}
		
		System.out.println("숫자를 입력하세요");
		int num2 = Integer.parseInt(s.nextLine());			
		
		if (nums.equals("+")){
			System.out.println("연산결과는 :" + (num1 + num2) +  "입니다.");
		}else if (nums.equals("-")){
			System.out.println("연산결과는 :" + (num1 - num2) +  "입니다.");			
		}else if (nums.equals("*")){
			System.out.println("연산결과는 :" + (num1 * num2) +  "입니다.");			
		}else if (nums.equals("/")) {
			System.out.println("연산결과는 :" + (num1 / num2) +  "입니다.");
		}else {
			System.out.println("잘못 입력 하셨습니다.");
		}
		*/
		
		String opr=""; //문자열 초기화
		int input_1=0;
		int input_2=0;
		int result=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자입력 : ");
		input_1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("연산기호(+,-,/,*):  ");
		opr = sc.nextLine();
		
		System.out.println("숫자입력 : ");
		input_2 = Integer.parseInt(sc.nextLine());
		
		if(opr.equals("+")){ //POINT 문자열의 비교는 == 아니고 , equals (String)
			result = input_1 + input_2;
			
		}else if(opr.equals("-")) {
			result = input_1 - input_2;
			
		}else if(opr.equals("*")) {
			result = input_1 * input_2;
			
		}else if(opr.equals("/")) {
			result = input_1 / input_2;
		}else {
			System.out.println ("지원하지 않는 연산자 입니다.");
			//key point (여기서는 main 함수)
			//return 키워드 : [함수단위]의 종결자 > main 함수 탈출 > 종료 (소속된 함수밖으로 나가는것)
			return;
			
			//System.exit(0); //강제적인 프로그램 종료
		}
		System.out.printf ("[%d %s %d = %d]", input_1,opr,input_2,result);
		
		
		
		
		
		
	}

}
