package ch05.sec02;

public class Array2 {

	public static void main(String[] args) {
		// ����� ���ÿ� �޸� �Ҵ�
		int[]b=new int[5];
		//�ʱ�ȭ ����Ʈ
		//���� + �޸� �Ҵ� + �� ����
		String[]flowers= {"�عٶ��","���","���޷�"};
		
		// for���� ����ؼ� �迭 b�� �� ���ҿ� �� ����
		// 0, 1, 2, 3, 4
		
		
		
		// �迭 b�� �� ������ �� ���
		//b[0]=0
		// ...
		for(int i=0;i< b.length ;i++)
			System.out.println("b["+i+"]"+b[i]);
		
		// �迭 flowers�� �� ������ �� ���
		// flowers[0]=�عٶ��
		// ...
		for(int i=0;i< flowers.length ;i++)
			System.out.println("flowers["+i+"]"+flowers[i]);
		
		//�� �迭�� ũ�� ��� : length
		System.out.println("�迭 b�� ũ�� :"+b.length);
		System.out.println("�迭flowers�� ũ�� :"+flowers.length);
		
	}

}
