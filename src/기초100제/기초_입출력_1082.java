package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1082 {
	// 1082 : [기초-종합] 16진수 구구단?
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// 16진수 1개 입력받기
		int hexInt = scan.nextInt(16);
		
		// for문으로 16진수 구구단 출력하기
		for(int i = 0x1; i <= 0xF; i++) {
			String hexNumber = Integer.toHexString(hexInt).toUpperCase();
			String multiplier = Integer.toHexString(i).toUpperCase();
			String result = Integer.toHexString(hexInt * i).toUpperCase();
			System.out.println(hexNumber +"*"+multiplier+"="+result);
		}
	}
}
