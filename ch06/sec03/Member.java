package ch06.sec03;

public class Member {
	String id;
	String name;
	int age;
	String hp;
	String address;
	
	public Member(String id, String name,int age,String hp,String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.hp = hp;
		this.address=address;
	} //�޴�â Source Generate Constructor using Fields ���� ������� ����.
	
	public void showMember() {
		System.out.println("-----ȸ�� ���� ���-----");
		System.out.println("ID :"+id);
		System.out.println("���� :"+name);
		System.out.println("���� :"+age);
		System.out.println("��ȭ :"+hp);
		System.out.println("�ּ� :"+address);
	}
}
