package ch04.sec03;

import java.util.Scanner;

//do~while 문
//조건에 따라 계속할지 결정할 때 사용 (while 문과 동일)
// 무조건 한 번은 수행됨

public class DoWhile1 {

	public static void main(String[] args) {
		//반복해서 숫자 입력
		//0입력하면 반복문 종료
		//입력한 숫자 총합 출력
		
	Scanner sc=new Scanner(System.in);
	int num,sum=0;
	
	do {
		System.out.println("숫자 입력 :");
		num=sc.nextInt();
		sum+=num;//sum=sum+num;
	} while(num!=0);//0이 아니면 계속 반복
	
	System.out.println("0 입력. 반복문 종료.");
	System.out.println("입력한 숫자 총합 :" +sum);
	
	sc.close();
	}

}
