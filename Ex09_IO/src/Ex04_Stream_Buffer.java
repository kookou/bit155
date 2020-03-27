import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 File 처리 (Disk) read, write
 한 Byte read, write
 모아 모아서 하번에 가져가서 read, write 하겠다 (버스에 태워서 한번에 가겠다)
 버스 >> buffer
 file read, write 중간 buffer >> I/O
 
  1.I/O 성능 개선
  2.모아 놓기 때문에 Line 단위의 작업이 가능하다 (엔터)
  독자적인 객체생성이 불가능 (주클래스 의존)
  
 */
public class Ex04_Stream_Buffer {

	public static void main(String[] args) {
		FileOutputStream fos = null;   //예외처리 할때 finally 블록에서 close 해주려고 밖에서 초기화
		BufferedOutputStream bos = null;
		try{
			fos = new FileOutputStream("data.txt"); //default : false : 파일생성
			bos = new BufferedOutputStream(fos); //output 주소 (도와주는 함수 오버로딩 해서만 사용할수 있다)
			
			for(int i = 0; i <10; i ++){
				bos.write('A');
			}
			//Java Buffer 크기 > 8kbyte => 8192 byte 
			//1.buffer 안에 내용이 8k 다 캐워지면 스스로 비우는 작업을 한다 (내부적으로 flush 발생)
			//2.buffer 강제로 비우기 (flush 또는 close)
			//3.bos.close() 자원해제 >> close () 내부적으로 flush 호출
			
			//야 내려 data.txt 쓰는 작업 수행 하지 않았다
			//버스 (65석)
			//bos.flush();		
		}catch (Exception e){
			
		}finally{
			try{
				bos.close(); //flush
				fos.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
