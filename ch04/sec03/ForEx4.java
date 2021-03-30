package ch04.sec03;

import java.util.Scanner;

public class ForEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int pos=0, neg=0, zero=0;
		
		for(int i = 1;i<=10;i++) {
			System.out.println("숫자"+i+"입력:");
			num = sc.nextInt();
			if(num>0)
				pos++;
			else if(num<0)
				neg++;
			else
				zero++;
		}
		
		System.out.println("\n양수 개수:" + pos);
		System.out.println("음수 개수:" + neg);
		System.out.println("0의 개수:" + zero);
		
		sc.close();

	}

}
