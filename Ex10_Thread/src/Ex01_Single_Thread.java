/*
 thread
 프로그램 안에서 동작할 수 있는 최소 동작 단위 
 프로그램 >> 프로세스 >> 스레드
 싱글 프로세스 : 싱글 스레드 (main)함수
 JVM : call Stack >> 함수 동작 
 현재 프로세스가 stack을 하나만 갖고 있기 때문에 함수가 10개라 하더라도 한번에 하나의 함수만 실행된다.
 [순차적 실행]
 
 
 
 */
public class Ex01_Single_Thread {

	public static void main(String[] args) {
		System.out.println("나 main 일꾼이야");  //1.stack 에서 출력 하고 빠진다.
		worker();//2.함수 호출
		worker2();//4. 함수호출
		System.out.println("main 일꾼 종료");
	}
	static void worker(){
		System.out.println("나 1번 일꾼이야");//3. 호출된 함수 출력하고 빠진다
	}
	static void worker2(){
		System.out.println("나 2번 일꾼이야");//5. 호출된 함수 출력하고 빠진다
	}

}
