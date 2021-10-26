package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1035 {
	// 1035 : [기초-출력변환] 16진 정수 1개 입력받아 8진수로 출력하기
	public static void main(String[] args) {
		
		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// 16진 정수 int형으로 입력받기
		int hexNum = scan.nextInt(16);
		
		// 8진수로 출력하기
		String octNum = Integer.toOctalString(hexNum);
		System.out.println(octNum);
	}
}
