package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1012 {
	public static void main(String[] args) {
		
		// import java.util.Scanner
		Scanner scan = new Scanner(System.in);
		
		// Declare Float floatVal and assign value 
		Float floatVal = scan.nextFloat();
		
		// Print floatVal
		System.out.printf("%f", floatVal);
		
		// java에서 부동소수점(float, double) 자료형의 형식 지정자는 %f임.
	}
}
