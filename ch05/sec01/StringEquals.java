package ch05.sec01;

//���ڿ� �� : equals() �޼ҵ� ���
//��ü ���� �� :==
public class StringEquals {

	public static void main(String[] args) {
		String strVar1 = "ȫ�浿";
		String strVar2 = "ȫ�浿";
		
		//������ ��ü�� �����ϴ��� ����
		if(strVar1==strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		} else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}

		//���ڿ��� ������ ��
		if(strVar1.contentEquals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		
			String strVar3 = new String("ȫ�浿");
			String strVar4 = new String("ȫ�浿");
			
			//������ ��ü�� �����ϴ��� ����
			if(strVar3==strVar4) {
				System.out.println("strVar3�� strVar4�� ������ ����");
			} else {
				System.out.println("strVar3�� strVar4�� ������ �ٸ�");
			}

			//���ڿ��� ������ ��
			if(strVar3.equals(strVar4)) {
				System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
		}
	}

	}
}
