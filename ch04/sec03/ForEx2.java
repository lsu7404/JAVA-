package ch04.sec03;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan;
		
		System.out.print("�� �� �Է� : ");
		dan = sc.nextInt();
		
		for(int i=1; i<=9; i++)
			System.out.println(dan + "x" + i + "=" +dan*i);
		
		sc.close();
	}

}
