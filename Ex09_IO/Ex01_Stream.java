import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 I/O
 추상 클래스
 InputStream,OutStream (Byte)
 두개의 클래스를 상속(재정의)하는 클래스를 통해 입출력 작업을 할 수 있다.
 
 읽을수 있는 대상에 따라서
 1.memory : ByteArrayInputStream / ByteArrayOutputStream
 2.File(중요) : FileInputStream /FileOutputStream
  
 
 */
public class Ex01_Stream {

	public static void main(String[] args) throws IOException {
		// byte (-128~+127) 정수값을 저장하는 타입
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] outSrc = null; // 현재는 메모리를 가지고 있지 않아요

		// 내가 데이터를 read, write 하는 대상을 Memory 
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;

		input = new ByteArrayInputStream(inSrc); // read
		// 생성자를 통해서 inSrc배열의 값을 read 할
		output = new ByteArrayOutputStream(); // wirte

		System.out.println("outSrc before : " + Arrays.toString(outSrc));
		// 공식같은 로직(암기
		int data = 0;
		while ((data = input.read()) != -1) {// 더이상 read 할 data 가 없다면 -1
			// System.out.println("data : " + data);
			// System.out.println("input.read()" + input.read());
			// read()함수는 내부적으로 next 기능을 가지고 있다
			output.write(data);
			// 자기 자신에서 data 함수의 변수 값을 read 해서 write 하겠다.
			// write 하는 대상이 output 이다 (ByteArrayOutputStream) 자신의 통로에 read 한
			// data 를 가지고 있다
		}
		outSrc = output.toByteArray();
		// toByteArray >> 자기가 가지고 있는 값을 배열로 만들어서 그 주소값을 outSrc 에게 할당
		System.out.println("outSrc : " + Arrays.toString(outSrc));

	}

}
