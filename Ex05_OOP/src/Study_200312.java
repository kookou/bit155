class Product5 {
	int price;
	int bonuspoint;
	
	Product5(int price){
		this.price = price;
		this.bonuspoint = (int)(this.price/10.0);
	}
}

class KtTv5 extends Product5{
	KtTv5(){
		super(500);
	}

	@Override
	public String toString() {
		return "KtTv5";
	}
}

class Audio5 extends Product5{
	Audio5(){
		super(100);
	}

	@Override
	public String toString() {
		return "Audio5";
	}
	
}

class NoteBook5 extends Product5{
	NoteBook5(){
		super(250);
	}

	@Override
	public String toString() {
		return "NoteBook5";
	}
}

class Buyer5{
	int money = 1000;
	int bonuspoint;
	
	void Buy(Product5 product5){
		if(this.money < product5.price){
			System.out.println("잔액부족"+this.money);
			return;
		}
		this.money -=product5.price;
		this.bonuspoint+=product5.bonuspoint;
		System.out.println("구매한 물건"+product5.toString());
		System.out.println("잔액"+this.money);
		System.out.println("포인트"+this.bonuspoint);
	}
}
public class Study_200312 {

	public static void main(String[] args) {
		KtTv5 tv = new KtTv5();
		Audio5 ad = new Audio5();
		NoteBook5 no = new NoteBook5();
		
		Buyer5 by = new Buyer5();
		by.Buy(no);
		by.Buy(ad);
		by.Buy(tv);
		by.Buy(tv);
		
		
	

	}

}
