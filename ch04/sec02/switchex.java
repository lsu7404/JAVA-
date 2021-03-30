package ch04.sec02;

import java.util.Scanner;

public class switchex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		char grade;
		
		System.out.print("점수 입력 (0~100) : ");
		score = sc.nextInt();
		
		switch (score/10) {
		case 10:
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F';
		}
		
		System.out.println("학점 : "+ grade);
		
		sc.close();
		
		switch (score/10) {
		case 10: //score = 100을 10으로 나누면 10
		case 9: //90<=score<=99 숫자를 10으로 나누면 모두 9.x -> 9 (정수)
			grade='A';break;
		case 8: //80<=score<=89 숫자를 10으로 나누면 모두 8.x -> 8 (정수)
			grade='B';break;
		case 7: //70<=score<=79 숫자를 10으로 나누면 모두 7.x -> 7 (정수)
			grade='C';break;
		case 6: //60<=score<=69 숫자를 10으로 나누면 모두 6.x -> 6 (정수)
			grade='D';break;
		default: //score<=59
			grade='F';
		}
		

	}

}
