/*
 Thread : 프로세스 에서 하나의 최소 실행 단위 (method)
 >>stack >>Multi >> Stack 여러개 ..
 Thread 생성하는 방법
 1. Thread 클래스를 상속 해서 만드는 방법 > class test extends Thread > 새로운 stack을 하나 할당 받는다
 반드시 Thread 가 가지고 있는 run() 함수를 구현 해야한다
 >> Thread 는 일반 클래스 >> 스스로 객체 생성이 가능
 2.class test extends Car implements Runnable  >> implements 하는 방법 > 실제론 thread 가 아니기 때문에 thread 객체를 만들어서 넣어줘야한다
 >> 일반 클래스가 thread 말고 다른 클래스를 상속 받고 있는 경우 
 
 */
class Thread_1 extends Thread{

	@Override
	public void run() { //run() 함수 는 main 함수와 동일한 역할 //새로운 stack 에 처음 올라가는 함수
	 for(int i = 0; i <1000; i++){
		 System.out.println("Thread_1 : " + i + this.getName()); //(getName) thread 가 가지고있는자원
	 }
	 System.out.println("Thread_1 run() END");
	}
	
}
class Thread_2 implements Runnable{ //thread 는 아니다  //run() 을 추상 자원으로 가지고 있다 (override 해야한다)
//class Thread_2 extends Object (생략)
	@Override
	public void run() {
		for(int i = 0; i <1000; i++){
			 System.out.println("Thread_1 : " + i); //(getName) thread 가 가지고있는자원
		 }
		 System.out.println("Thread_2 run() END");
		
	}
	
}

public class Ex02_Thread {

	public static void main(String[] args) {  //main도 하나의 thread 다
		//1번
		Thread_1 th = new Thread_1();
		th.start(); //POINT >> call stack 새로 생성하고 그 stack에 run()함수를 올려 놓기까지
		
		//2번
		Thread_2 th2 = new Thread_2();  // Thread 아님 interface만 구현한 class
		Thread thread = new Thread(th2);  // 독자적으로 객체를 생성 한후 interface를 구현한 class를 갖는다 (thread 객체의 생성자를 통해)
		thread.start(); //POINT >> call stack 새로 생성하고 그 stack에 run()함수를 올려 놓기까지
		//Thread_2 가 다른 class 를 상속 받고 있다면?(다중상속 불가능)
		//Thread 는 순서가 없다
		//cpu 의 유효 시간에 따라서 점유율이 달라진다
		
		for(int i = 0; i <1000; i++){
			 System.out.println("main : " + i); 
		 }
		 System.out.println("main END");

	}

}
