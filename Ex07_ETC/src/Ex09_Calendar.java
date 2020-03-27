import java.util.Calendar;
import java.util.Date;

import kr.or.bit.utils.Edu_Date;

/*
* Calendar 를 상속받아 완전히 구현한 클래스는 
 * GregorianCalendar
   buddhisCalendar 있는데 getInstance()는 [시스템의 국가와 지역설정]을 [확인]해서
      태국인 경우 buddhisCalendar 의 인스턴스를 반환하고 그 외에는 GregorianCalendar
     의 인스턴스를 반환한다
   GregorianCalendar 는 Calendar를 상속받아 오늘날 전세계 공통으로 사용하고 있는 
   그레고리력에 맞게 구현한 것으로 태국을 제외한 나머지 국가에서는 GregorianCalendar 사용
   그래서 인스턴스를 직접 생성해서 사용하지 않고 메서드를 통해서 인스턴스를 반환받게하는
   이유는 최소의 변경으로 프로그램 동작을 하도록 하기 위함
   class MyApp{
     static void main(){
      Calendar cal = new GregorianCalendar();
      다른 종류의 역법의 사용하는 국가에서 실행하면 변경......    }  }
   class MyApp{
     static void main(){
      Calendar cal = new getInstance();
        다른 종류의 역법의 사용하는 국가에서 실행하면 변경......   }  }
  API : 생성자 Protected Calendar() 
 */
//Java API
//날짜 : Date (구) -> Calendar(신)
public class Ex09_Calendar {

	public static void main(String[] args) {
		Date dt = new Date(); //구버전
		System.out.println(dt.toString());
		
		//신버전
		Calendar cal = Calendar.getInstance(); // new GregorianCalender();
		System.out.println(cal.toString());
		
		//당신이 필요한 형식을 추출, 조합해서 사용
		System.out.println("년도 : " +cal.get(Calendar.YEAR));//상수 만 기억
		System.out.println("월 : " +(cal.get(Calendar.MONTH)+1)); // 우리나라는 +1
		System.out.println("일 : " +cal.get(Calendar.DATE));
		
		System.out.println("이 달의 몇번째 주 : "+ cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println(""+ cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		//시,분,초
		System.out.println("시 : "+cal.get(Calendar.HOUR));
		System.out.println("분 : "+cal.get(Calendar.MINUTE));
		System.out.println("초 : "+cal.get(Calendar.SECOND));
		//오전, 오후
		System.out.println("오전 오후 : "+cal.get(Calendar.AM_PM));
		/*
		 학사관리 시스템 
		 페이지 수 200 페이지  > 150 페이지 안에는 날짜가 들어간다
		150 페이지에 하나씩 넣어놓으면 수정을 150 번 해야한다
		날짜관련된 클래스를 하나 만들어서 함수를 호출하여 쓴다 함수만 수정하면 된다
		>>class EduDate {static String todate(){날짜 생성리턴}}
		>>1페이지에 >> EduDate.todate() >> 출력
		 
		 
		 */
		String date = Edu_Date.DateString(Calendar.getInstance());
		System.out.println(date);
		
		String date2 = Edu_Date.DateString(Calendar.getInstance(),"/");
		System.out.println(date2);
		
		String date3 = Edu_Date.DateString(Calendar.getInstance(),":");
		System.out.println(date3);
		
		String date4 = Edu_Date.monthFormat_DateString(Calendar.getInstance());
		System.out.println(date4);
	

	}

}
