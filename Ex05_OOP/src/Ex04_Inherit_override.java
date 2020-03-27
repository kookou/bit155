/*
 Today Point
 [상속 관계] override : 상속 관계에서 메소드 [재정의] *상속이 없으면 오버라이드가 존재하지 않는다
 [상속관계에]서 [자식 클래스]가 [부모 클래스]의 [메소드]를 재정의(내용 바꾼다)
 재정의 : 틀의변환(함수의 이름, 타입) 하는 것이아니고 내용만 {요기가 변화}
 문법)
 1.부모 함수 이름 동일
 2.부모 함수 parameter 동일
 3.부모 함수 return Type 동일
 4.결국에는 {실행블럭 안의 내용만 바꿀수 있어요}
 오버로딩  하나의 이름으로 여러가지 기능을 합니다
 오버라이딩 상속관계에서 메소드 재정의
 */

class Point2 {
	int x = 4;
	int y = 5;

	String getPosition() {
		return "x : " + this.x + "y : " + this.y;
	}
}

class Point3D extends Point2 {
	int z = 6;
	//부모의 함수와 틀이 똑같다 >> 내용만 다르다
	//재정의..
	
	//Annotation은 Java code 만으로 전달할수없는 [부가적인 정보]를 컴파일러, 개발툴에 전달
	//@Override  >> Annotation >> 재정의 검사를 해라
	@Override
	String getPosition(){
		return "x : " + this.x + "y : " + this.y+"z : " + this.z;
	}

}

public class Ex04_Inherit_override {

	public static void main(String[] args) {
		Point3D po = new Point3D();
		System.out.println(po.getPosition()); //재정의한 함수가 호출된다
		
	}

}
