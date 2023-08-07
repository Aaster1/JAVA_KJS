package _12;

public class Account {
	String accountNumber,accountHolder;
	int balance;
	String password;
	final int MIN_BALANCE=0;
	final int MAX_BALANCE=1000000000;
	final int MIN_TRANSFER= 0;
	final int MAX_TRANSFER=1000000;
	
	public Account() {
		this("계좌없음","이름없음",0);
	}
	
	public Account(String accountNumber,String accountHolder,int balance) {
		this.accountNumber=accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
		
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getBalance() {
		return balance;
	}

	public boolean setBalance(int balance) {
		if(balance>MIN_TRANSFER&&balance<MAX_TRANSFER) {
			this.balance = balance;
			return true; 
			
		}else {
			return false;
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void deposit(int n) {
		if(n>MIN_TRANSFER&&n<MAX_TRANSFER) {
			if(balance+n<MAX_BALANCE) {
				balance +=n;
			}else {
				System.out.println("이 이상 입금할 수 없습니다.");
			}
		}else {
			System.out.println("거래한도초과");
		}
	}
	public void withdrawal(int n) {
		if(n>MIN_TRANSFER&&n<MAX_TRANSFER) {
			if(balance-n>MIN_BALANCE) {
				balance -=n;
			}else {
				System.out.println("잔액부족");
			}
		}else {
			System.out.println("거래한도초과");
		}
	}

	@Override
	public String toString() {
		return accountHolder+"\t\t"+accountNumber+"\t\t"+balance;
	}
	
}
