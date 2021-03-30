package ch04.sec03;

public class Break2 {

	public static void main(String[] args) {
		//바깥쪽 반복문까지 종료
		//반복문에 이름(라벨)을 붙이고 break 이름;
		Outter:for(char upper='A';upper<='Z';upper++) {
			for(char lower='a';lower<='z';lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break; //안의 for문만 종료				
			}
		}
		}
	
		System.out.println("프로그램 실행 종료");
		}
}
		//안의 for문만 종료
		/*for(char upper='A';upper<='Z';upper++) {
			for(char upper='A';upper<='Z';upper++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break; //안의 for문만 종료	 */
	


