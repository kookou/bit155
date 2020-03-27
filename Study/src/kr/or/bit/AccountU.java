package kr.or.bit;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AccountU {
	private String accountNo;
	private String name;
	private long balance;
	private List<TransactionU> transactions = new ArrayList();

	Date today = new Date();
	SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
	SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

	// 추가
	AccountU(String accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
	}

	public void deposit(long amount) {
		balance += amount;
		transactions.add(new TransactionU(date.format(today), time.format(today), "입금", amount, balance));
	}

	public void withdraw(long amount) {
		balance -= amount;
		transactions.add(new TransactionU(date.format(today), time.format(today), "출금", amount, balance));
	}

	public long getBalance() {
		return balance;
	}
	// public List<Transaction> getTransactions() {
	// return transactions;
	// }

	public void getTransactions() { // 전체트랜잭션 목록 조회 수정판
		Iterator ia = this.transactions.iterator();
		while (ia.hasNext()) {
			System.out.println(ia.next());
		}
	}

	// -----------------------------

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public void setTransactions(List<TransactionU> transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + ", transactions="
				+ transactions + "]";
	}

}