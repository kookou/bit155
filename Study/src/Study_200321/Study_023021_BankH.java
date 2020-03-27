package Study_200321;
import kr.or.bit.AccountH;
import kr.or.bit.BankH;

public class Study_023021_BankH {

	public static void main(String[] args) {
		BankH b= new BankH();
		AccountH a = new AccountH();
		b.addAccount("1111-2222-3333", "박씨");
		b.addAccount("2222-3333-4444", "김씨");
		b.addAccount("4444-2222-3333", "이씨");
		b.addAccount("3333-4444-1111", "이씨");
		b.getAccount("1111-2222-3333");
		b.findAccounts("박씨");
		b.getAccount("4444-2222-3333");
		b.findAccounts("이씨");
		a.deposit((long)(20000));
		
		

	
		
		
	}

}
