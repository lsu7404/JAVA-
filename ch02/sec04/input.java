package ch02.sec04;

//자동 import : Ctrl+shift+O

import java.util.Scanner; 

//Scanner 클래스를 이용한 키 입력

public class input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("첫번째 숫자 입력:");
		num1 = sc.nextInt(); // 입력한 값을 정수로 반환해서 num1에 저장
		System.out.println(num1);
		
		// 두번째 입력
		System.out.print("두번째 숫자 입력:");
		num2 = sc.nextInt(); // 입력한 값을 정수로 반환해서 num1에 저장
		System.out.println(num2);
		
		// 두 수의 합 출력
		System.out.println("두 수의 합:" + (num1 + num2));
		
		// 두 수의 곱 출력
		System.out.println("두 수의 곱:" + (num1 * num2));
		
		sc.close(); //리소닝 낭비를 막기 위해 닫기
	}

}
