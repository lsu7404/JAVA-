package ch04.sec03;

import java.util.Scanner;

//do~while ��
//���ǿ� ���� ������� ������ �� ��� (while ���� ����)
// ������ �� ���� �����

public class DoWhile1 {

	public static void main(String[] args) {
		//�ݺ��ؼ� ���� �Է�
		//0�Է��ϸ� �ݺ��� ����
		//�Է��� ���� ���� ���
		
	Scanner sc=new Scanner(System.in);
	int num,sum=0;
	
	do {
		System.out.println("���� �Է� :");
		num=sc.nextInt();
		sum+=num;//sum=sum+num;
	} while(num!=0);//0�� �ƴϸ� ��� �ݺ�
	
	System.out.println("0 �Է�. �ݺ��� ����.");
	System.out.println("�Է��� ���� ���� :" +sum);
	
	sc.close();
	}

}
