//서로 다른 클래스를 하나의 부모로 묶어주는 역할
interface Irepairable{   //할 수 있는 
	
}

class Unit2 {
	int hitpoint; // 기본에너지
	final int MAX_HP;

	Unit2(int hp) {
		this.MAX_HP = hp;
	}
}

// 지상유닛
class GroundUnit extends Unit2 {
	GroundUnit(int hp) {
		super(hp);
	}
}

// 공중유닛
class AirUnit extends Unit2 {
	AirUnit(int hp) {
		super(hp);
	}
}

class CommandCenter implements Irepairable{ //Scv 충전
	
	
}
class Tank2 extends GroundUnit implements Irepairable{
	Tank2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank2";
	}
}

class Marine2 extends GroundUnit {
	Marine2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Marine2";
	}
}

class Scv extends GroundUnit implements Irepairable  {
	Scv() {
		super(60);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Scv";
	}

	// Scv 구체화, 특수화 고유한 기능
	// repair (수리하다)
	/*
	void repair(Tank2 tank) {
		if (tank.hitpoint != tank.MAX_HP) {
			tank.hitpoint += 5;
		}
	}
	
	void repair(Scv scv){
		if(scv.hitpoint != scv.MAX_HP){
			scv.hitpoint += 5;
		}
	}
	*/
	/*
	 Scv 가 repair Unit 이 증가하면 Unit 개수만큼 repair 함수 추가 
	 고민 : 하나의 repair 함수가 모든 repair 가능한 Unit을 수리할 수 없을까
	 다형성 상속관계에서 부모타입은 자식 객체의 주소값을 가진다.
	 우리가 가지고 있는 모든 Unit 이 repair 의 대상은 아니다
	 
	  결국에는 서로 연관성이 없네~
	   해결사 : Interface 
	 1. 서로 연관성이 없는 클래스에 대해서 하나로 묶는 기능제공 (상위 부모 )
	   인터페이스(interface) 하나의 타입 ....
	 
	 
	 */
	/*interface Irepairable{   }
		class CommandCenter implements Irepairable
		class Tank2  extends GroundUnit implements Irepairable
		*/
	void repair(Irepairable repairunit) {
		//repairunit 변수는 어떤 객체의 주소 : Tank2 , CommandCenter ,  Scv
		
		//repair 하는 대상이 CommandCenter 올 수 있는 데 Unit 아니다
		//충전 방식이 다르다 
		
		
		//repairunit 은 자기것이 .... 없어요 ....
		//부모는 자식의 것만 
		
		//Unit2 >> hitpoint , MAX_HP
		
		//(Irepairable repairunit)  >> Tank2
		//downcasting  -> Tank2 tank = (Tank2)repairunit (상위 타입을 >> 하위 타입으로)
		//downcasting  -> Scv scv = (Scv)repairunit (상위 타입을 >> 하위 타입으로)
		
		//요약
		//Tank2 > GroundUnit > Unit2
		//Scv   > GroundUnit > Unit2
		//공통점 : Unit2
		
		//CommandCenter > Unit2(x)
		//수리가능한 유닛만 parameter 받는데 ..
		//그 parameter 는 다른 충전방식도 존재
		if(repairunit instanceof Unit2) {
			Unit2 unit = (Unit2)repairunit;
			if(unit.hitpoint != unit.MAX_HP) { 
				unit.hitpoint = unit.MAX_HP;
			}
		}else {  //Unit2를 부모로 가지고 있지 않으면
			     //코드 구현
			     System.out.println("Unit2 가 아니예요 ,, 다른 방식으로 repair 합니다");
		}
	}
}

public class Ex04_Interface {

	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine = new Marine2();
		Scv scv = new Scv();
		
		//전투
		tank.hitpoint -=20;
		System.out.println("탱크 : " + tank.hitpoint);
		System.out.println("Scv  수리 요청");
		scv.repair(tank);
		System.out.println("탱크 수리 완료 : " + tank.hitpoint);
		
		CommandCenter center = new CommandCenter();
		scv.repair(center);


	}

}
