import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_Stream_ImageCopy {

	public static void main(String[] args) {
		String orifile = "C:\\IOtemp\\1.jpg";
		String targetfile = "copy3.jpg";
		// dsfault 경로 는 프로젝트 폴더가 dsfault 경로
		// 앞에 경로를 명시하지 않으면 D:\bit155\JAVA\Labs\Ex09_IO\src
		FileInputStream fs = null;
		FileOutputStream fo = null;

		try {
			fs = new FileInputStream(orifile);
			fo = new FileOutputStream(targetfile, false);

			int data = 0;
			while ((data = fs.read()) != -1) {
				fo.write(data); // data 값을 read 해서 targetfile write 하는 작업
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fs.close();
				fo.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}
