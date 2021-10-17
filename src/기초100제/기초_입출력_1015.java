package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1015 {
	// [기초-입출력] 실수 입력받아 둘째 자리까지 출력하기
	public static void main(String[] args) {
		
		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// float형 변수 선언 및 값 저장하기
		Float floatVal = scan.nextFloat();
		
		// 실수형 값을 소숫점 둘째 자리까지 출력하기
		System.out.printf("%.2f", floatVal);
		
		// %.숫자f라고 한다면 실수형을 입력한 숫자의 자리까지 반올림하여 출력한다.
		
	}
}
