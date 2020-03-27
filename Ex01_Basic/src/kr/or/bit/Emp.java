package kr.or.bit;

//사원이라는 설계도
//사원의 정보를 담고 출력을 담당하는 함수를 가지는 설계도를 만들고 있다.
//class 155th{ }
public class Emp {
//	클래스 = 설계도. 구체화시키기 않으면 종이쪼가리에 지나지 않는다.

	public int empno; 
	//정보를 담는 변수, 사원은 사번을 가지고 있다. (사번 : 숫자)
	
	public String ename;
//	정보를 담는 변수, 사원은 이름을 가지고 있다. (이름 : 문자열)
	
	public String job;
//	사원은 직종을 가지고 있다. (직종 : 문자열)
	
	
//	변수 : 정보(고유값)를 담을 수 있는 공간. 정보는 변화할 수 있다. = instance variable(객체 변수), member field(더 큰 범위)

	
	private int data;
//	캡슐화 ㅣ 자원을 보호하겠다.
//	직접 할당을 막고 간접 할당을 통해서 데이터 보호.
	
//	기능, 행위정보 = 함수 = method
//	아래의 함수는 read기능이다.
	public int getData(){ //getter
		return data; //data라는 member field가 가지는 값을 돌려줄 것이다.
	}
	
	//기능
//	write기능
	public void setData(int input){ //setter
		if(input < 0){
			data = 0;
		}else{
			data = input;
		}
	}
//	private 데이터에 간접적으로 접근해서 특정한 조건을 만족하는 값을 돌려주는 함수.
	
//	출력하는 기능(행위정보 = 함수 = method)
//	함수는 반드시 호출에 의해서만 동작한다.
	public void getEmpInfo(){
		System.out.println(empno + "/" + ename + "/" + job);
	}
	
	
}
