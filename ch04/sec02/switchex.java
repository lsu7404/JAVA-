package ch04.sec02;

import java.util.Scanner;

public class switchex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		char grade;
		
		System.out.print("���� �Է� (0~100) : ");
		score = sc.nextInt();
		
		switch (score/10) {
		case 10:
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F';
		}
		
		System.out.println("���� : "+ grade);
		
		sc.close();
		
		switch (score/10) {
		case 10: //score = 100�� 10���� ������ 10
		case 9: //90<=score<=99 ���ڸ� 10���� ������ ��� 9.x -> 9 (����)
			grade='A';break;
		case 8: //80<=score<=89 ���ڸ� 10���� ������ ��� 8.x -> 8 (����)
			grade='B';break;
		case 7: //70<=score<=79 ���ڸ� 10���� ������ ��� 7.x -> 7 (����)
			grade='C';break;
		case 6: //60<=score<=69 ���ڸ� 10���� ������ ��� 6.x -> 6 (����)
			grade='D';break;
		default: //score<=59
			grade='F';
		}
		

	}

}
