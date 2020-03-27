/*
 String 클래스
 String str = new String("홍길동");
 8가지 기본 타입과 동일하게 사용할 수 있도록 설계
 int i = 100;
 String str = "홍길동";
 
 1.String 클래스 : 데이터 저장 구조 : char[] 배열저장 > 홍길동 > [홍][길][동]
 ex) String ename = "ABC" >> char[] >> [A] [B] [C]
 class String extends Object{
  char[]...
  void length(){}
  @override
  String toString(){
      재정의
  }
 */
public class Ex05_String_Class {

	public static void main(String[] args) {
		String str = "홍길동";
		System.out.println(str.length());  //데이터가 내부적으로 char[] (배열) 로 관리 되기 때문에
		System.out.println(str.toString());
		
		
		String str1 = "AAA";
		String str2 = "AAA";
		System.out.println(str1);  //str1.toString()  << 생략 되어있기 때문에 주소값이 아닌 오버라이드 된 값을 리턴한다
		System.out.println(str1.toString());  // String 은 같은 문자 열이 있으면 메모리를 생성하지 않는다 
		System.out.println(str1 == str2);     // true
		//문자열 == 무엇을 비교 하는 가? >> 주소 비교 ("xx 번지" == "xx번지")
		//실제로는 문자열의 값이지 주소가 중요한게 아니다
	    System.out.println(str1.equals(str2));
	    //******* 실제로 heap 에 있는 값을 비교하는것 ("AAA" == "AAA")
	    
	    //그런데..
	    String str3 = new String("BBB"); //new 를 사용하면 새로운 객체를 생성한다
	    String str4 = new String("BBB");
	    System.out.println(str3==str4);  //"xx번지" == "yy번지"  >>false
	    System.out.println(str3.equals(str4)); //"BBB" == "BBB" >>true
	    
	    //넌센스
	    String s = "A";
	    s+="B";
	    s+="C";
	    System.out.println(s);
	    
	    s = "A";
	    System.out.println(s);
	    String str5 = "BBB";
	    String str6 = new String();
		
		
		
		

	}

}
