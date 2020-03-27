import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09_File_Format {

	public static void main(String[] args) {
		// 화폐 단위 처리
		// DecimalFormat df = new DecimalFormat ();

		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		// Calender cal = Calender.getInstance();
		// 문자열 형식 ( >>prinf(%d,10), String.format
		// MessageFormat 클래스
		/*
		 * String userid = "kglim"; String message =
		 * "회원 id : {0} \n 회원이름 : {1} \n 회원 전화번호 : {2}"; String result3 =
		 * MessageFormat.format(message, userid,"홍길동","111-1111");
		 * System.out.println(result3);
		 */
		File dir = new File("C:\\Temp");
		File[] files = dir.listFiles(); //temp 아래에 있는 폴더와 파일이 배열에 들어가있다
		for(int i = 0; i <files.length; i++){
			File file = files[i];
			String name = file.getName(); //파일 명, 폴더명
			SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH-mma");
			//Calendar cal = Calendar.getInstance();
			String attribute = "";
			String size = "";
			if(files[i].isDirectory()){//만약 폴더면?
				attribute="<DIR>";
				
			}else{  //파일이라는 이야기 a,txt , 
				size = file.length() + "byte";
				attribute = file.canRead() ? "R" : "";
				attribute += file.canWrite() ? "W" : "";
				attribute += file.isHidden() ? "H" : "";
			}
			System.out.printf("%s   %3s    %10s    %s   \n",
					           dt.format(new Date(file.lastModified())),
					           attribute,
					size, name);
		}

	}

}
