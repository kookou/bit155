import java.util.Properties;

/*
 Map interface를 구현한 class
 특수한 목적의 map <String,String>(key,value)
 고정시킨 클래스 : Properties
 사용목적
 App 전체를 관리 : 환경변수 : 프로그램의 버전 : 파일경로 : 공통변수 
 ex)
 config.properties
 */
public class Ex15_Properties {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("master", "bit@bit.or.kt");
		prop.setProperty("version","1.x.x.x");
		prop.setProperty("defaultpath","c:\\Temp\\images");
		
		//각각의 개발 페이지에서
		System.out.println(prop.getProperty("master"));
		System.out.println(prop.getProperty("defaultpath"));

	}

}
