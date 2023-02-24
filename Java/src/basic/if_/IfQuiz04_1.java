package basic.if_;

import java.util.Scanner;

public class IfQuiz04_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1 : ");
		int num1 = sc.nextInt();
		System.out.println("정수2 : ");
		int num2 = sc.nextInt();
		System.out.println("정수3 : ");
		int num3 =sc.nextInt();
		
		int max;
		int mid;
		int min;
		
		if(num1 > num2 && num1 > num3) {
			max = num1;
			if(num2 > num3) {
				mid = num2; 
				min = num3;
			}
		} else if(num2 > num1 && num2 > num3){
			max = num2;
			if(num1 > num3) {
				mid = num1;
				min = num3;
			} 
			
		} else {
			max = num3;
			if(num2 > num1) {
				mid = num2;
				min = num1;
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("중간값 : " + mid);
		System.out.println("최솟값 : " + min);
	}
}