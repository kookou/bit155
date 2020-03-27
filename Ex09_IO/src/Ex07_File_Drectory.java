import java.io.File;
import java.io.IOException;

/*
 I/O 작업
 파일과 폴더를 다룰 수 있는 클래스
 
 Java : 파일, 폴더 를 다루는것을 하나의 클래스에 : File 
 >>a.txt 생성,수정, 삭제, 정보 read 
 >>Temp 폴더 생성, 삭제, 정보 read
 
 
 C# : 파일(File), 폴더(DirectorY)
 경로
 절대 경로 : C:\\, D:\\ >> C :\\Temp\\a.txt
 상대경로 : 현재 파일을 중심으로  C :\\Temp\\a.txt >> ../ >> / 
 
 
 
 */
public class Ex07_File_Drectory {

	public static void main(String[] args) throws IOException {
		String path = "C :\\Temp\\file.txt";
		File f = new File(path);
		//f.createNewFile(); 함수를 호출할때 파일 생성
		//file 클래스를 통해서 경로의 정보를 읽어 낼수 있다
		//file 클래스를 통해서 (다양한 정보를 확인할 수 있다)
		String filename = f.getName();
		System.out.println("파일명 : " + filename);
		System.out.println("전체경로 : "+f.getPath()); 
		System.out.println("절대경로 : "+f.getAbsolutePath());
		System.out.println("너 폴더니? : "+f.isDirectory());
		System.out.println("너 파일이니? : "+ f.isFile());
		System.out.println("파일의 크기 : " + f.length()+"byte");
		System.out.println("부모경로 : "+f.getParent());
		System.out.println("존재여부 (파일,폴더): "+f.exists());
		
		//f.delete() return >> true, false
		//f.can

	}

}
