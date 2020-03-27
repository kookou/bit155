package kr.or.bit;

import java.io.IOException;

/*
 설계도 (class) 만들때 
 내 설계도를 사용 하는 개발자가 예외를 처리 해 줬으면 좋겠는데? [강제로]
 생성자 throws IOException , NullPointerException 여러가지 예외를 붙여 줄수 있다 (복수) 생성자나 함수 뒤에
함수 throws IOException , NullPointerException
 */
public class ExcaptionClass {
	public ExcaptionClass(String path) throws IOException, NullPointerException {

	}

	public void call() throws ArithmeticException, IndexOutOfBoundsException {
		System.out.println("call 함수 start");
		int i = 0 / 0;
		System.out.println("call 함수 start");
	}

}
