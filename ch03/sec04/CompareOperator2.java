package ch03.sec04;

import java.util.Scanner;

public class CompareOperator2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String pass = "1234";
		String userPass;
		
		System.out.print("��й�ȣ �Է� :");
		userPass=sc.next();
		
		//���ڿ� ��
		//==������� �ʰ� equals() �޼ҵ� ���
		if(pass.equals(userPass))
			System.out.print("Pass");
		else
			System.out.println("no Pass");
		
		sc.close();
	}

}
