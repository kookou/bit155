package kr.or.bit;

import java.io.IOException;

/*
 ���赵 (class) ���鶧 
 �� ���赵�� ��� �ϴ� �����ڰ� ���ܸ� ó�� �� ������ ���ڴµ�? [������]
 ������ throws IOException , NullPointerException �������� ���ܸ� �ٿ� �ټ� �ִ� (����) �����ڳ� �Լ� �ڿ�
�Լ� throws IOException , NullPointerException
 */
public class ExcaptionClass {
	public ExcaptionClass(String path) throws IOException, NullPointerException {

	}

	public void call() throws ArithmeticException, IndexOutOfBoundsException {
		System.out.println("call �Լ� start");
		int i = 0 / 0;
		System.out.println("call �Լ� start");
	}

}
