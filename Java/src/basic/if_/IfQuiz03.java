package basic.if_;

import java.util.Scanner;

public class IfQuiz03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		if(a == 0) {
			System.out.print("0입니다."); }
		else if(a % 7 == 0) {
			System.out.print("7의 배수입니다.");
		} else {
			System.out.print("7의 배수가 아닙니다."); 
		} 	System.out.println("^-^");
		
		sc.close();
	} 
	}
		

