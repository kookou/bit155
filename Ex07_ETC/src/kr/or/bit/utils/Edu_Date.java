package kr.or.bit.utils;

import java.util.Calendar;

//설계도
//사용자 편하게
//많이 사용 할까? 유지보수(함수이름) 

public class Edu_Date {
	public static String DateString(Calendar date){
		return date.get(Calendar.YEAR)+"년"+
	           (date.get(Calendar.MONTH)+1) + "월"+
				date.get(Calendar.DATE) + "일";
	}
	public static String DateString(Calendar date, String opr){
		return date.get(Calendar.YEAR)+opr+
	           (date.get(Calendar.MONTH)+1) + opr+
				date.get(Calendar.DATE) + opr;
	}
	
	//요구사항
	//1~9 월 까지는 01,02
	//10~12 월 까지는 그냥
	public static String monthFormat_DateString(Calendar date){
		String month = "";
		if(date.get(Calendar.MONTH)+1 < 10){
			month =  "0" + (date.get(Calendar.MONTH)+1);
		}else{
			month = String.valueOf(date.get(Calendar.MONTH)+1);
		}
		return date.get(Calendar.YEAR)+"년"+ month+"월"+ date.get(Calendar.DATE) + "일";
	}

}
