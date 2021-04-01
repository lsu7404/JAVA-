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
	} //메뉴창 Source Generate Constructor using Fields 에서 만들수도 있음.
	
	public void showMember() {
		System.out.println("-----회원 정보 출력-----");
		System.out.println("ID :"+id);
		System.out.println("성명 :"+name);
		System.out.println("나이 :"+age);
		System.out.println("전화 :"+hp);
		System.out.println("주소 :"+address);
	}
}
