package kr.or.bit;

import java.util.ArrayList;

public class BankH {
	private ArrayList<AccountH> accounts;
	private int totalAccount;
	
	public BankH(){
		totalAccount = 0;
		accounts = new ArrayList<>();
	}
	
	//계좌번호, 이름을 계좌에 등록
	public void addAccount(String accountNo , String name) {
		accounts.add(new AccountH(accountNo, name));
		totalAccount++;
	}
	
	//계좌번호로 계좌 찾기
	public AccountH getAccount(String accountNo) {
		AccountH rAccountNo = null;
		for(int i = 0; i < accounts.size(); i++){
			if(accounts.get(i).getAccountNo().equals(accountNo)){
			rAccountNo = accounts.get(i);
			System.out.println("["+accountNo+"]"+" 계좌로 조회하신 고객님의 성함은 "+"["+accounts.get(i).getName()+"]");
			}
		}return rAccountNo;
	}
	
	//이름으로 계좌 찾기
	public ArrayList<AccountH> findAccounts(String name){
		ArrayList<AccountH> rNamearr = new ArrayList<>();
		for(int i = 0; i < accounts.size(); i++){
			if(accounts.get(i).getName().equals(name)){
				rNamearr.add(accounts.get(i));
			System.out.println("["+accounts.get(i).getName()+"]"+" 이름으로 조회하신 고객님의 계좌는 "+"["+accounts.get(i).getAccountNo()+"]");
			}
		}return rNamearr;
	}
	public ArrayList<AccountH> getAccounts(){
		return accounts;
	}
	public int TotalAccount(){
		return totalAccount;
	}
}
