package Day09.Ex05_UserException;

public class AccountEx {

		public static void main(String[] args) {
			Account account = new Account();
			
//			10000입금
			account.deposit(10000);
			
//			20000출금
			try {
				account.withdraw(20000);		//<-- Account 클래스의 withdraw 메소드에서 이쪽으로 예외를 전가시켰기 때문에 실행 불가				
			} catch (BalanceException e) {
				e.printStackTrace();
			}
		}
}