package ch06.sec02;

public class SavingsEx {

	public static void main(String[] args) {
		Savings sa = new Savings();
		
		sa.setName();
		sa.setBalance();
		System.out.println("예금주 :"+ sa.getName());
		System.out.println("입금전 잔액 :"+ sa.getBalance());
		sa.inputDeposit();
		System.out.println("이자 :"+ sa.getInterest());
		System.out.println("최종 잔액 :"+ sa.getBalance());

	}

}
