package ch06.sec03;

import java.util.Scanner;

public class MemberEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id, name, hp, address;
		int age;
		
		Member m1 = new Member("hkd", "ȫ�浿",30,"010-1234-5678","����� ������ ��ġ��");
		m1.showMember();
		
		System.out.println("----------------------------\n");
		
		System.out.println("���̵� �Է�:");
		id = sc.next();
		
		System.out.println("���� �Է�:");
		name = sc.next();
		
		System.out.println("���� �Է�:");
		age=sc.nextInt();
		
		System.out.println("��ȭ��ȣ �Է�:");
		hp=sc.next();

		System.out.println("�ּ� �Է�:");
		address = sc.next();
		
		Member m2 = new Member(id,name,age,hp,address);
		m2.showMember();
		
		sc.close();
	}

}
