package ch03.sec04;

import java.util.Scanner;

public class CompareOperator2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String pass = "1234";
		String userPass;
		
		System.out.print("비밀번호 입력 :");
		userPass=sc.next();
		
		//문자열 비교
		//==사용하지 않고 equals() 메소드 사용
		if(pass.equals(userPass))
			System.out.print("Pass");
		else
			System.out.println("no Pass");
		
		sc.close();
	}

}
