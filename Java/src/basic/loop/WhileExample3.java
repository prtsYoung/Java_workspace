package basic.loop;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		
		/*
		 -정수 1개를 입력받아서 해당 정수가 소수인지를 판별하면 된다.
		 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		int num2=1; //(begin 값)
		int total=0; //나누어 떨어진 횟수를 기억할 변수
		while(num2<=num) {
			if(num % num2 == 0) {
				total++;
			} num2++;
		}
		if(total ==2) {System.out.println("소수입니다.");
		}else {
		System.out.println("소수가 아닙니다.");
		}
		System.out.println("--------------------------------");
		
		int j =2; //1은 모든 수의 약수이기 때문에 배제합니다.
		while(num % j !=0) {
			j++;
		}
		System.out.println(num == j ? "소수입니다." : "소수가 아닙니다.");
		
		
		
		
		
		
		
	}
}
