import kr.or.bit.AirPlane;

public class Quiz_0226_AirPlane {
	public static void main(String[]args){
		
		AirPlane a = new AirPlane(1111,"이스타");		
		a.airPlaneInfo();
		
		AirPlane a2 = new AirPlane(2222,"진에어");
		a2.airPlaneInfo();
		
		AirPlane a3 = new AirPlane(3333,"대한항공");
		a3.airPlaneInfo();
		
		AirPlane a4 = new AirPlane(4444,"아시아나");
		a4.airPlaneInfo();
		
		AirPlane.AirPlanePrint();
	}

}

/*
 	public static void main(String[] args) {
		AirPlane air = new AirPlane();
		air.makeAirPlane(101, "대한항공");
		air.airPlaneTotalCount();
		
		AirPlane air2 = new AirPlane();
		air2.makeAirPlane(303, "대한항공");
		air2.airPlaneTotalCount();
		
		AirPlane air3 = new AirPlane();
		air3.makeAirPlane(404, "대한항공");
		air3.airPlaneTotalCount();
		
	}

}

*/