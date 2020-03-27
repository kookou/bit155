package kr.or.bit;

import java.io.Serializable;

/*
 객체통신 
 객체(car,Tv) 연결된 네트워크를 통해서 파일간(txt파일객체 write,객체 read), 프로세스 간에 통신(a.class,b.class)
 직렬화 : 객체를 분해해서 줄을 세워 보내는 과정
 역직렬화 : 객체를 다시 조립하는 과정
 실습
 대상 >> 파일 > 객체write (직렬화)
 대상 >> 파일 > 객체 read (역직렬화)
 
 레고 를 조립 했다가 분해하고 다시 재조립
 단, 조건은 본드로 붙이는것은 직렬화의 대상이 아니다
 직렬화가 가능한 제품은 (설계도 부터 다르다) 
 Serializable interface 가 붙어있는 class 만 직렬화 가능
 
 */
public class UserInfo implements Serializable {
	private String name;
	private String pwd;
	private int age;
	
	public UserInfo(){
		
	}
	public UserInfo(String name , String pwd, int age){
		this.name = name;
		this.pwd = pwd;
		this.age = age;
				
	}
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
	}

}
