import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import kr.or.bit.UserInfo;

//UserData.txt 직렬화된 객체가 2개
//객체를 read 원상태로 복원 (역 직렬화)

public class Ex16_Object_DataInputStream {
	public static void main(String[] args) {
		String filename = "UserData.txt";

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream in = null;

		try {
			fis = new FileInputStream(filename);
			bis = new BufferedInputStream(fis);
			in = new ObjectInputStream(bis); // 역직렬화

			// UserInfo r1 = (UserInfo) in.readObject(); // object 타입을
			// UserInfo타입으로 다운 캐스팅
			// UserInfo r2 = (UserInfo) in.readObject();

			Object users = null;
			while ((users = in.readObject()) != null) {
				System.out.println(((UserInfo) users).toString());
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				in.close();
				bis.close();
				fis.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
