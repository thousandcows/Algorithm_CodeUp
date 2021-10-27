package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1048 {
	// 1048 : [기초-비트시프트연산] 한 번에 2의 거듭제곱 배로 출력하기
	public static void main(String[] args) {
		
		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// int형 정수 2개 입력받기
		int intVal1 = scan.nextInt();
		int intVal2 = scan.nextInt();
		
		int powerVal = 1;
		// 반복문으로 거듭제곱한 값 구하기
		for(int i =0; i < intVal2; i++) {
			powerVal *= 2;
		}
		
		// a*2^b 값 구해서 출력하기
		System.out.println(intVal1 * powerVal);
		
	}
}