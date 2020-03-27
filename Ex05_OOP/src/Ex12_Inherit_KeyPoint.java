/*
시나리오(요구사항)
저희는 가전제품 매장 솔루션을 개발하는 사업팀입니다
A라는 전자제품 매장이 오픈되면 
[클라이언트 요구사항]
가전제품은  제품의 가격 , 제품의 포인트 정보를 공통적으로 가지고 있습니다
각각의 가전제품은 제품별 고유한 이름을 가지고 있다
ex)
각각의 전자제품은 이름을 가지고 있다(ex: Tv , Audio , Computer)
각각의 전자제품은 다른 가격을 가지고 있다(Tv:5000, Audio:6000 ....)
제품의 포인트는 가격의 10% 적용한다
 
시뮬레이션 시나리오
구매자 : 제품을 구매하기 위한 금액정보 , 포인트 정보를 가지고 있다 
예를 들면 : 10만원  , 포인트 0
구매자는 제품을 구매할 수 있다 , 구매행위를 하게되면 가지고 있는 돈은  감소하고 포인트는 올라간다
구매자는 처음 초기 금액을 가질 수 있다
*/
class Buyer {
	int momey = 1000;
	int bonuspoint;
	
	// 구매행위 (기능)
	// 구매행위 (잔액 - 제품의 가격,포인트 정보갱신)
	// 구매자는 매장에 있는 모든 물건을 구매 할 수 있다.

	// 1차 오픈 성공적
	// 하와이 휴가

	// 매장에 제품이 1000개의 다른 제품이 추가(제품 등록 pos 등록 자동화
	// 1000개 다른 제품이 배치
	// 1.매장에서 나머지 997개의 제품을 판매할 수 있을까요
	// 나머지 997개의 제품을 구매할 수 있는 기능을 만들지 않았다
	// 2.난리>>인터넷>>개발서버에 접속>>휴가 기간동안 개발 >>997개의 함수 만들기
	// 다 만들고 나니까 휴가는 끝
	// 변화에 대응하지 못하는 코드
	// 즐거운 휴가를 보내기 위한 방법을 제시하세요
	// 1조)
	/*
	 * 
	 * 
	 * // 1차코드 물건을 구매할수 있는 기능 3개 void kttvBuy(KtTv n) { // 함수가 제품 객체를 parameter
	 * 받아서(가격,포인트) if (this.momey < n.price) { System.out.println(
	 * "고객님 잔액이 부족합니다^^" + this.momey); return; } // 실 구매행위 this.momey -=
	 * n.price; // 잔액 this.bonuspoint += n.bonuspoint; // 누적 System.out.println(
	 * "구매한 물건은:" + n.toString()); }
	 * 
	 * void AudioBuy(Audio n) { // 함수가 제품 객체를 parameter 받아서(가격,포인트) if
	 * (this.momey < n.price) { System.out.println("고객님 잔액이 부족합니다^^" +
	 * this.momey); return; } // 실 구매행위 this.momey -= n.price; // 잔액
	 * this.bonuspoint += n.bonuspoint; // 누적 System.out.println("구매한 물건은:" +
	 * n.toString()); }
	 * 
	 * void NotebookBuy(Notebook n) { // 함수가 제품 객체를 parameter 받아서(가격,포인트) if
	 * (this.momey < n.price) { System.out.println("고객님 잔액이 부족합니다^^" +
	 * this.momey); return; } // 실 구매행위 this.momey -= n.price; // 잔액
	 * this.bonuspoint += n.bonuspoint; // 누적 System.out.println("구매한 물건은:" +
	 * n.toString()); }
	 */

	// 2차 코드 개선(리팩토링)
	// 하나의 이름으로 여러가지 기능을 하도록 만들지(method overloding)
	/*
	 void kBuy(KtTv n) { // 함수가 제품 객체를 parameter 받아서(가격,포인트)
	 
		if (this.momey < n.price) {
			System.out.println("고객님 잔액이 부족합니다^^" + this.momey);
			return;
		}
		// 실 구매행위
		this.momey -= n.price; // 잔액
		this.bonuspoint += n.bonuspoint; // 누적
		System.out.println("구매한 물건은:" + n.toString());
	}

	void Buy(Audio n) { // 함수가 제품 객체를 parameter 받아서(가격,포인트)
		if (this.momey < n.price) {
			System.out.println("고객님 잔액이 부족합니다^^" + this.momey);
			return;
		}
		// 실 구매행위
		this.momey -= n.price; // 잔액
		this.bonuspoint += n.bonuspoint; // 누적
		System.out.println("구매한 물건은:" + n.toString());
	}

	void Buy(Notebook n) { // 함수가 제품 객체를 parameter 받아서(가격,포인트)
		if (this.momey < n.price) {
			System.out.println("고객님 잔액이 부족합니다^^" + this.momey);
			return;
		}
		// 실 구매행위
		this.momey -= n.price; // 잔액
		this.bonuspoint += n.bonuspoint; // 누적
		System.out.println("구매한 물건은:" + n.toString());
	}
	*/
	
	//3차 개선 (중복코드 제거) >>
	//제품이 추가되더라도 구매 행위는 계속 되어야 한다
	//why : 즐거운 휴가를 보내기 위해서
	//하나의 이름으로 반복코드를 제어 하려고
	//모든 제품의 부모는 Product이다
	//Product P;
	//Audio audio = new Audio();
	//p = audio point
	//NoteBook noteBook = new NoteBook();
	//p = noteBook point
	//단 부모는 자신 것만 접근 가능
	//toString() 자식이 재정의 한것 재정의 한것은 부모 타입으로 접근하더라도 재정의 한 곳으로 넘어간다
	//부모로 접근 하고 싶으면 함수를 새로 만들어서 해야한다(super)
	
	
	void Buy(Product product) { // 함수가 제품 객체를 parameter 받아서(가격,포인트)
		if (this.momey < product.price) {
			System.out.println("고객님 잔액이 부족합니다^^" + this.momey);
			return;
		}
		// 실 구매행위
		this.momey -= product.price; // 잔액
		this.bonuspoint += product.bonuspoint; // 누적
		System.out.println("구매한 물건은:" + product.toString());
		System.out.println("잔액: " + this.momey);
		System.out.println("포인트: "+this.bonuspoint);
	}
	
}

class Product {
	int price;
	int bonuspoint;

	Product(int price) {
		this.price = price;
		this.bonuspoint = (int) (this.price / 10.0);
	}
}

class KtTv extends Product { // KtTv kttv = new KtTv() >>가격을 강제로 입력 (오버로딩)
	KtTv() {
		super(500);
	}


	public String toString() {
		return "KtTv";
	}
}

class Audio extends Product { // Audio audio = new Audio() >>가격을 강제로 입력
								// (오버로딩)
	Audio() {
		super(100);
	}

	@Override
	public String toString() {
		return "Audio";
	}
}

class Notebook extends Product { // Notebook notebook = new Notebook() >>가격을
									// 강제로
									// 입력 (오버로딩)
	Notebook() {
		super(150);
	}

	@Override
	public String toString() {
		return "Notebook";
	}
}

public class Ex12_Inherit_KeyPoint {

	public static void main(String[] args) {
		KtTv kttv = new KtTv();
		System.out.println(kttv.toString());

		Audio audio = new Audio();
		System.out.println(audio.toString());

		Notebook notebook = new Notebook();
		System.out.println(notebook.toString());

		Buyer buyer = new Buyer(); // 고객
		buyer.Buy(kttv);
		buyer.Buy(audio);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);

		// 1차 오픈 테스트
		// 구매행위

		/*
		 buyer.kttvBuy(kttv); 
		 buyer.NotebookBuy(notebook);
		 buyer.AudioBuy(audio); 
		 buyer.kttvBuy(kttv); 
		 buyer.kttvBuy(kttv);
		 */

	}

}
