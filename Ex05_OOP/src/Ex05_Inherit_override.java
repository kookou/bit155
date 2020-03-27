import kr.or.bit.Emp;

class Test2 {
	int x = 100;
	void print() {
		System.out.println("부모함수(Test2)");
	}
}

class Test3 extends Test2 {
	int x = 300; //부모 무시하기 //하지마세요
	@Override
	void print() {
		System.out.println("자식이 부모함수 재정의");
	}

	// 오버로딩(상속과 상관이 없다)
	void print(String str) {
		System.out.println("나 오버로딩 함수야" + str);
	}
}

public class Ex05_Inherit_override {

	public static void main(String[] args) {
		Emp emp = new Emp(1000, "김유신");
		System.out.println(emp.toString()); // kr.or.bit.Emp@15db9742
		// Object 가 가지고 있는 to String() 은 객체의 주소를 리턴한다
		System.out.println(emp); // toString() default 값 kr.or.bit.Emp@15db9742

		Test3 test3 = new Test3();
		test3.print();
		test3.print("오버로딩");
	}

}
