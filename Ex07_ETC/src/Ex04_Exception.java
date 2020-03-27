import java.io.IOException;

import kr.or.bit.ExcaptionClass;

public class Ex04_Exception {

	public static void main(String[] args) {
		ExcaptionClass ex;
		try {
			ex = new ExcaptionClass("world");
		} catch (NullPointerException | IOException e1) {
			e1.printStackTrace();
		}

	}

}
