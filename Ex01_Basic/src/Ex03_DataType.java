
/*
 * 1. 자바는 시스템이 제공하는 (미리 만들어진) 기본적인 8가지 타입(자료형)을 제공한다.
 * 2. 이 8가지 기본타입은 값을 저장하는 타입이다.
 * 3. 숫자  -> 정수  -> (음의 정수, 0, 양의 정수) -> byte(-128~127)
 * 									   -> char(한 문자2byte를 표현하는 타입)
 * 										>>한 문자(2byte) >> 한글 1자(2byte)
 * 													 >> 영문자, 특수, 공백(1byte)
 * 													 >> 국가간 협의 unicode
 * 													 >> char(한글, 영문자, 특수, 공백 상관없이 한 글자로 표현하자)
 * 										-> short (c 언어 호환성 : 2byte)
 * 										-> int (-21억 ~ 21djr : 4byte) **Java 정수 연산 기본 타입**
 * 										-> long (8byte)
 * 			 실수(부동소수점) -> float(4byte), double(8byte)
 * 			>>정밀도가 높다 (표현범위가 크다) >> double **Java 실수 연산 기본타입**
 * 	  논리 -> 참, 거짓 -> boolean(전원, 토글 등에 쓰인다) >> 프로그램의 논리적 흐름제어에 사용된다.
 * 
 * **궁금한점 : 문장을 표현하는 타입은 무엇인가? "푸딩", "Hello"
 * 	String은 사실 클래스(참조타입)이다. >> 그래서 원래는 String s = new String("푸딩"); 이렇게 써야한다.
 * 	그럼에도 불구하고 아무도 이렇게 쓰지 않는다.
 * 	선생님이 이야기하기 전까지는 String을 그냥 문자열을 저장하는 타입으로 생각해라!
 * 	==================이 내용은 그냥 잊기.======================
 * 
 * 
 * 
 * 자바는 크게 값타입과 참조타입으로 나눠진다.
 * 1.값타입 > 숫자, 논리 8가지 > value type
 * 2.참조타입 > 클래스, 배열 > 변수에 값이 저장되는 것이 아니라 주소값(참조값)이 저장된다. > ref type
 * 
 * 
 * @@@@@@@@@@@중요!@@@@@@@@@@@@@@@@
 * 		class == 설계도 == Type
 * @@@@@@@@@@@@@@@@@@@@@@@@@@@@@
 * 
 * 
 * 
 * 
 * */
class Car {// Car는 type이다. Car는 설계도이다. 이것을 이용하여 구체화된 산물을 만들어야 한다. = 메모리에 객체화
			// 해야한다.
	String color;
	int window;
}

public class Ex03_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "푸딩";
		int age = 100;

		Car c; // 지역변수를 선언만 했다.
		// System.out.println(c); 지역변수를 초기화하지 않았기 때문에 사용할 수 없다.
		// c라는 변수의 초기화(주소를 가져오기)는
		c = new Car(); // 초기화
		System.out.println(c);

		// 선언과 초기화 동시에 하기
		Car c2 = new Car();
		System.out.println(c == c2);
		System.out.println(c2);
		c2.window = 100;
		c2.color = "blue";

		int i = 10; // 선언과 할당

		int j; // 선언과
		j = 20; // 할당을 분리

		int k;
		k = j;
		System.out.println("k : " + k);
		k = 300;
		System.out.println("k : " + k);

		// int i = 200; //똑같은 변수 이름은 같은 지역(함수) 안에서 존재할 수 없다.

		// int p, g, q; // 이렇게 할 거면 Array를 사용하는게 낫다. int[] arr = new int[3]; >>
		// arr[0], arr[1]...

		// int(-21억 ~ 21억)
		// @@@@Today Point@@@@ 외워라
		// literal : 있는 그대로(literally), 자체 그대로, 일반적인 상식에서 있는 그대로 읽는 것
		// 정수 리터럴 : 100000000000 : 자바의 정수 리터럴값은 int가 default이다.
		// 문자 리터럴 : A
		// int p = 100000000000; //The literal 100000000000 of type int is out
		// of range.
		// int p = 100000000;
		// 백억이 이미 int의 범위를 벗어나기 때문에 변수를 지정(할당)하기 전 숫자를 입력하기만 해도 에러가 난다.(자바의 정수
		// 리터럴 값은 int가 default)
		long num2 = 100;
		// long num3 = 10000000000; //long인데도 에러가 난다. The literal 10000000000 of
		// type int is out of range. 타입은 바뀌었지만 위와 같은 에러
		long num4 = 10000000000L; // 마지막에 L을 붙여서 자바에게 long타입의 범위에 들어가는 정수임을
									// 알려준다.(대소문자 상관 없음)
		System.out.println(num4);

		// int p = 10000000000l; //Type mismatch: cannot convert from long to
		// int. 이런 에러가 떠야 타입의 문제이다.

		// char : 2byte(정수값)
		// 한 문자를 표현하는 자료형(데이터타입)
		// 일반적 : 1.한글 1자 2byte / 2. 영문자, 특수문자 , 공백 1byte
		// unicode 체제 : 한글, 영문 모두 2byte 취급
		// char 한 글자를 받는다.

		// @@@@Today Point@@@@ 외워라
		// 문자열 : "가", "hello" >> String str = "가나다라마"
		// 문자 : '가', 'A' >> char ch = 'A'

		char single = '가';
		System.out.println(single);
		char ch = 'A';
		System.out.println(ch);
		// char는 문자를 저장하지만 내부적인 값은 정수값을 가지고 있다.(ascii code 기준)
		// casting (타입변환)
		int intch = 'A'; // 자동 혹은 내부적으로 암시적, 자동으로 형변환 된 것.
		System.out.println(intch); // intch : 65

		System.out.println((int) ch); // type casting : 65
		// 캐릭터와 정수는 호환가능하다.
		// 작은 타입의 값을 큰 타입으로 바꿀 때에는 암시적 형변환이 이루어진다.
		// 큰 타입을 작은 타입으로 바꿀 때에는 명시적 형변환casting을 해줘야 한다.

		char ch2 = 'a';
		System.out.println(ch2);
		System.out.println((int) ch2);

		int intch2 = 65;
		char ch3 = (char) intch2; // 속지말자 [값을 보지 말고 값이 가지는 타입을 보자]
		// 강제적 형변환, 명시적 형변환
		// %%%%%%%%%%%Key Point%%%%%%제일 중요함%%%%%%%%%%%%
		// 65라는 숫자가 char타입 안에 속하는 데이터이기 때문에 손실 발생 없이 할당이 가능하다.
		// 큰것을 작은 것으로 바꿀때에는 크기가 맞지 않으니 형 변환을 통해서 작업을 해야한다. 대신 손실은 감수해야 한다. (강제적,
		// 명시적 형변환)

		int intch3 = ch3; // 작은 것을 큰 것으로 바꿀 때에는 컴파일러가 자동으로 형변환을 해준다(암시적 형변환)
		// int intch3 = (int)ch3; >컴파일러가 자동으로 해줘서 생략되는 부분
		System.out.println(intch3);

		// @@@@@@@@@@@@@Today point@@@@@@@@@@@@@@@@@
		// 1. 할당에서 변수가 가지고있는 값을 보지 말고 변수의 타입을 보자! 정수 리터럴의 기본은 int 타입이다.
		// 2. 변수의 타입 크기를 확인하자!
		// 3. 큰 타입에는 작은 타입을 넣을 수 있다.
		// 4. 실제 값이 작더라도, 작은타입에는 큰 타입 값을 넣을 수 없다.(명시적 형변환, casting 필요함)
		// int -> char로 변환(불가능) >>>> char <- (char)int : 명시적 형변환, 강제적 형변환
		// char -> int 변환(가능) >>>> int <- char 실행에 문제없음 >>>> 내부적으로 컴파일러가 int <-
		// (int)char 로 변환해준다.

		// 작은 타입에 담을 수 없는 값을 강제로 변환하면 손실값 또는 쓰레기 값이 발생.
		// int intValue = 10165468;
		// System.out.println("intValue : " + intValue);
		// byte byteValue = (byte)intValue;
		// System.out.println("byteValue : " + byteValue);

		// 만약 강제 변환하는 값이 작은 타입에 담을 수 있는 크기면 그대로 변환이 된다.
		int intValue = 101;
		System.out.println("intValue : " + intValue);
		byte byteValue = (byte) intValue;
		System.out.println("byteValue : " + byteValue);

		// String(문자열) 타입으로 보자
		String name = "푸딩";
		System.out.println(name);

		String name2 = name + "이 귀여워 !!"; // java에서는 +가 산술도 하고 결합도 한다.
		System.out.println(name2);
		// DB(oracle에서 + 연산자는 산술연살에만 쓰인다., ||가 결합연산자 이다.) 데이터베이스도 문자를 표현할 수 있다.
		// 'hello world' || '월요일'

		// Tip) java에서 특수문자 사용하기
		// 특수한 문자를 인지하기 위해서 : \를 사용한다.
		char sing = '\''; // \뒤의 '는 문자데이터라고 알려주는 의미이다. \는 해당 특수문자 앞마다 붙여줘야 한다.
		System.out.println(sing);

		// 홍"길"동 이라는 문자를 string 변수에 저장하고 화면에 출력해보자!

		String test = "홍\"길\"동";
		System.out.println(test);

		String str3 = "1000";
		String str4 = "10";

		String result = str3 + str4;
		System.out.println(result); // 단위로 읽지 말고 그냥 일공공공일공 으로 읽으래.............

		// 숫자와 문자의 결합은 문자열이다 !!
		System.out.println(100 + (100 + "100")); // 100 +(100100) 숫자 +문자열

		String path = "c:\\temp"; // \t는 tap키를 의미한다. \n은 new line, 즉 enter를
									// 의미한다.
		System.out.println(path);

		
//		실수(부동소수점) : 떠다니는 점
//		float(4byte)
//		double(8byte) : **실수 리터럴의 default 값은 double이다.
		
//		float f = 3.14; // 3.14라는 값은 double타입의 그릇 안에 들어있다. 
//		double타입을 float에 할당하려고 해서 생긴 에러.
		float f = 3.14f; //접미사 f,F 를 붙여주면 float타입으로 인식한다.
//		컴파일러가 제시하는 에러 해결방한 두 개
//		float f = (float) 3.14;
//		double f = 3.14;
		
		float f2 = 1.123456789f; 
		System.out.println("f2: " + f2); //f2: 1.1234568
//		반올림 처리가 default(대략 소숫점 이하 7자리를 확보한다.)
		
		double d = 1.123456789123456789; //double은 대략 소숫점 이하 16자리를 확보.
		System.out.println("d: " + d); //d: 1.1234567891234568 반올림 처리됨.
			
		
		
		//Quiz
		byte q = (byte)128; //정수 리터럴의 default는 int타입.
		System.out.println("q: " + q); //-128
//		byte는 -128~127까지의 표현범위를 갖는다.
//		byte는 overflow가 되면 순환한다. q에 129값을 넣으면 -127이 결과값으로 나온다.
		
//		double d2 = 100; // 암시적 형변환이 일어나있다.
		double d2 = (double)100; //생략된 부분을 직접 입력하면 이런 형식이다.
		System.out.println("d2: " + d2); //100.0
		
		double d3 = 100;
		int i5 = 100;
		
//		int result2 = d3 + i5; //에러가 나지 않게 하려면 어떻게 바꿔야 할까?
		
		//데이터 손실이 발생하지 않는 방법. 
		//다른 타입간의 연산은 무조건 큰타입에 맞춰서 하는 것이 데이터 손실이 없고 경제적이다.
		double result2 = d3 + i5; //암시적 형변환. 
//		double result3 = d3 + (double)i5; //암시적 형변환을 직접 입력
		
		//데이터 손실이 발생할 수 있는 방법. 
//		프로그램상으론 문제가 없지만 틀린 답이 나온다.
//		int result4 = (int)d3 + i5; // 큰 타입을 작은타입으로 명시적 형변환
//		int result5 = (int)(d3 + i5); //내가 생각 못했던 방법
		
		
//		@@@@@@@@@@@Today Point@@@@@@@@@@
//		작은타입 + 큰타입 >> 큰타입
//		타입간의 변환 >> 변수가 가지는 값을 보지 말고 변수의 타입을 보고 판단하자.
//		명시적 형변환(casting) (타입)
		
		
		int i6 = 100;
		byte b2 = (byte)i6; // 명시적 형 변환
		System.out.println(b2);
		
		byte b3 = 20;
		int i7 = b3;
		//컴파일러가 내부적으로 (int)b3 생성 // 암시적 형변환
		
		
		
		
	}

}
