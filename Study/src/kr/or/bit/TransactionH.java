package kr.or.bit;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TransactionH {
	private String transactionDate;  //거래일
	private String transactionTime;  //거래시간
	private String kind;  //구분(입금or출금)
	private long amount; //거래금액
	private long balance;  //잔고
	Date today = new Date();
	
	public String getTransactionDate() {
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		transactionDate = date.format(today);
		return transactionDate;
	}
	public String getTransactionTime() {
		SimpleDateFormat time = new SimpleDateFormat("a HH:mm");
		transactionTime = time.format(today);
		return transactionTime;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}

}
