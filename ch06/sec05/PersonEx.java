package ch06.sec05;

public class PersonEx {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567","홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "USA";//final 필드 수정 불가
		//p1.ssn="6543f21-7654321";//final 필드 수정 불가
		p1.name="이몽룡";
		

	}

}
