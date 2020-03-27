/*
1. Ex02_variable 은 클래스이다. = 설계도
2. public static void main(String[] args) 함수를 가지고 있는 클래스 : 프로그램의 시작점, 진입점
main함수를 가지는 클래스는 new를 사용할 필요가 없다.
*클래스의 종류는 2가지
- class Test {public static void main(String[] args)} : 코드 실행의 의도를 가진 클래스. 독자적으로 실행 가능.
- class Test {} : 독자적인 실행이 안된다. main 함수가 없는 클래스는 다른 클래스를 도와주는 클래스(lib)이다.

Tip)
C# > public static void Main()...
자바가 끝나는 시점에 서점에 가서 C#책을 보면 코드의 70%가 이해된다. C#도 객체지향 언어. 자바와 부모가 같다. 문법이 거의 같다. 상속, 캡슐화가 똑같다.


2020.02.19=================================================================

변수(variable) : 데이터를 담을 수 있는 공간의 이름
변수는 타입(공간의 크기, 자료형, 데이터타입)을 가진다. 공간 = 크기
데이터타입 변수명 = 값; int i = 200;

상수(constant) : 한번 정해지면 변하지 않는 값

변수가 선언되는 위치(scope : 유효범위)
변수는 클래스 안에 선언될 수 있다.
1. instance variable(객체변수) 
	class Person {int age}  : 변수의 범위는 클래스 안
	
2. local variable (지역변수 - 함수 안에 있는 변수)
	class Person {public void run(){int speed}}  : 변수의 범위는 run함수 안
	
3.함수 안에 if블럭 or for블럭 안에 있는 변수도 지역변수이다.(블럭 안에서만 유효하다)
	
4.static variable(공유변수, 공유자원, 객체간 공유자원)


*/
// class는 설계도이다. == class Type이다. (여러개의 작은 타입을 가지고 있는 큰 타입) 
class Test{
	int iv = 500; //instance variable
	//이 변수는 초기화하지 않아도 된다.(instance variable은 기본값 default값을 가지고 있다.)
	int window;
//	정수형 객체변수의 기본값은 0이다.
//	자바에서 초기화란 최초로 값을 할당 하는 것을 말한다.
//	window변수는 왜 초기화를 하지 않아도 사용가능할까? 
//	힌트! 설계도는 하나이다. 그리고 이 설계도를 기반으로 아파트를 여러개 지을 수 있다. 
//	그런데 그 아파트마다 창문의 갯수는 다를 수 있다.
//	답) 아파트(객체)마다 다른 값을 가질 수 있기 때문이다.
	
	Test(){  //함수의 이름과 클래스의 이름이 같은 함수를 생성자(constructor, 초기자)라고 부른다.
			//생성자는 따로 호출하지 않아도 아파트가 지어질 때 (객체가 생성과 동시에) 자동으로 호출된다.
		
	}
	
	Test(int data){ //오버로딩(overloading) : 하나의 이름으로 여러가지 기능을 수행
		window = data; //창문의 갯수를 초기화
	}
	
	
	void write(){
		int num = 100; // local variable
//		num이라는 지역변수는 함수가 호출되면 메모리에 생성되고 함수가 종료되면 메모리에서 사라진다.
//		1. window = 11 함수 안에서 인스턴스 변수를 초기화 할 수 있다.
		window = 111;
		
		int age = 0; //local variable
		System.out.println("age : " + age); //The local variable age may not have been initialized
//		지역변수는 강제로 초기화를 해줘야한다.
//		지역변수를 선언해도 사용하지 않으면 에러가 발생하지 않는다. 하지만 사용하려고하면 에러가 발생한다.
		
	}
	
	void print(){
		System.out.println("iv : " + iv);  //객체변수. 클래스 안에서는 사용 가능하다.
//		System.out.println("num : " + num); // 지역변수. write함수 밖을 벗어나면 사용할 수 없다.
	}
	
}


class Apt {
	int window; //아직 설계도만 있기 때문에 메모리에 올라가지 않은 상태.
}


public class Ex02_variable {

	public static void main(String[] args) { //main도 특수한 함수이다. : 진입점
		/*
		Test t = new Test();
		t.print();
		t.window = 10;
		System.out.println("t.window : " + t.window);
		
		Test t2 = new Test(100);
		System.out.println("t2.window : " + t2.window);
		
		Test t3 = new Test(2);
		System.out.println("t3.window : " + t3.window);
		t3.write();
		System.out.println("write 함수 호출한 후 t3.window : " + t3.window);
		
		*/
		
		
		
		
		
		int lv = 100; //local variable(지역변수 - main함수가 lv변수의 유효범위 scope이기 때문에 지역함수라고 부른다.)
//		데이터타입 변수명 = 값; (= : 할당연산자)
		System.out.println("lv 변수값 : " + lv);
//		Ex02_variable > javac 컴파일 > class > java > 실행 > JVM
//		이클립스가 위의 단계를 다 단축해준다.(컴파일 >>>실행) : Ctrl + F11

//		1. 지역변수는 반드시 초기화를 하고 사용해야 한다. (변수의 처음 값을 할당하는 것이 초기화)
//		2. 약속 (함수 안에 있는 변수는 반드시 초기화하자!) main도 함수이다.
		
		int number = 0; //선언과 초기화를 동시에
		number = 100;
		number = 200;
		System.out.println("덮어쓰여진 후 number : " + number);
		
//		선언과 할당(초기화)를 분리할 수 있다.
		int a; //선언만
		int b;
//		System.out.println(a); //이 위치에서 a를 사용하려고 하면 에러가 발생한다.
		a = 10; //초기화만
		b = 20;
		System.out.println(a); //이 위치에서는 초기화가 이루어졌기 때문에 에러가 발생하지 않는다.
		
		Apt ssung = new Apt(); 
		System.out.println(ssung.window);
		//이제 메모리에 올라간다. ssung은 변수이다. 모든 변수 앞에는 타입이 붙는다. 즉, Apt(클래스)도 타입이다. 작은 타입 여러개를 가지고 있는 큰 타입.
//		class타입은 stack의 main영역에 무조건 4byte의 크기를 할당받는다.
//		new 연산자를 사용하면 heap영역에 Apt를 위한 공간이 만들어지고 그 안에 window 변수 값이 0으로 할당됨. 그리고 Apt의 주소를 갖게된다.
				 
//		 heap영역은 프로그램이 종료되거나 stack영역의 마지막 함수가 끝나면 사라진다.

		
		Apt ppark = ssung; //ssung는 Apt의 주소값을 가지고 있다. 따라서 Apt의 주소값을 ppark에게 그대로 주는 것. 같은 아파트를 공유하게되는 것.
		ppark.window = 100;
		System.out.println(ssung.window);
		System.out.println(ppark); //Apt@15db9742  // 설계도이름 + @ + 주소값
//		주소값은 바뀔 수 있으므로 외울 필요는 없다.
//		값을 가진 변수는 출력하면 해당 값이 나오고 : 값타입 변수
//		주소값을 가진 변수를 출력하면 주소값이 나온다 : 레퍼런스 변수
		
		Apt oosan = new Apt(); //이렇게 하면 새로운 아파트를 하나 더 짓는 것이다.
		
		
		
		
	}

}

