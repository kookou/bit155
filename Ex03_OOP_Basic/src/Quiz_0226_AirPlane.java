import kr.or.bit.AirPlane;

public class Quiz_0226_AirPlane {
	public static void main(String[]args){
		
		AirPlane a = new AirPlane(1111,"�̽�Ÿ");		
		a.airPlaneInfo();
		
		AirPlane a2 = new AirPlane(2222,"������");
		a2.airPlaneInfo();
		
		AirPlane a3 = new AirPlane(3333,"�����װ�");
		a3.airPlaneInfo();
		
		AirPlane a4 = new AirPlane(4444,"�ƽþƳ�");
		a4.airPlaneInfo();
		
		AirPlane.AirPlanePrint();
	}

}

/*
 	public static void main(String[] args) {
		AirPlane air = new AirPlane();
		air.makeAirPlane(101, "�����װ�");
		air.airPlaneTotalCount();
		
		AirPlane air2 = new AirPlane();
		air2.makeAirPlane(303, "�����װ�");
		air2.airPlaneTotalCount();
		
		AirPlane air3 = new AirPlane();
		air3.makeAirPlane(404, "�����װ�");
		air3.airPlaneTotalCount();
		
	}

}

*/