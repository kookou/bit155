import java.util.Scanner;

public class Ex06_Operation {
	public static void main(String[] args) {
		int sum = 0;
		// 대입연산자 : +=, -=, *=, ...
		// sum = sum + 1;
		sum += 1;
		// sum = sum -1;
		sum -= 1;
		System.out.println("sum: " + sum);

		// 간단한 학점 계산기를 만들어보자!
		// 학점 : A+, A-, B+, B- ...F
		// 데이터 점수 : 94점

		// 판단기준 : 90점 이상이면 A
		// 그런데 95점 이상이면 A+
		// 아니면 A-

		int score = 65;
		String grade = ""; // 문자열의 초기화
		System.out.println("당신의 점수는: " + score + " 입니다.");

		// 내가 푼 내용
		// if(score >= 90) {
		// grade = "A";
		// grade = (score >= 95) ? grade+"+" : grade+"-";
		// }else if(score >= 80) {
		// grade = "B";
		// grade = (score >= 85) ? (grade+="+") : (grade+="-"); //대입연산자를 쓰려면 괄호로
		// 우선순위를 표시해줘야한다.
		// }else if(score >= 70){
		// grade = "C";
		// grade = (score >= 75) ? grade+"+" : grade+"-";
		// }else if(score >= 60){
		// grade = "D";
		// grade = (score >= 65) ? grade+"+" : grade+"-";
		// }else{
		// grade = "F";
		// }

		// 선생님 판서 내용
		// 선생님의 원래 의도는 대입연산자를 쓰는 연습용으로 내주신 문제
		if (score >= 90) {
			grade = "A";
			if (score >= 95) { // 중첩 if문. if문 안에 if문을 사용할 수 있다.
				grade += "+";
			} else {
				grade += "-";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else if (score >= 60) {
			grade = "D";
			if (score >= 65) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else {
			grade = "F";
		}

		System.out.println("당신의 등급은: " + grade + " 입니다.");

		
		//단축키
		// syso + Ctrl + Space > System.out.println();
//		Ctrl + Shift + F > 소스 자동정렬

		
		int data = 95;
		switch(data){
		case 100 : System.out.println("100 입니다.");
			break; //논리적 흐름을 멈취고 switch를 벗어나라
		case 90 :  System.out.println("90 입니다.");
			break;
		case 80 :  System.out.println("80 입니다.");
			break;
		default :  System.out.println("default");
		}
//		switch문의 구조 외우기 !! 종이시험보려면 외워야한다.
//		break는 필수요소가 아니다. 필요에 따라 사용하면 된다.
//		break가 존재하지 않으면 조건을 만족하는 그 이후부터 모두 실행된다.
		
		data = 80;
		switch(data){
		case 100 : System.out.println("100 입니다.");		
		case 90 :  System.out.println("90 입니다.");	
		case 80 :  System.out.println("80 입니다.");
		default :  System.out.println("default");
		}
		
		int month = 2;
		String res = "";
		switch (month){
			case 1 : ;
			case 3 : ;
			case 5 : ;
			case 7 : ;
			case 8 : ;
			case 10 : ;
			case 12 : res = "31";
				break;
		
			case 4 : ;
			case 6 : ;
			case 9 : ;
			case 11 : res = "30";
				break;
		
			case 2 : res = "29";
				break;
			default : res = "월 데이터가 아닙니다.";
		}
		System.out.println(month + "월의 일 수는 " + res +"일 입니다.");
		
//		난수 (랜덤값 : 임의의 추출값)
		
//		https://docs.oracle.com/javase/8/docs/api/index.html
//		검색
//		java.lang.Math (Math 클래스)
//		Math.Random() 함수 : 호출에 의해서만 실행됨	
//		java 페이지에서 default로 열어놓은 폴더가 있다. (java.lang 폴더)
//		import java.lang.* 의 내용이 생략되어있는 것과 마찬가지다.
//		따라서 함수를 사용 할 때 일일히 원칙적으로 접근하지 않아도 된다.
//		kr.or.bit.Emp //원칙적인 접근방법	
//		Math.random();
//		static : 객체를 생성하지 않아도 사용 가능한 함수
//		greater than or equal to 0.0 and less than 1.0.
//		결과는 double타입의 실수값을 리턴하는데 0.0<= random < 1.0
		
//		random을 사용하여 추첨프로그램을 만들 수 있다.
		System.out.println("Math.random() : " + Math.random());
//		random값은 double이 표현할 수 있는 범위 내에서 나온다.
//		난수는 동일한 값이 나올 수 도 있다.

		System.out.println("Math.random()*10 : " + Math.random() * 10);
//		난수의 범위 : 0.0부터 10.0미만의 실수
		System.out.println("(int)(Math.random()*10) : " + (int)(Math.random() * 10));
//		난수의 범위 : 0이상 10미만의 정수
		System.out.println("((int)(Math.random()*10))+1 : " + ((int)(Math.random() * 10)+1));
//		난수의 범위 : 1이상 10이하의 정수
		
		
		
//		백화점 경품 시스템 만들기
		
//		int dScore = (int)((Math.random() * 10)+1)*100;
//		String gift = "";		
//		switch(dScore) {
//		case 1000 : gift = "TV, 노트북, 냉장고, 한우세트, 휴지";
//			break;
//		case 900 : gift = "노트북, 냉장고, 한우세트, 휴지";
//			break;
//		case 800 : gift = "냉장고, 한우세트, 휴지";
//			break;
//		case 700 : gift = "한우세트, 휴지";
//			break;
//		case 600 : gift = "휴지";
//			break;
//		default : gift = "칫솔";
//		}
//		System.out.println("고객님의 점수는 " + dScore + "점 입니다!\n" + gift + "에 당첨되셨습니다!");
//		
		
//		int dScore = (int)((Math.random() * 10)+1)*100;
//		String gift = "";
//		if (dScore == 1000) {
//			gift = "TV, 노트북, 냉장고, 한우세트, 휴지";
//		} else if (dScore == 900) {
//			gift = "노트북, 냉장고, 한우세트, 휴지";
//		} else if (dScore == 800){
//			gift = "냉장고, 한우세트, 휴지";
//		} else if (dScore == 700) {
//			gift = "한우세트, 휴지";
//		} else if (dScore == 600) {
//			gift = "휴지";
//		} else {
//			gift = "칫솔";
//		}
//		System.out.println("고객님의 점수는 " + dScore + "점 입니다!\n" + gift + "에 당첨되셨습니다!");
//	
//		
		int dScore = (int)((Math.random() * 10)+1)*100;
		String msg = ""; //초기화
		msg = "고객님의 점수는 " + dScore + "점 입니다!\n" + "상품 : ";
		switch(dScore) {
			case 1000 : msg += "TV "; //내가 놓친 부분 : break를 사용하지 않아도 된다. 사용하지 않는 편이 더 효율적이다. 상품은 전체 목록에서 하나씩 빠지는 순서이다.
			case 900 : msg += "노트북 ";
			case 800 : msg += "냉장고 ";
			case 700 : msg += "한우세트 ";
			case 600 : msg += "휴지";
			break;
			default : msg += "칫솔";
		}
		System.out.println(msg);
		
		
	
	}
}

//			20200220 오늘의 수업 내용
//			참조타입^, 연산자(증감^, 대입^, 논리, 비트계산(2진수), 삼항연산자),
//			제어문(if^, while^, for^(for문 밖에 변수를 선언하고 for문에서 초기화하는 경우 마지막 출력값), 
//			switch, 학점계산기^, 백화점 경품 추첨기^), 난수,
//			자바의 연산규칙




