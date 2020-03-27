import java.util.ArrayList;
import java.util.Stack;

/*
Today Point
Generic 
jdk 1.5
C# , Java  필수 기능

Collection 클래스들은 (저장공간의 타입 : Object)
1. Object 타입 저항  >> 타입 ?? >> 타입강제 >> 제너릭
2. 타입 안정성 (타입 강제)
3. 형변환 (casting) (x) >>   (Car)obj (x)

만드는 시점 : 클래스 설계  >> 타입을 강제하도록 

*/
class MyGen<T>{ //Type parameter
	T obj;
	
	void add(T obj) {
		this.obj = obj;
	}
	T get() {
		return this.obj;
	}
}

class Person extends Object{
	int age=100;
}

public class Ex06_Generic {
	public static void main(String[] args) {
		MyGen<String> mygen = new MyGen<String>();
		mygen.add("문자열");
		String result = mygen.get();
		System.out.println(result);

		ArrayList list = new ArrayList(); //
		//저장하는 저장공간(Array >> 타입 >> default Object)
		list.add(10);
		list.add(new Person());
		list.add("홍길동");
		
		//출력
		for(Object obj : list) {
			//System.out.println(obj);
			//Person p = (Person)(obj);
			//System.out.println(p.age);
			//판단 (객체 , 값 구분 ... 변환)
			if(obj instanceof Person) {
				Person p = (Person)(obj);
				System.out.println(p.age);
			}else {
				System.out.println(obj);
			}
		}
		
		ArrayList<Person> plist = new ArrayList<Person>();
		plist.add(new Person());
		plist.add(new Person());
		for(Person p : plist) {
			System.out.println(p.age);
		}
		
		MyGen<Person> myobj = new MyGen<Person>();
		myobj.add(new Person());
		Person pe = myobj.get();
		System.out.println(pe.age);
		
		Stack<String> s = new Stack<String>();
		s.push("문자열");
		String str = s.pop();
	}

}






