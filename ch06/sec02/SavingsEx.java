package ch06.sec02;

public class SavingsEx {

	public static void main(String[] args) {
		Savings sa = new Savings();
		
		sa.setName();
		sa.setBalance();
		System.out.println("������ :"+ sa.getName());
		System.out.println("�Ա��� �ܾ� :"+ sa.getBalance());
		sa.inputDeposit();
		System.out.println("���� :"+ sa.getInterest());
		System.out.println("���� �ܾ� :"+ sa.getBalance());

	}

}
