import kr.or.bit.BodyInfo;
import kr.or.bit.Emp;
import kr.or.bit.Person; // 안에 클래스 200개  >> 가독성 떨어진다
import kr.or.bit.Tv;

//import kr.or.bit.a; a클래스 를 사용 했구나 >> 명시해서 가독성을 높인다.

public class Ex01_Ref_Type {

	public static void main(String[] args) {
		
		
		//값타입 (저장공간 : 메모리)
		int i = 100;
		i = 200;
		System.out.println("i : " + i);
		
		//참조타입
		Person person; //선언만  >> stack 이라는 메모리 영역에 변수가 만들어 지고 
		person = new Person(); //person 이라는 변수에 값(주소값) 을 할당 
		System.out.println(person); //kr.or.bit.Person@15db9742
		
		//초기값 할당
		Person person2 = null; //null (객체의 초기값 >> 값이 없다, 비어 있다)
		System.out.println(person2); //변수는 있는 메모리를 가지고 있지 않다.
		
		//person2 가 메모리를 갖는 방법은
		//1.person2 = new Person();  //new 연산자
		//2.person2 = person;        //같은 타입의 주소값을 할당하는 방법
		
		person2 = person;
		System.out.println(person==person2);  //true 같은집에 사네
		
		person2.name = "홍길동";
		person2.age = 100;
		person2.print();
		
		System.out.println(person.name);
		
		//선언과 할당을 동시에
		Person myperson = new Person();
		myperson.name = "아무개";
	    myperson.print();
	    System.out.println(myperson.power);  //default : false
		
		//Tv 만들고 채널을 5까지 올려 보세요
	    //Tv 브랜드는 비트라고 하세요
	    Tv mytv = new Tv();
	    mytv.brandname = "비트";
	    System.out.println("현재 채널정보 : " + mytv.ch);
	    
	    mytv.ch_Up();
	    mytv.ch_Up();
	    mytv.ch_Up();
	    mytv.ch_Up();
	    mytv.ch_Up();
	    
	    System.out.println("현재 채널정보 : " + mytv.ch);
	    
	    mytv.ch_Down();
	    mytv.ch_Down();
	    mytv.ch_Down();
	    
	    System.out.println("현재 채널정보 : " + mytv.ch);
	    System.out.println("브랜드 이름 : " + mytv.brandname);
	    mytv.tv_Infor();
	    
	    //사원 한명 생성
	    
	    Emp emp = new Emp();
	    emp.empnum = 7788;
	    emp.empname = "김유신";
	    emp.job = "IT";
	    
	    System.out.println(emp.bodyinfo); //null
	    
	    BodyInfo bodyinfo = new BodyInfo ();
	    bodyinfo.height = 190;
	    bodyinfo.weight = 90;
	    emp.bodyinfo = bodyinfo; //할당(주소값 할당)
	    
	    System.out.println(emp + "/" + emp.bodyinfo);
	    System.out.println(emp.empnum + "/" + emp.bodyinfo.height);
	    System.out.println(emp.empnum + "/" + emp.bodyinfo.weight);
	    

	    

		
		
		
		
		

	

	}

}
