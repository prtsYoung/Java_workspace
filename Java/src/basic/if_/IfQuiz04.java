package basic.if_;

import java.util.Scanner;

public class IfQuiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("정수3 : ");
		int num3 = sc.nextInt();

		int max = 0;
		int mid = 0;
		int min = 0;

		if (num1 > num3 && num1 > num2) {
			max = num1;
			if (num2 > num3) {
				mid = num2;
				min = num3;
			} else {
				min = num3;
				mid = num2;
			}

		} else if (num2 > num1 && num2 > num3) {
			max = num2;
			if (num1 > num3) {
				mid = num1;
				min = num3;
			} else {
				mid = num3;
				min = num1;
			}

		} else if (num3 > num1 && num3 > num2) {
			max = num3;
			if (num1 > num2) {
				mid = num1;
				min = num2;
			} else {
				mid = num2;
				min = num1;
			}
		}

		System.out.println("가장 큰 값: " + max);
		System.out.println("중간 값: " + mid);
		System.out.println("가장 작은 값: " + min);
		System.out.println("^^");

	}
}
