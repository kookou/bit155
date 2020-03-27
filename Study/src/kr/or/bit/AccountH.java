package kr.or.bit;

import java.util.ArrayList;

public class AccountH{
	private String accountNo;  //계좌번호
	private String name;       //계좌 소유자 이름
	private long balance;      //계과잔고
	private ArrayList <TransactionH> transactions; //명세서
	
	
	public AccountH(){
		transactions = new ArrayList<>();
	}
	
	public AccountH(String accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
		transactions = new ArrayList<>();
	}
	//입금
	public void deposit(Long amount){
		TransactionH t = new TransactionH();
		balance += amount;
		t.setAmount(amount);
		t.setBalance(balance);
		t.setKind("입금");
		t.getTransactionDate();
		t.getTransactionTime();
		
		transactions.add(t);
	}
	//출금
	public void withdraw(Long amount){
		TransactionH t = new TransactionH();
		balance -= amount;
		t.setAmount(amount);
		t.setBalance(balance);
		t.setKind("출금");
		t.getTransactionDate();
		t.getTransactionTime();
		transactions.add(t);
	}
	public long getBalance(){
		return balance;
	}
	public ArrayList<TransactionH> geTransactions(){
		return transactions;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public String getName() {
		return name;
	}
	

}
