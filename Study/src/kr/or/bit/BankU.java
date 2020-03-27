package kr.or.bit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BankU {
	private List<AccountU> accounts;
	private int totalAccount;

	public BankU() {
		accounts = new ArrayList();
		totalAccount = 0;
	}

	public void addAccount(String accountNo, String name) {
		this.accounts.add(new AccountU(accountNo, name));
		totalAccount++;
	}

	public AccountU getAccount(String accountNo) {
		for (AccountU account : accounts) {
			if (account.getAccountNo().equals(accountNo)) {
				return account;
			}
		}
		// 매개변수로 받은 accountNo값이 없을 시 반환할 값
		return null;
	}

	public List<AccountU> findAccounts(String name) { // 찾는 이름을 여러개 리턴
		List<AccountU> ac = new ArrayList();
		for (AccountU account : accounts) {
			if (account.getName().equals(name)) {
				ac.add(account);
			}
		}
		return ac.size() == 0 ? null : ac;
	}

	public void getTotalAccounts() { // 전체계좌목록 조회 수정판
		Iterator ia = this.accounts.iterator();
		while (ia.hasNext()) {
			System.out.println(ia.next());
		}
	}

	public List<AccountU> getAccounts() {
		return this.accounts;
	}

	@Override
	public String toString() {
		return "Bank [accounts=" + accounts + ", totalAccount=" + totalAccount + "]";
	}
}