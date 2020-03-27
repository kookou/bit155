import kr.or.bit.Car;

/*
 접근자(한정자) : modifier
 public (공유 : package 구분(폴더) 구분 없이 모든 자원 공유 )
 private (개인 : 클래스 내부 공유자원, 참조변수 입장에서 접근이 불가능 (사용불가))
 
 객체 지향 언어 특징
 1. 캡슐화 (은닉화)
 1.1 클래스 내부에 있는 자원 (member field, method)적용
     private int number;  직접할당을 막고 간접 할당을 통해서 자원을 보호 (setter , getter)
     private void call(); 다른 함수의 보조, 공통함수
 1.2 [직접할당]
     public class Car{public int door;} >> Car c = new Car(); c.door = 100;
           만약에 원하지 않는 c.door = -1 넣으면 ... ㅜㅜ
     public class Car {private int door;
                         public viod writeDoor(int data){ //door 변수 write
                              if(data >=0){
                              door = data;
                              }else{
                              door = 0;
                              }
                         }
                         public int readDoor(){  //door 변수 read
                              return door;
                         }
                       }
   >>Car c = new Car(); c.writeDoor(10); c.writeDoor(-1);  -> door = 0  int result = c.readDoor();
   -> 불편해요
   -> private 변수 하나당 >함수 2개 필요 (write / read)
   -> java에서는 특수한 목적의 함수 : setter(private 자원 write) , getter (private 자원 read)
   -> 쓰기전용, 읽기전용
   -> private int age
   -> setter, getter 모두 생성
   -> setter 만 생성
   -> getter 만 생성 > private int age = 100                            
 
 
 */
public class Ex04_Modifier {
	public static void main(String[] args){
		Car c = new Car();
		/*
		c.writeSpeed(100);		 
		int result = c.readSpeed();
		System.out.println("현재속도 : " + result);
		*/
		
		c.setSpeed(100);
		int result =  c.getSpeed();
		System.out.println("속도 : " + result);
		
		
		c.speedUp();
		c.speedUp();
		c.speedUp();
		result = c.getSpeed();
		System.out.println("속도 : " + result);
		
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		result = c.getSpeed();
		System.out.println("속도 : " + result);
		
	}

}
