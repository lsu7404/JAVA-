package ch04.sec03;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input;
		String answer = "";
		
		System.out.println("과정 안내 프로그램");
		System.out.println();
		
		do {
			System.out.println("\n1~4 번호 입력 :");
			input = sc.nextInt();
			
			switch(input) {
			case 1:System.out.println("Java 프로그래밍"); break;
			case 2:System.out.println("데이터베이스"); break;
			case 3:System.out.println("빅데이터 분석"); break;
			case 4:System.out.println("AI"); break;
			default:System.out.println("잘못 입력하였습니다.");
			}
			
			System.out.println("\n계속 입력하시겠습니까?(y/n 입력):");
			answer = sc.next();
			
		}while(answer.equals("y")); // 5가 아니면 반복
		
		System.out.println("종료합니다.");
		sc.close();
		}

	

}
