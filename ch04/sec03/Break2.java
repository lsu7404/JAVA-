package ch04.sec03;

public class Break2 {

	public static void main(String[] args) {
		//�ٱ��� �ݺ������� ����
		//�ݺ����� �̸�(��)�� ���̰� break �̸�;
		Outter:for(char upper='A';upper<='Z';upper++) {
			for(char lower='a';lower<='z';lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break; //���� for���� ����				
			}
		}
		}
	
		System.out.println("���α׷� ���� ����");
		}
}
		//���� for���� ����
		/*for(char upper='A';upper<='Z';upper++) {
			for(char upper='A';upper<='Z';upper++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break; //���� for���� ����	 */
	


