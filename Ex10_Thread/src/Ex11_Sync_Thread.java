//d은행계좌를 하나 가지고 있다
//은행 계좌를 통해 입금 출금 할 수있다

//친구 3명 똑같은 카드 3 복제
//동시에 출금(같은계좌)
//통장 100
//ATM 기기 출금

class Account{
	int balance = 1000; //잔액
	//누군가 한명이라도 withDraw에 들어오면 작업이 끝날떄 까지 Lock 걸어두기
	synchronized void withDraw(int money){
		System.out.println("고객 : "+ Thread.currentThread().getName());
		System.out.println("현재 잔액 : "+this.balance);
		if(this.balance >= money){
			try {
				Thread.sleep(1000); //1초 재우기 인출하려면 사용자인증, 비번 확인.. 시간이 걸린다는 가정
			} catch (Exception e) {
			 System.out.println(e.getMessage());
			}
			this.balance -= money;
		}
		System.out.println("인출금액 : "+money);
		System.out.println("인출후 잔액 : "+this.balance);
	}
}


class Bank implements Runnable{
	Account acc = new Account();

	@Override
	public void run() {
		while(acc.balance > 0){
			int money = ((int)(Math.random()*3)+1)*1000;
			acc.withDraw(money);
		}
		
	}
	
}
public class Ex11_Sync_Thread {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Thread th = new Thread(bank,"Park"); 
		Thread th2 = new Thread(bank,"Kim"); 
		Thread th3 = new Thread(bank,"Lee"); 
		
		th.start();
		th2.start();
		th3.start();
		

	}

}
