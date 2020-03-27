import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//https://cafe.naver.com/opensourceweb 참고

public class Ex10_Format_Date {

	public static void main(String[] args) throws ParseException {
		Date curdate = new Date();
		Calendar cal = Calendar.getInstance(); // format
		System.out.println("Date : " + curdate);
		System.out.println("cal : " + cal); // 이미 문자열을 포함하고 있기 때문에 formating이
											// 안된다
		System.out.println("cal getTime() : " + cal.getTime()); // format

		String StringDate = "202012121212";

		SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddHHmm");
		System.out.println(dateformat.format(curdate));
		System.out.println(dateformat.format(cal.getTime()));

		SimpleDateFormat dateformat2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm");
		System.out.println(dateformat2.format(curdate));
		System.out.println(dateformat2.format(cal.getTime()));

		// 문자열(날짜 형식에 맞게 만들어진) > 날짜 형식으로 바꿀수 있다
		Date stringdate = dateformat.parse(StringDate);
		System.out.println("StingDate : " + StringDate);
		System.out.println("stringdate : " + stringdate);

		long datelong = stringdate.getTime();
		System.out.println(datelong);

	}

}
