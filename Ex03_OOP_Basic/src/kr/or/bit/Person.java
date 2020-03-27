package kr.or.bit;
// class == 설계도 == Type
//설계도는 구체화 (메모리에 올려사 사용하는것)를 통해서 객채로 생성되어야 한다
//구체화 된것 >> 객체, 인스턴스

//설계도 기본적인 구성요소 (필드 + 함수) + 생성자

//class Car {} >> default class Car{}  >> 현재 폴더에서만
//public class Car {public String color; int door; >> default int door}

public class Person {
	                     //String 은 default 값이 참조타입 (Class)이기 때문에 >> null 
	public String name;  //member field >> instance variable 
	                     //초기화를 하지 않아도 된다 (초기화 : 최초의 값을 할당 하는것)
	                     //생성되는 객체 (사람) 마다 다른 이름을 가지기 때문에..
	                     //Person p = new Person (); p.name = "홍길동"
	                     //Person p2 = new Person (); p2.name = "김유신"
	                     //default 값을 가진다 
	                     //public int age;  //default -> 0
	                     //public boolean power //default -> false
	public int age;
	public boolean power;
	//기능(행위)  >> method
	public void print(){ //변수 값을 출력하는 기능
		System.out.println("name:"+name+ "/"+ "age:"+age);
		
		
	}

}
