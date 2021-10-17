package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1013 {
	public static void main(String[] args) {
		
		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// int형 변수 2개 선언 
		int a, b;
		
		// String 배열을 선언하고 공백으로 값을 나누어 담기
		String [] arr = scan.nextLine().split(" ");
		
		// int형 변수로 바꾸어 a, b에 각각 입력하기
		a = Integer.parseInt(arr[0]);
		b = Integer.parseInt(arr[1]);
		
		
		// 입력한 a, b값 출력하기
		System.out.println(a + " " + b);
		
	}
}
