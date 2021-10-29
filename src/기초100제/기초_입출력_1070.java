package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1070 {
	// 1070 : [기초-조건/선택실행구조] 월 입력받아 계절 출력하기
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// 계절 입력받기
		int month = scan.nextInt();
		
		// switch문으로 내용 출력하기
		// break;를 제거하면 멈추지 않고 다음 명령이 실행되는 특성을 이용한다.
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("fall");
			break;
		}
	}
}
