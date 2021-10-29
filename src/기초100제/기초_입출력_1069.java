package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1069 {
	// 1069 : [기초-조건/선택실행구조] 평가 입력받아 다르게 출력하기
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// 성적 입력받기
		char grade = scan.next().charAt(0);

		// switch문으로 내용 출력하기
		// switch()에 주어지는 값은 정수만 가능하며, 문자는 아스키 정수이기 때문에 가능한 것!
		switch(grade) {
		case 'A':
			System.out.println("best!!!");
			break;
		case 'B':
			System.out.println("good!!");
			break;
		case 'C':
			System.out.println("run!");
			break;
		case 'D':
			System.out.println("slowly~");
			break;
		default:
			System.out.println("what?");
			break;
		}
	}
}
