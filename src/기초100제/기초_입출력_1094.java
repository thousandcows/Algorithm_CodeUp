package 기초100제;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 기초_입출력_1094 {
	// 1094 : [기초-1차원배열] 이상한 출석 번호 부르기2
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// 출석 횟수 정수n 입력받기
		int countNum = scan.nextInt();
		
		// 크기가 countNum인 int형 배열 생성
		int [] countArray = new int[countNum];
		
		// for문 활용하여 부른 번호를 배열에 저장
		for(int i = 0; i < countArray.length; i++) {
			countArray[i] = scan.nextInt();
		}
		
		// 저장된 배열을 역순으로 출력
		for(int i = countArray.length-1; i >= 0; i--) {
			System.out.print(countArray[i] + " ");
		}
		
	}
}