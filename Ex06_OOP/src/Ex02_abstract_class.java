

//게임 : unit(유닛)

//unit 공통기능 (이동좌표, 이동, 멈춘다)
//unit 이동 방법은 다르다 (이동 방법은 unit 마다 별도의 구현) 
//abstract class 이름 {abstract 이동();} << 상속받는 모든 자원들이 강제 구현 하도록 하겠다

abstract class Unit{
	int x,y;
	
	void stop(){
		System.out.println("Unit stop");
	}
	//이동(강제)
	abstract void move(int x, int y); //추상자원 강제적 구현(추상자원을 상속 받는 클래스가 부모 클래스 안의 추상자원을 강제로 구현하도록 하는것)
   
}

class Tank extends Unit{
	
	@Override
	void move(int x ,int y){
		this.x = x;
		this.y = y;
		System.out.println("Tank 이동 : " +this.x+","+this.y);
	}
	//Tank 특수화 (구체화)
	void cangeMode(){
		System.out.println("탱크변환모드");
	}
}

class Marine extends Unit{
	@Override
	void move(int x ,int y){
		this.x = x;
		this.y = y;
		System.out.println("Marine 이동 : " +this.x+","+this.y);
	}
	//Tank 특수화 (구체화)
	void stimpack(){
		System.out.println("스팀백기능");
	}
	
}

class DropShip extends Unit{
	@Override
	void move(int x ,int y){
		this.x = x;
		this.y = y;
		System.out.println("DropShip 이동 : " +this.x+","+this.y);
	}
	void load(){
		System.out.println("Unit load");
	}
	void unload(){
		System.out.println("Unit unload");
	}
}



public class Ex02_abstract_class {

	public static void main(String[] args) {
		Tank t = new Tank();
		t.move(500, 200);
		t.stop();
		t.cangeMode();
		
		Marine m = new Marine();
		m.move(500, 300);
		m.stop();
		m.stimpack();
		
		//1.탱크 3대를 만들고 [같은 좌표]로 이동 시키세요 (33,44)
		Tank[] tanklist = {new Tank(),new Tank(),new Tank()};
		for(Tank tank : tanklist){
			tank.move(33, 44);
		}
		
		//2.여러개의 Unit (Tank1, Marine1, DropShip1)를 같은 좌표로 이동 시키세요
		Unit[] unitlist = {new Tank(), new Marine(),new DropShip()};  //부모타입의 배열을 만들면 자식 타입의 주소를 가질 수 있다.
		for(Unit unit : unitlist){
			unit.move(111, 222); //<<부모타입으로 접근해도 재정의(override)가 되어있음으로 자식 클래스 메소드 호출 가능
		}
		

	}

}
