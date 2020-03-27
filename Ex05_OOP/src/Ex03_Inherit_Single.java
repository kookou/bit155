// 두개의 설계도
class Tv{
	boolean power;
	int ch;
	
	void power(){
		this.power = !this.power; //<토글링 true 와 false 만 리턴 전원 온오프 따로 만들 필요 없음
	}
	void chUp(){
		this.ch++;
	}
	void chDown(){
		this.ch--;
	}
}
class Vcr{ //비디오 플레이어
	boolean power;
	void power(){
		this.power = !this.power;
	}
	void play(){
		System.out.println("재생하기");
	}
	void stop(){
		System.out.println("정지하기");
	}
	void rew(){}
	void ff(){}
}
//Tv 설계도, Vcr 설계도
//TvVr 라는 설계도 만들어주세요
//기존 Tv, Vcr 설계도 이용
//상속, 포함
//class TvVcr extends Tv, Vcr 다중상속 금지
//class Tv extends Vcr
//class TvVcr extends Tv 계층적 상속  같은 이름의 기능들이 문제가 생긴다

//TvVcr 주기능: 메인 기능 >>비중이 높은 클래스를 상속받는다
//나머지는 포함으로 뺀다

class TvVcr extends Tv{
	Vcr vcr;
	TvVcr(){
		vcr = new Vcr();
	}
}

public class Ex03_Inherit_Single {

	public static void main(String[] args) {
		TvVcr t = new TvVcr();
		t.power();       
		System.out.println("TV 전원상태 : "+t.power);
		t.chUp();
		System.out.println("TV 채널상태 : "+t.ch);
		
		
		
		//비디오
		t.vcr.power();
		System.out.println("비디오 전원상태 : " + t.vcr.power);
		t.vcr.play();
		t.vcr.stop();
		t.vcr.power();
		System.out.println();
		

	}

}
