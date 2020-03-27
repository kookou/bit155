import java.io.File;
import java.text.SimpleDateFormat;

/*
DIR 목록 보여주기
 */
public class Quiz_DIR_200320 {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("사용법 : java [실행할 파일명][경로명]");
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

	static void printFileList(File dir) {

		File[] files = dir.listFiles();
		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			String name = file.getName();
			SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd a HH:mm");

			String attribute = "";
			String size = "";
			String path = "";

			if (files[i].isDirectory()) {
				attribute = "<DIR>";
			} else {
				size = file.length() + "byte";
				attribute = file.canRead() ? "R" : "";
				attribute += file.canWrite() ? "W" : "";
				attribute += file.isHidden() ? "H" : "";
				path += file.getAbsolutePath();
			}

			System.out.printf("%s   %3s    %10s    %s                %s                 \n",
					dt.format(file.lastModified()), attribute, size, name, path);
		}
	}
}
