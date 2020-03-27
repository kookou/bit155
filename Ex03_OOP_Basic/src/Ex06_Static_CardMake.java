import kr.or.bit.Card;

public class Ex06_Static_CardMake {

	public static void main(String[] args) {
		//요구사항 card 제작 (메모리)
		/*
		Card c = new Card();
		c.number = 1;
		c.kind = "heart";
		c.cardInfo();
		
		Card c2 = new Card();
		c2.number = 2;
		c2.kind = "heart";
		c2.cardInfo();
		*/
		//53개 제작 .....
		//고객 요구 사항 : 크기가 이게 아닌데요
		//h = 70  w = 50 
		//설계도를 다시 변경 ...
		//53장을  다시 제작 ...
		//각각의 카드 높이 너비 .... 53
		//c2.h = 70;
		//c3.h = 70;
		Card c = new Card();
		c.number = 1;
		c.kind = "heart";
		c.h= 70;
		c.w= 50;
		c.cardInfo();
		
		Card c2 = new Card();
		c2.number = 2;
		c2.kind = "heart";
		c2.cardInfo();
	}

}
















