import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 read,write 대상 File (물리적인 파일) 1. txt,data.txt
 FileInputStream  //읽어 들인다
 FileOutputStream
 
 C:\\IOtemp\\a.txt
 */
public class Ex02_POINT_File_read_write {

	public static void main(String[] args) {
		/*
		try { 
			//Point : I/O 작업은 대부분 가비지 컬랙터의 대상이 아니다 
			//명시적인 자원의 해ㅔ를 해야한다(썻으면 반환해야한다 > close()라는 함수) >> 내부적으로 소멸자를 호출하는 방식
			FileInputStream fs = new FileInputStream("C:\\IOtemp\\a.txt");
			int data = 0;
			while((data = fs.read())!= -1){
				System.out.println("정수(숫자) : "+ data);
				//문자값 으로 받고싶으면
				char c = (char)data;
				System.out.println(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//정상, 비정상
			
		}
		*/
		FileInputStream fs =null;
		FileOutputStream fos =null;
		String path = "C:\\Temp\\a.txt";
		try { 
			//Point : I/O 작업은 대부분 가비지 컬랙터의 대상이 아니다 
			//명시적인 자원의 해ㅔ를 해야한다(썻으면 반환해야한다 > close()라는 함수) >> 내부적으로 소멸자를 호출하는 방식
			fs = new FileInputStream(path);
			fos = new FileOutputStream("C:\\Temp\\new.txt",true);
			//write
			//FileOutputStream 파일 생성 기능을 가지고 있다
			//파일에 write 할때 파일이 존재 하지않으면 파일을 생성한다
			//new FileOutputStream("C:\\IOtemp\\new.txt",false); default
			//기존데이터를 overwrite (덮어쓴다)
			
			//fos = new FileOutputStream("C:\\IOtemp\\new.txt",true);
			//기존데이터 append
			int data = 0;
			while((data = fs.read())!= -1){
				//System.out.println("정수(숫자) : "+ data);
				//문자값 으로 받고싶으면
				//char c = (char)data;
				//System.out.println(c);
				fos.write(data); //data 값을 read 해서 >> write "C:\\IOtemp\\new.txt"
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//정상, 비정상
			try {
				fs.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
