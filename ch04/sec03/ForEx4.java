package ch04.sec03;

import java.util.Scanner;

public class ForEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int pos=0, neg=0, zero=0;
		
		for(int i = 1;i<=10;i++) {
			System.out.println("����"+i+"�Է�:");
			num = sc.nextInt();
			if(num>0)
				pos++;
			else if(num<0)
				neg++;
			else
				zero++;
		}
		
		System.out.println("\n��� ����:" + pos);
		System.out.println("���� ����:" + neg);
		System.out.println("0�� ����:" + zero);
		
		sc.close();

	}

}
