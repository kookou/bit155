import kr.or.bit.Card;

public class Ex06_Static_CardMake {

	public static void main(String[] args) {
		//�䱸���� card ���� (�޸�)
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
		//53�� ���� .....
		//�� �䱸 ���� : ũ�Ⱑ �̰� �ƴѵ���
		//h = 70  w = 50 
		//���赵�� �ٽ� ���� ...
		//53����  �ٽ� ���� ...
		//������ ī�� ���� �ʺ� .... 53
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
















