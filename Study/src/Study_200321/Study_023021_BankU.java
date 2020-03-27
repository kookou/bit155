package Study_200321;

import java.util.List;

import kr.or.bit.AccountU;
import kr.or.bit.BankU;

public class Study_023021_BankU {

	public static void main(String[] args) {
		BankU bank = new BankU();
		// 계좌 생성
		bank.addAccount("1111", "강감찬");
		bank.addAccount("2222", "유관순");
		bank.addAccount("3333", "유관순");
		try {
			// 계좌번호 or 소유자명으로 계좌를 찾는다.
			System.out.println("1111라는 계좌번호를 가진 사람의 계좌");
			System.out.println(bank.getAccount("1111").toString());
			// aaa라는 이름을 가진 계좌를 찾는다.
			System.out.println("유관순 이라는 이름을 가진 사람의 계좌");
			System.out.println(bank.findAccounts("유관순").toString());
		} catch (NullPointerException npe) {
			System.out.println("찾는 계좌가 없습니다.");
		}
		System.out.println();
		System.out.println("전체 계좌 목록");
		bank.getTotalAccounts();
		// 계좌 클래스 기능의 입금,출금,잔고확인,거래내역을 다루기 위한 계좌 get
		List<AccountU> list = bank.getAccounts();
		for (AccountU ac : list) {
			if (ac.getAccountNo() == "1111") { //
				System.out.println(list.get(0).getName());
				list.get(0).deposit(1000);
				list.get(0).deposit(2000);
				list.get(0).deposit(3000);
				System.out.println(list.get(0).getBalance());
				list.get(0).withdraw(3000);
				System.out.println(list.get(0).getBalance());
				System.out.println(bank.getAccount("1111").toString());
				System.out.println();
				list.get(0).getTransactions(); // 트랜잭션 전체보기
			}
		}
	}

	
}
