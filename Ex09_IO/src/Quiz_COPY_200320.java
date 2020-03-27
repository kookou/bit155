import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/*
DIR 목록 보여주기
Type 파일 내용 보여주기
COPY 파일 카피 
 */
public class Quiz_COPY_200320 {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("사용법 : java [복사할 파일명][경로명]");
			System.out.println("예시 : java Ex10_File_SubList C:\\Temp");
			System.exit(0);
		}
		File f = new File(args[0]);
		if (!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리");
			System.exit(0);
		}
		printFileList(f);

	}
	
	static void CopyFile(File copy){
		FileReader fr = null;
		FileWriter fw = null;
		
		try{
			fr = new FileReader();
		}
		
	}

}
