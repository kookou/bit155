import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 문자 기반의 데이터 처리
 char[] 가지고 놀자 (String 클래스 내부적으로 데이터 char[]관리)
 
 한글 1자 >>2byte >> Stream 빨대 불가능 (기본적으로 1byte 이기 때문에)
 통로 2byte 인 빨대 :Reader, writer 추상클래스 
 
 대상이File 이면
 FileReader , FileWriter
 
 */
public class Ex05_Reader_Writer {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try{
			fr = new FileReader("Ex01_Stream.java"); //Ex01_Stream.java read 하겠다
			fw = new FileWriter("Copy_Stream.txt"); //파일 생성
			//"Ex01_Stream.java" read 해서  "Copy_Stream.txt" 에 write 할거야
			int data = 0;
			while((data = fr.read())!= -1){
				//System.out.println((char)data);
				fw.write(data); //data 값을 read 해서 copy_Stream.txt write 하겠습니다
				if(data !='\n' && data !='\r' && data != '\t' && data != ' '){
					fw.write(data);
				}
			}
			System.out.println("file 처리");
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			try{
				fw.close();
				fr.close();
			}catch (IOException e){
				e.printStackTrace();
			}
			
		}

	}

}
